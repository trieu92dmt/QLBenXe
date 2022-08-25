/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlbx.pojo;

import java.math.BigInteger;

/**
 *
 * @author ASUS
 */
public class CompanyCart {
    private int tripId;
    private String seatNumber;
    private BigInteger price;

    /**
     * @return the tripId
     */
    public int getTripId() {
        return tripId;
    }

    /**
     * @param tripId the tripId to set
     */
    public void setTripId(int tripId) {
        this.tripId = tripId;
    }

    /**
     * @return the seatNumber
     */
    public String getSeatNumber() {
        return seatNumber;
    }

    /**
     * @param seatNumber the seatNumber to set
     */
    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    /**
     * @return the price
     */
    public BigInteger getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(BigInteger price) {
        this.price = price;
    }
}
