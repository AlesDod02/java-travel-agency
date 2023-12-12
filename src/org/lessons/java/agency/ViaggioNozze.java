package org.lessons.java.agency;

import java.time.LocalDate;
import java.util.List;

public class ViaggioNozze extends Vacanza{
    private boolean trattamenti;

    public ViaggioNozze(String destination, LocalDate startDate, LocalDate endDate, List<Escursione>escursioni,boolean trattamenti) throws IllegalArgumentException {
        super(destination, startDate, endDate,escursioni);
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


    public void getPrenotation() {
        System.out.println("hai prenotato un viaggio di nozze");getSpecials();
    }
}
