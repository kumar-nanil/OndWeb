package com.ond.web.domain;

/**
 * Created by vdraj on 7/17/2016.
 */
public class DealOfTheDay {

    private String product;
    private String imageURL;
    private String price;

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "DealOfTheDay{" +
                "product='" + product + '\'' +
                ", imageURL='" + imageURL + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
