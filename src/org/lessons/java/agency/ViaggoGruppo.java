package org.lessons.java.agency;

import java.time.LocalDate;
import java.util.List;

public class ViaggoGruppo extends Vacanza{

    private int numeroPartecipanti;
    private int rangeStart;
    private int rangeEnd;

    public ViaggoGruppo(String destinazione, LocalDate dataInizio, LocalDate dataFine, List<Escursione> escursioni, int numeroPartecipanti, int rangeStart, int rangeEnd) throws IllegalArgumentException {
        super(destinazione,dataInizio,dataFine,escursioni);
        if (numeroPartecipanti <= 0){
            System.out.println("non hai aggiunto un numero di partecipanti valido");

        }
        if (rangeStart<=0){
            System.out.println("non hai aggiunto un'età valida");

        }
        if (rangeEnd<= rangeStart){
            System.out.println("non hai aggiunto un'età valida");

        }
        this.numeroPartecipanti = numeroPartecipanti;
        this.rangeStart = rangeStart;
        this.rangeEnd = rangeEnd;
    }

    // Costruttore per la classe ViaggioGruppo




    // Getter e setter
    public int getNumeroPartecipanti() {
        return numeroPartecipanti;
    }

    public void setNumeroPartecipanti(int numeroPartecipanti) {
        this.numeroPartecipanti = numeroPartecipanti;
    }

    // Getter e setter fascia età
    public int getRangeStart() {
        return rangeStart;
    }

    public void setRangeStart(int rangeStart) {
        this.rangeStart = rangeStart;
    }

    // Getter e setter per la fine della fascia d'età
    public int getRangeEnd() {
        return rangeEnd;
    }

    public void setRangeEnd(int rangeEnd) {
        this.rangeEnd = rangeEnd;
    }


    public void getPrenotation() {
        System.out.println("hai scelto il viaggio di gruppo per: "+ getNumeroPartecipanti()+ " con fascia di età compresa tra"+ getRangeStart()+ " anni-"+ getRangeEnd() + " anni" );;

    }
}



