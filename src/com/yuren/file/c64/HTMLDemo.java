package com.yuren.file.c64;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-07-08 01:34
 */
public class HTMLDemo {

    public static void parseHTMLFile() throws IOException {
        Document doc = Jsoup.parse(new File("data/c64/articles.html"), "UTF-8");
//      String url = "http://www.cnblogs.com/swiftma/p/5631311.html";
//      Document doc = Jsoup.connect(url).get();
        Elements elements = doc.select("#cnblogs_post_body p a");
        for (Element e : elements) {
            String title = e.text();
            String href = e.attr("href");
            System.out.println(title + ", " + href);
        }
    }

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        parseHTMLFile();

    }

}
