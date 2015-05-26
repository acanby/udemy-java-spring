package com.canby.spring.web.dao;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Created by acanby on 3/03/2015.
 */
public class Offer {

    int id;

    @NotNull
    @Pattern(regexp = "\\w+@\\w+\\.\\w+")
    String email;

    @Size(min = 3, max = 20, message = "You need a name between 3 and 20 chars")
    String name;

    @Size(min = 20, max = 3000)
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
