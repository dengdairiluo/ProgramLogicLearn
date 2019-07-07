package com.yuren.file.c63;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Date;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-07-08 01:16
 */
public class DateDemo {

    public static void save() throws IOException {
        MyDate date = new MyDate();
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(System.out, date);

    }

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        save();

    }

    static class MyDate {
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
        public Date date = new Date();
    }

}
