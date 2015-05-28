package com.canby.spring.web.dao;

import com.canby.spring.web.annotations.ValidEmail;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by acanby on 3/03/2015.
 */
public class Offer {

    int id;

    @NotNull
    @ValidEmail
    String email;

    @Size(min = 3, max = 20, message = "You need a name between 3 and 20 chars")
    String name;

    @Size(min = 20, max = 3000, message = "Provide some offer text")
    String offerText;

    public Offer() {
    }

    public Offer(String name, String email, String offerText) {
        this.email = email;
        this.name = name;
        this.offerText = offerText;
    }

    public Offer(int id, String name, String email, String offerText) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.offerText = offerText;
    }



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
