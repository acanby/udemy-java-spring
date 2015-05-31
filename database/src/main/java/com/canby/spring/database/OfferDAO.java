package com.canby.spring.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by acanby on 3/03/2015.
 */
@Component("offersDao")
public class OfferDAO {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    List<Offer> getOffers() {
        return jdbcTemplate.query("select * from offer", new RowMapper<Offer>() {
            @Override
            public Offer mapRow(ResultSet resultSet, int i) throws SQLException {
                Offer newOffer = new Offer();

                newOffer.setEmail(resultSet.getString("email"));
                newOffer.setName(resultSet.getString("name"));
                newOffer.setId(resultSet.getInt("id"));
                newOffer.setOfferText(resultSet.getString("offer_text"));

                return newOffer;
            }
        });
    }
}
