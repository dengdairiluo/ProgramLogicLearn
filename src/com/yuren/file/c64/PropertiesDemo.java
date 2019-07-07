package com.yuren.file.c64;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-07-08 01:35
 */
public class PropertiesDemo {

    /**
     * @param args
     * @throws IOException
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Properties prop = new Properties();
        prop.load(new FileInputStream("data/c64/config.properties"));
        String host = prop.getProperty("db.host");
        int port = Integer.valueOf(prop.getProperty("db.port", "3306"));

        System.out.println("host: " + host);
        System.out.println("port: " + port);

    }

}
