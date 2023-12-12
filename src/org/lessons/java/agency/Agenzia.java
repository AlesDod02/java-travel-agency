package org.lessons.java.agency;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenzia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vacanza> elencoVacanze = new ArrayList<>();


        boolean stop = false;

        while (!stop) {
            System.out.println("Vuoi aggiungere una vacanza? (1: Sì, 0: No)");
            int scelta = Integer.parseInt(scanner.nextLine());


            if (scelta == 0) {
                stop = true;
            }
            // L'utente esce dal programma
            else {

                // L'utente compila i parametri
                System.out.println("Inserisci la destinazione");
                String destination = scanner.nextLine();

                System.out.println("Inserisci la data di partenza (yyyy-mm-dd)");
                String startDate = scanner.nextLine();
                LocalDate startPartenza = LocalDate.parse(startDate);

                System.out.println("Inserisci la data del ritorno (yyyy-mm-dd");
                String endDate = scanner.nextLine();
                LocalDate endRitorno = LocalDate.parse((endDate));
                try {
                    Vacanza nuovaVacanza = new Vacanza(destination, startPartenza, endRitorno);
                    nuovaVacanza.getPrenotation();
                    elencoVacanze.add(nuovaVacanza);
                } catch (IllegalArgumentException e) {
                    System.out.println("invalid data :" + e.getMessage());
                }


            }
        }
        System.out.println("Elenco delle vacanze prenotate:");
        for (Vacanza vacanza : elencoVacanze) {
            vacanza.getPrenotation();
        }


        scanner.close();
    }
}
