package com.ond.web.controllers;

import com.ond.web.domain.DealOfTheDay;
import com.ond.web.domain.flipkart.FlipkartDealOfTheDay;
import com.ond.web.repository.FlipkartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by vdraj on 7/17/2016.
 */
@RestController
@EnableAutoConfiguration
public class DealOfTheDayController {

    @Autowired
    private FlipkartRepository flipkartRepository;

    @RequestMapping(value="/dealsoftheday", method = RequestMethod.GET)
    public String printHello() {
        return flipkartRepository.getDealsOfTheDay().toString();
    }
}
