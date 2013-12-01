package com.petrpopov.opennlprus.main;

import com.petrpopov.opennlprus.service.CrawlerManager;
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

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"spring/applicationContext.xml"}, true);


        /*WebMessage message = new WebMessage("http://ya.ru", "Власти Москвы и Саратова решили расширять границы столицы и приняли решение" +
                " о принудительном сексе и сну-сну среди населения.");

        WebMessage message1 = new WebMessage("http://www.ru", "asfasfaf");

        LuceneService luceneService = context.getBean(LuceneService.class);
        luceneService.addDocument(message);
        luceneService.addDocument(message1);

        luceneService.search("Москва");*/


        List<String> urls = new ArrayList<String>();
        urls.add("http://ria.ru/");

        CrawlerManager manager = context.getBean(CrawlerManager.class);
        manager.start(urls);
    }
}
