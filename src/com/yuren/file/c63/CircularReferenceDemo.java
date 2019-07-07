package com.yuren.file.c63;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-07-08 01:17
 */
public class CircularReferenceDemo {

    public static void test() throws IOException {
        Parent parent = new Parent();
        parent.name = "老马";
        Child child = new Child();
        child.name = "小马";
        parent.child = child;
        child.parent = parent;

        ObjectMapper mapper = new XmlMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        String str = mapper.writeValueAsString(parent);
        System.out.println(str);

        Parent parent2 = mapper.readValue(str, Parent.class);
        System.out.println(parent2.child.parent.name);
    }

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        test();

    }

    static class Parent {
        public String name;

        @JsonManagedReference
        public Child child;
    }

    static class Child {
        public String name;

        @JsonBackReference
        public Parent parent;
    }

}
