package com.petrpopov.opennlprus.main;

import com.petrpopov.opennlprus.crawl.CrawlerManager;
import com.petrpopov.opennlprus.service.SearchServerService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * User: petrpopov
 * Date: 26.11.13
 * Time: 21:30
 */
public class App {

    public static void main(String[] args) throws Exception {

        crawl();
    }

    private static void search() {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"spring/applicationContext.xml"}, true);


        SearchServerService search = context.getBean(SearchServerService.class);
        search.search("Минск");

    }

    private static void analyze() {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"spring/applicationContext.xml"}, true);
    }

    private static void crawl() throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"spring/applicationContext.xml"}, true);

        List<String> urls = new ArrayList<String>();
      //  urls.add("http://ria.ru/");
        urls.add("http://www.the-village.ru/");
        urls.add("http://bg.ru/");
        urls.add("http://www.furfurmag.ru/");
        urls.add("http://www.wonderzine.com/");
        urls.add("http://www.afisha.ru/");
        urls.add("http://lenta.ru/");
        urls.add("http://rbc.ru/");
        urls.add("http://www.bfm.ru/");
        urls.add("http://www.gazeta.ru/");
        urls.add("http://www.bbc.co.uk/russian");
        urls.add("http://www.kp.ru/");
        urls.add("http://www.interfax.ru/");
        urls.add("http://dni.ru/");
        urls.add("http://www.rg.ru/");

        CrawlerManager manager = context.getBean(CrawlerManager.class);
        manager.start(urls);
    }
}
