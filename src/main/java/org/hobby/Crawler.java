/**
 *
 */
package org.hobby;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

public class Crawler {

    public static void main(String[] args) {
        HttpResponse<String> response = Unirest.get("https://www.glassdoor.com/Interview/LinkedIn-Interview-Questions-E34865.htm").asString();
        System.out.print(response.getBody());

    }

}
