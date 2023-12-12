package org.lessons.java.agency;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.math.RoundingMode;


import static java.time.temporal.ChronoUnit.DAYS;

public class Vacanza {
    //ATTRIBUTI
    private String destination;

    private LocalDate startDate;

    private LocalDate endDate;

    private LocalDate currentDate= LocalDate.now();

    private List<Escursione>escursioni;


    public Vacanza(String destination, LocalDate startDate, LocalDate endDate, List<Escursione>escursioni) throws IllegalArgumentException{
        if (destination.equals(null)){throw new IllegalArgumentException("devi inserire una destinazione valida");
        }
        if (startDate == null || startDate.isBefore(currentDate)){throw new IllegalArgumentException("devi inserire una data valida");}
        if (endDate == null || endDate.isBefore(startDate)){throw new IllegalArgumentException("non devi inserire una data antecedente alla data di partenza");}
        this.destination = destination;
        this.startDate = startDate;
        this.endDate = endDate;
        this.escursioni=escursioni;
    }


    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public long getDaysDuration() {
        return DAYS.between(startDate, endDate);

    }

    public String getStringDayDuration(){
        return String.valueOf(getDaysDuration());
    }

    public List<Escursione> getEscursioni() {
        return escursioni;
    }

    public void setEscursioni(List<Escursione> escursioni) {
        this.escursioni = escursioni;
    }

    @Override
    public String toString() {
        return "Perfetto hai prenotato una vacanza per :"+ destination+" di: "+ getDaysDuration()+ " giorni";
    }
    public void  stampEscursioni(){
        for (Escursione element: escursioni){
            element.getSingleEscursione();
        }
    }

    public BigDecimal totalEscursionPrice(){
        BigDecimal totalPrice = BigDecimal.ZERO;
        for (Escursione element:escursioni){
            totalPrice = totalPrice.add(element.getPriceEscursione()).setScale(2, RoundingMode.HALF_DOWN);
        }
        return totalPrice;
    }
    public void  totalPriceString(){
        System.out.println("il costo totale delle tue escursioni è :"+ totalEscursionPrice());
    }
    }

