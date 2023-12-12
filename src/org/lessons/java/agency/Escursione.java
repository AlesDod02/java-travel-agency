package org.lessons.java.agency;

import java.math.BigDecimal;

public class Escursione {
    private String city;
    private int time;

    private BigDecimal priceXHour;

    public Escursione(String city, int time, BigDecimal priceXHour) {
        this.city = city;
        this.time = time;
        this.priceXHour = priceXHour;
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

    public BigDecimal getPriceXHour() {
        return priceXHour;
    }

    public void setPriceXHour(BigDecimal priceXHour) {
        this.priceXHour = priceXHour;
    }


    public BigDecimal getPriceEscursione() {
        BigDecimal newTime = BigDecimal.valueOf(time);

        BigDecimal totalPrice1 = priceXHour.multiply(newTime);
        return totalPrice1;
    }
}
