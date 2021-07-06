package com.ahc.Interface;

import com.ahc.Domain.AHC;
import com.ahc.Domain.CameraDaPulire;

import java.io.DataInput;
import java.util.Scanner;

public class AHC_Console {
    private Scanner input;
    private CameraDaPulire cameraDaPulire;

    public void start(){
        AHC ahc = new AHC();
        ahc.inizializzaSistema();
        //ahc.testStampa();
        System.out.println("/*********************APP AMAZING HOTEL & CAMPER*********************/");
        System.out.println("Benvenuto su Amazing Hotel & Camper!");
        input = new Scanner(System.in);
        while(true) {
            System.out.println("\nSeleziona Client");
            System.out.println("\n1: Addetto del sistema");
            System.out.println("\n2: Addetto delle pulizie");
            //TODO aggiunta sezione cliente per la seconda iterazione
            // System.out.println("\n3: Cliente");
            System.out.println("\n0: Esci");
            System.out.println("\nNumero ----->>>>: ");
            int selezioneClient = Integer.parseInt(input.next().trim());
            switch (selezioneClient) {
                /*********************USCITA APP*********************/
                case 0:
                    System.exit(0);
                    break;
                /*********************ADDETTO DEL SISTEMA*********************/
                case 1:
                    System.out.println("\nBenvenuto Addetto del sistema!");
                    input = new Scanner(System.in);
                    System.out.println("\nSeleziona un'operazione");
                    System.out.println("\n1: Gestisci camera");
                    System.out.println("\n2: Verifica disponibilità camera");
                    System.out.println("\n0: Esci");
                    System.out.println("\nNumero ----->>>>: ");
                    int selezioneAddettoSistema = Integer.parseInt(input.next().trim());
                    switch (selezioneAddettoSistema) {
                        case 0:
                            break;
                        case 1:
                            System.out.println("\nHai scelto l'operazione 1: Gestisci camera");
                            System.out.println("\nInserisci una nuova Camera. ");
                            System.out.println("\nInserisci il numero della nuova Camera: ");
                            int numCamera1 = Integer.parseInt(input.next().trim());
                            input.nextLine();
                            System.out.println("\nInserisci il numero dei posti letto della nuova Camera: ");
                            int numPostiLetto = Integer.parseInt(input.next().trim());
                            input.nextLine();
                            System.out.println("\nInserisci una descrizione della nuova Camera: ");
                            String desc = input.nextLine();
                            ahc.inserisciNuovoTipoCamera(numCamera1, numPostiLetto, desc);
                            System.out.println("\nInserisci un prezzo base della nuova Camera: ");
                            double prezzo = Double.parseDouble(input.next().trim());
                            input.nextLine();
                            ahc.definisciPrezzoCamera(prezzo);
                            System.out.println("\nConfermi i dati inseriti? Si o No");
                            String yesOrNo = input.next();
                            if (yesOrNo.equals("Si")){
                                ahc.confermaTipoCamera();
                            }
                            else {
                                break;
                            }
                            System.out.println("\nNuova camera inserita!");
                            break;
                        case 2:
                            System.out.println("\nHai scelto l'operazione 2: Verifica disponibilità camera!");
                            System.out.println("\nInserisci il numero della camera da verificare: ");
                            int numCamera2 = input.nextInt();
                            if (!ahc.verificaCheck_out(numCamera2)){
                                System.out.println("\nProblemi riscontrati nella verifica! Riprova. ");
                                break;
                            }
                            if (!ahc.verificaFinePulizia(numCamera2)){
                                System.out.println("\nProblemi riscontrati nella verifica! Riprova. ");
                                break;
                            }
                            System.out.println("\nRegistra il check-in!");
                            System.out.println("\ninserisci il nome del Cliente!");
                            String nomeCliente = input.next();
                            System.out.println("\ninserisci il cognome del Cliente!");
                            String cognomeCliente = input.next();
                            System.out.println("\ninserisci il CF del Cliente!");
                            String CF = input.next();
                            System.out.println("\nInserisci la data del check-in [gg/mm/yyyy]: ");
                            String data = input.nextLine();
                            System.out.println("\nInserisci l'orario del check-in [hh:mm:ss]: ");
                            String orario = input.nextLine();
                            ahc.registraCheck_in(nomeCliente, cognomeCliente, CF, data, orario, numCamera2);
                            break;
                        default:
                            System.out.println("\nOperazione non esistente!");
                            break;
                    }
                /*********************ADDETTO DELLE PULIZIE*********************/
                case 2:
                    System.out.println("\nBenvenuto Addetto delle pulizie!");
                    input = new Scanner(System.in);
                    System.out.println("\nSeleziona un'operazione");
                    System.out.println("\n1: Pulisci camera");
                    System.out.println("\n0: Esci");
                    System.out.println("\nNumero ----->>>>: ");
                    int selezioneAddettoPulizie = input.nextInt();
                    switch (selezioneAddettoPulizie) {
                        case 0:
                            break;
                        case 1:
                            System.out.println("\nHai scelto l'operazione 1: Pulisci camera");
                            System.out.println("\nEcco l'lenco delle cmare da pulire: ");
                            ahc.visualizzaCameraDaPulire();
                            System.out.println("\nSeleziona il numero della camera che desideri pulire: ");
                            int numeroCameraDaPulire = input.nextInt();
                            cameraDaPulire = ahc.selezionaCameraDaPulire(numeroCameraDaPulire);
                            System.out.println("\nRegistra la fine della pulizia!");
                            ahc.registraFinePulizia(cameraDaPulire);
                            break;
                        default:
                            System.out.println("\nOperazione non esistente!");
                            break;
                    }
                /*********************CLIENTE*********************/
                //TODO sezione relativa al cliente prevista per la seconda iterazione
/*
                case 3:
                    System.out.println("Benvenuto Cliente!");
                    input = new Scanner(System.in);
                    System.out.println("\nSeleziona un'operazione");
                    System.out.println("0: Esci");
                    System.out.println("\nNumero ----->>>>: ");
                    int selezioneCliente = input.nextInt();
                    switch (selezioneCliente){
                        case 0:
                            break;
                        default:
                            System.out.println("Operazione non esistente!");
                            break;

*/
                default:
                    System.out.println("\nOperazione non esistente!");
                    break;
            }
        }
    }
}
