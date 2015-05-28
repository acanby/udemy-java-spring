package com.canby.spring.web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by acanby on 3/03/2015.
 */
@Component("offersDao")
public class OfferDAO {

    private NamedParameterJdbcTemplate jdbcTemplate;
    private RowMapper<Offer> offerRowMapper = (resultSet, i) -> {
        Offer newOffer = new Offer();

        newOffer.setEmail(resultSet.getString("email"));
        newOffer.setName(resultSet.getString("name"));
        newOffer.setId(resultSet.getInt("id"));
        newOffer.setOfferText(resultSet.getString("offer_text"));

        return newOffer;
    };

    public OfferDAO() {
        System.out.println("Loaded offersDAO");
    }

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List<Offer> getOffers() {
        return jdbcTemplate.query("select * from offer", offerRowMapper);
    }

    public Offer getOffer(int id) {
        MapSqlParameterSource params = new MapSqlParameterSource("id", id);

        return jdbcTemplate.queryForObject("select * from offer where id_old = :id", params, offerRowMapper);
    }

    public boolean delete(int id) {
        MapSqlParameterSource params = new MapSqlParameterSource("id", id);

        return jdbcTemplate.update("DELETE FROM offer WHERE id_old = :id", params) == 1;
    }

    public boolean create(Offer offer) {
        BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(offer);

        return jdbcTemplate.update("INSERT INTO offer (name, email, offer_text) VALUES (:name, :email, :offerText)", params) == 1;
    }
}
