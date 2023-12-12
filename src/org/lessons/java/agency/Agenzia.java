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
            System.out.println("Che tipo di viaggio vuoi aggiungere? (1: Viaggio generico, 2: Viaggio di Nozze, 3: Viaggio di Gruppo, 0: Esci)");
            int scelta = Integer.parseInt(scanner.nextLine());


            if (scelta == 0) {
                stop = true;
            }
            // L'utente esce dal programma
            else {
                switch (scelta) {
                    case 1:
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

                    case 2:

                        System.out.println("Inserisci la destinazione");
                        String destinationNozze = scanner.nextLine();

                        System.out.println("Inserisci la data di partenza (yyyy-mm-dd)");
                        String startDateNozze = scanner.nextLine();
                        LocalDate startPartenzaNozze = LocalDate.parse(startDateNozze);

                        System.out.println("Inserisci la data del ritorno (yyyy-mm-dd");
                        String endDateNozze = scanner.nextLine();
                        LocalDate endRitornoNozze = LocalDate.parse((endDateNozze));
                        System.out.println("vuoi i trattamenti speciali ? y/n");
                        String sceltaTrattamenti = scanner.nextLine();
                        boolean trattamenti;
                        if (sceltaTrattamenti == "y") {
                            trattamenti = true;

                        } else {
                            trattamenti = false;
                        }
                        try {
                            ViaggioNozze viaggioNozze = new ViaggioNozze(destinationNozze, startPartenzaNozze, endRitornoNozze, trattamenti);
                            viaggioNozze.getPrenotation();
                            elencoVacanze.add(viaggioNozze);
                        } catch (IllegalArgumentException e) {
                            System.out.println("invalid data :" + e.getMessage());
                        }
                    case 3:
                        System.out.println("Inserisci la destinazione");
                        String destinationGruppo = scanner.nextLine();

                        System.out.println("Inserisci la data di partenza (yyyy-mm-dd)");
                        String startDateGruppo = scanner.nextLine();
                        LocalDate startPartenzaGruppo = LocalDate.parse(startDateGruppo);

                        System.out.println("Inserisci la data del ritorno (yyyy-mm-dd");
                        String endDateGruppo = scanner.nextLine();
                        LocalDate endRitornoGruppo = LocalDate.parse((endDateGruppo));

                        System.out.println("inserisci il numero di partecipanti");
                        int numberPeople = Integer.parseInt(scanner.nextLine());
                        System.out.println("inserisci la fascia di età iniziale");
                        int rangeStart = Integer.parseInt(scanner.nextLine());
                        System.out.println("inserisci la fascia di età finale");
                        int rangeEnd = Integer.parseInt(scanner.nextLine());
                        try {
                            ViaggoGruppo newViaggioGruppo = new ViaggoGruppo(destinationGruppo, startPartenzaGruppo, endRitornoGruppo, numberPeople, rangeStart, rangeEnd);
                            newViaggioGruppo.getPrenotation();
                            elencoVacanze.add(newViaggioGruppo);
                        } catch (IllegalArgumentException e) {
                            System.out.println("invalid data :" + e.getMessage());
                        }


                }
            }


        }System.out.println("Elenco delle vacanze prenotate:");
        for(Vacanza vacanza:elencoVacanze){
            vacanza.getPrenotation();
        }


        scanner.close();
    }

}

// L'utente compila i parametri



