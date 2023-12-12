package org.lessons.java.agency;

import java.math.BigDecimal;

public class Escursione {
    private String city;
    private int time;

    private BigDecimal price;

    public Escursione(String city, int time, BigDecimal price) {
        this.city = city;
        this.time = time;
        this.price = price;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


}
