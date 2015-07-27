package com.canby.spring.web.service;

import com.canby.spring.web.dao.Offer;
import com.canby.spring.web.dao.OfferDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by acanby on 17/03/2015.
 */
@Service("offersService")
public class OffersService {

    private final OfferDao offerDAO;

    public OffersService() {
        this(null);
    }

    @Autowired
    public OffersService(OfferDao offerDAO) {
        this.offerDAO = offerDAO;
    }

    public List<Offer> getCurrent() {
        return offerDAO.getOffers();
    }

    public Offer getOffer(int id) {
        return offerDAO.getOffer(id);
    }

    public boolean delete(int id) {
        return offerDAO.delete(id);
    }

    @Secured({"ROLE_ADMIN", "ROLE_USER"})
    public void create(Offer offer) {
        offerDAO.create(offer);
    }
}
