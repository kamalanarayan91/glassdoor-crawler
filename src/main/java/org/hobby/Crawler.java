/**
 *
 */
package org.hobby;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawler {

    public static void main(String[] args) {
        HttpResponse<String> response = Unirest.get("https://www.glassdoor.com/Interview/LinkedIn-Interview-Questions-E34865.htm").asString();
        System.out.print(response.getBody());

        Document document = Jsoup.parse(response.getBody());
        for (String className : document.body().classNames()) {
            System.out.println("Class:" + className);
        }
        Elements interviewDetails =  document.body().getElementsByClass("interviewDetails");
        Elements positions = document.body().getElementsByClass("reviewer");
        Elements reviews = document.body().getElementsByClass(" empReview cf ");
    }

}
