package com.canby.spring.database;

/**
 * Created by acanby on 3/03/2015.
 */
public class Offer {

    int id;
    String email;
    String name;
    String offerText;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOfferText() {
        return offerText;
    }

    public void setOfferText(String offerText) {
        this.offerText = offerText;
    }

    @Override
    public String toString() {
        return "Offer{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", offerText='" + offerText + '\'' +
                '}';
    }
}
