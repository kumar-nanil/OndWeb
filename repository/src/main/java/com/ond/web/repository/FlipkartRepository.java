package com.ond.web.repository;

import com.ond.web.domain.flipkart.FlipkartDealOfTheDay;
import com.ond.web.restclient.FlipkartRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;

/**
 * Created by vdraj on 7/17/2016.
 */
public class FlipkartRepository {

    @Autowired
    private FlipkartRestClient flipkartRestClient;

    public FlipkartDealOfTheDay getDealsOfTheDay() {
        return flipkartRestClient.getDealsOfTheDay();
    }
}
