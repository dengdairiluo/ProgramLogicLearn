package com.yuren.file.c63;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-07-08 01:16
 */
public class ListDemo {

    public static void writeStudents() throws IOException {
        List<Student> students = Arrays.asList(new Student("张三", 18, 80.9d), new Student("李四", 17, 67.5d));
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        String str = mapper.writeValueAsString(students);
        mapper.writeValue(new File("students.json"), students);
        System.out.println(str);
    }

    public static void readStudents() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<Student> list = mapper.readValue(new File("students.json"),
                new TypeReference<List<Student>>() {
                });
        System.out.println(list.toString());
    }

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        writeStudents();
        readStudents();

    }

}
