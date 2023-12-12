package org.lessons.java.agency;

import java.time.LocalDate;

public class ViaggioNozze extends Vacanza{
    private boolean trattamenti;

    public ViaggioNozze(String destination, LocalDate startDate, LocalDate endDate,boolean trattamenti) throws IllegalArgumentException {
        super(destination, startDate, endDate);
        this.trattamenti=trattamenti;
    }

    public boolean isTrattamenti() {
        return trattamenti;
    }

    public void setTrattamenti(boolean trattamenti) {
        this.trattamenti = trattamenti;
    }

    public void getSpecials(){
        if (trattamenti=true){
            System.out.println("hai aggiunto i trattamenti");
        }
        else {
            System.out.println("non hai aggiunto i trattamenti");
        }
    }

    @Override
    public void getPrenotation() {
        System.out.println("hai prenotato un viaggio di nozze");getSpecials();super.getPrenotation();
    }
}
