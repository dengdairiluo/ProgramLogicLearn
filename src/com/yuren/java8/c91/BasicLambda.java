package com.yuren.java8.c91;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-09-23 21:08
 */
public class BasicLambda {

    public static void main(String[] args) {
        File f = new File(".");
//		File[] files = f.listFiles((File dir, String name) -> {
//		    if (name.endsWith(".txt")) {
//		        return true;
//		    }
//		    return false;
//		});
//		
//		File[] files = f.listFiles((File dir, String name) -> {
//		    return name.endsWith(".txt");
//		});
//		
//		File[] files = f.listFiles((File dir, String name) -> name.endsWith(".txt"));

        File[] files = f.listFiles((dir, name) -> name.endsWith(".txt"));

        Arrays.sort(files, Comparator.comparing(File::getName));

        ExecutorService executor = Executors.newFixedThreadPool(100);
        executor.submit(() -> System.out.println("hello"));

    }

}
