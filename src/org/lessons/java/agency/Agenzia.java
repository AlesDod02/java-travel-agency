package org.lessons.java.agency;

import java.math.BigDecimal;
import java.text.DecimalFormat;
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
                        List<Escursione> elencoEscursioni = new ArrayList<>();

                        boolean stop1 = false;
                        while (!stop1) {
                            System.out.println("vuoi aggiungere un'escursione ?y/n");
                            String answerEscursione = scanner.nextLine();

                            if (answerEscursione.equals("y")) {
                                System.out.println("in che città vuoi andare ?");
                                String city = scanner.nextLine();
                                System.out.println("quanto costa quella città?");
                                BigDecimal cityPrice = new BigDecimal(scanner.nextLine());
                                System.out.println("quante ore vuoi rimanere in questa città?");
                                int hours = Integer.parseInt(scanner.nextLine());
                                Escursione escursione = new Escursione(city, hours, cityPrice);

                                elencoEscursioni.add(escursione);
                                System.out.println(escursione);


                            } else if (answerEscursione.equals("n")){
                                System.out.println("va bene non hai aggiunto una escursione per questo viaggio");
                                stop1 = true;
                            }
                            else {
                                System.out.println("riposta non valida riprova");
                            }
                        }
                        try {
                            Vacanza nuovaVacanza = new Vacanza(destination, startPartenza, endRitorno,elencoEscursioni);
                            System.out.println(nuovaVacanza);
                            elencoVacanze.add(nuovaVacanza);
                        } catch (IllegalArgumentException e) {
                            System.out.println("invalid data :" + e.getMessage());
                        }
                        break;

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
                        if (sceltaTrattamenti.equals("y")) {
                            trattamenti = true;

                        } else {
                            trattamenti = false;
                        }
                        List<Escursione> elencoEscursioni2 = new ArrayList<>();

                        boolean stop2 = false;
                        while (!stop2) {
                            System.out.println("vuoi aggiungere un'escursione ?y/n");
                            String answerEscursione2 = scanner.nextLine();

                            if (answerEscursione2.equals("y")) {
                                System.out.println("in che città vuoi andare ?");
                                String city = scanner.nextLine();
                                System.out.println("quanto costa quella città?");
                                BigDecimal cityPrice = new BigDecimal(scanner.nextLine());
                                System.out.println("quante ore vuoi rimanere in questa città?");
                                int hours = Integer.parseInt(scanner.nextLine());
                                Escursione escursione = new Escursione(city, hours, cityPrice);
                                elencoEscursioni2.add(escursione);
                                System.out.println(escursione);


                            } else if (answerEscursione2.equals("n")){
                                System.out.println("va bene non hai aggiunto una escursione per questo viaggio");
                                stop2 = true;
                            }
                            else {
                                System.out.println("riposta non valida riprova");
                            }
                        }
                        try {
                            ViaggioNozze viaggioNozze = new ViaggioNozze(destinationNozze, startPartenzaNozze, endRitornoNozze,elencoEscursioni2, trattamenti);
                            System.out.println(viaggioNozze);
                            elencoVacanze.add(viaggioNozze);
                        } catch (IllegalArgumentException e) {
                            System.out.println("invalid data :" + e.getMessage());
                        }
                        break;
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
                        List<Escursione> elencoEscursioni3 = new ArrayList<>();
                        boolean stop3 = false;
                        while (!stop3) {
                            System.out.println("vuoi aggiungere un'escursione ?y/n");
                            String answerEscursione3 = scanner.nextLine();

                            if (answerEscursione3.equals("y")) {
                                System.out.println("in che città vuoi andare ?");
                                String city = scanner.nextLine();
                                System.out.println("quanto costa quella città?");
                                BigDecimal cityPrice = new BigDecimal(scanner.nextLine());
                                System.out.println("quante ore vuoi rimanere in questa città?");
                                int hours = Integer.parseInt(scanner.nextLine());
                                Escursione escursione = new Escursione(city, hours, cityPrice);
                                elencoEscursioni3.add(escursione);
                                System.out.println(escursione);


                            } else if (answerEscursione3.equals("n")){
                                System.out.println("va bene non hai aggiunto una escursione per questo viaggio");
                                stop3 = true;
                            }
                            else {
                                System.out.println("riposta non valida riprova");
                            }
                        }
                        try {
                            ViaggoGruppo newViaggioGruppo = new ViaggoGruppo(destinationGruppo, startPartenzaGruppo, endRitornoGruppo,elencoEscursioni3, numberPeople, rangeStart, rangeEnd);
                            System.out.println(newViaggioGruppo);
                            elencoVacanze.add(newViaggioGruppo);
                        } catch (IllegalArgumentException e) {
                            System.out.println("invalid data :" + e.getMessage());
                        }
                        break;
                    default:
                        System.out.println("Scelta non valida. Riprova.");
                        break;


                }
            }


        }
        System.out.println("Elenco delle vacanze prenotate:");
        for (Vacanza vacanza : elencoVacanze) {
            System.out.println(vacanza);
            vacanza.stampEscursioni();
        }


        scanner.close();
    }

}

// L'utente compila i parametri



