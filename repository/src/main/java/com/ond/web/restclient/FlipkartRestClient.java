package com.ond.web.restclient;

import com.ond.web.domain.flipkart.FlipkartDealOfTheDay;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Created by vdraj on 7/17/2016.
 */
public class FlipkartRestClient {

    private static final String FLIPKART_DEALS_OF_THE_DAY = "https://affiliate-api.flipkart.net/affiliate/offers/v1/dotd/json";

    RestTemplate restTemplate = new RestTemplate();
    HttpHeaders headers = new HttpHeaders();
    HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

    public void initialize() {
        headers.set("Fk-Affiliate-Id", "kumarnani");
        headers.set("Fk-Affiliate-Token", "02cf530200a8437c8db5517d572d8662");
    }

    public FlipkartDealOfTheDay getDealsOfTheDay() {
        ResponseEntity<FlipkartDealOfTheDay> value = restTemplate.exchange(FLIPKART_DEALS_OF_THE_DAY, HttpMethod.GET,
                                                                           entity, FlipkartDealOfTheDay.class);
        return value.getBody();
    }

}
