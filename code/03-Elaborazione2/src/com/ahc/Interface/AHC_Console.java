package com.ahc.Interface;

import com.ahc.Domain.*;

import java.time.LocalDate;
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
            System.out.println("\n3: Cliente");
            System.out.println("\n0: Esci");
            System.out.println("\nNumero ----->>>>: ");
            int selezioneClient = Integer.parseInt(input.next().trim());
            switch (selezioneClient) {
                /*********************USCITA APP*********************/
                case 0:
                    System.out.println("Exit");
                    System.exit(0);
                    break;
                /*********************ADDETTO DEL SISTEMA*********************/
                case 1:
                    menuAddettoSistema(ahc);
                    break;
                /*********************ADDETTO DELLE PULIZIE*********************/
                case 2:
                    menuAddettoPulizie(ahc);
                /*********************CLIENTE*********************/
                case 3:
                    menuCliente(ahc);
                /*********************OPERAZIONE NON ESISTENTE*********************/
                default:
                    System.out.println("\nOperazione non esistente!");
                    break;
            }
        }
    }

    public void menuAddettoSistema (AHC ahc){
        System.out.println("\nBenvenuto Addetto del sistema!");
        input = new Scanner(System.in);
        System.out.println("\nSeleziona un'operazione");
        System.out.println("\n1: Gestisci camera.");
        System.out.println("\n2: Visualizza prenotazioni.");
        System.out.println("\n3: Gestisci Cliente.");
        System.out.println("\n4: Verifica disponibilità camera.");
        System.out.println("\n5: Registra check-in.");
        System.out.println("\n6: Registra check-out.");
        System.out.println("\n0: Esci");
        System.out.println("\nNumero ----->>>>: ");
        int selezioneAddettoSistema = Integer.parseInt(input.next().trim());
        switch (selezioneAddettoSistema) {
            case 0:
                System.out.println("Exit");
                System.exit(0);
                break;
            case 1:
                /********************* Gestisci camera *********************/

                System.out.println("\nHai scelto l'operazione 1: Gestisci camera.");
                System.out.println("\nInserisci una nuova Camera. ");
                System.out.println("\nInserisci il numero della nuova Camera: ");
                int numCamera1 = Integer.parseInt(input.next().trim());
                input.nextLine();
                System.out.println("\nInserisci il numero dei posti letto della nuova Camera: ");
                int numPostiLetto = Integer.parseInt(input.next().trim());
                input.nextLine();
                System.out.println("\nInserisci una descrizione della nuova Camera: ");
                String desc = input.nextLine();
                int tipologia = Integer.parseInt(input.next().trim());
                input.nextLine();
                ahc.inserisciNuovoTipoCamera(numCamera1, numPostiLetto, desc, tipologia);
                System.out.println("\nInserisci un prezzo base della nuova Camera: ");
                double prezzo = Double.parseDouble(input.next().trim());
                input.nextLine();
                ahc.definisciPrezzoCamera(prezzo);
                System.out.println("\nConfermi i dati inseriti? Si o No");
                String yesOrNo = input.next();
                if (yesOrNo.equals("Si")){
                    ahc.confermaTipoCamera(numCamera1);
                }
                else {
                    break;
                }
                System.out.println("\nNuova camera inserita!");
                break;

            case 2:
                /********************* Visualizza prenotazioni *********************/

                System.out.println("\nHai scelto l'operazione 2: Visualizza prenotazioni!");
                System.out.println("\nInserisci 0 o 1 rispettivamente se vuoi visualizzare le prenotazioni di una specifica camera o di tutte!");
                int scelta = Integer.parseInt(input.next().trim());
                input.nextLine();
                if (scelta == 0){
                    System.out.println("\nInserisci il numero della camera per cui vuoi vedere le prenotazioni: ");
                    int numCamera2 = Integer.parseInt(input.next().trim());
                    input.nextLine();
                    ahc.visualizzaPrenotazioniCamera(numCamera2);
                    break;
                }
                else if(scelta == 1){
                    ahc.visualizzaTuttePrenotazioni();
                    break;
                }
            case 3:
                /********************* Gestisci Cliente *********************/

                System.out.println("\nHai scelto l'operazione 3: Gestisci Cliente!");
                System.out.println("\nInserisci i dati relativi al cliente!");
                System.out.println("\nInserisci il nome del Cliente!");
                String nomeCliente = input.next();
                System.out.println("\nInserisci il cognome del Cliente!");
                String cognomeCliente = input.next();
                System.out.println("\nInserisci il CF del Cliente!");
                String CF = input.next();
                Cliente clienteSoggiorno = ahc.inserisciNuovoCliente(nomeCliente, cognomeCliente, CF);
                System.out.println("\nIl nuovo cliente inserito è: \n" + clienteSoggiorno);
                break;
            case 4:
                /********************* Verifica disponibilità camera *********************/

                System.out.println("\nHai scelto l'operazione 4: Verifica disponibilità camera!");
                System.out.println("\nInserisci il numero della camera da verificare: ");
                int numCamera4 = Integer.parseInt(input.next().trim());
                input.nextLine();
                if (!ahc.verificaCheck_out(numCamera4)){
                    System.out.println("\nProblemi riscontrati nella verifica! Riprova. ");
                    break;
                }
                if (!ahc.verificaFinePulizia(numCamera4)){
                    System.out.println("\nProblemi riscontrati nella verifica! Riprova. ");
                    break;
                }
                break;
            case 5:
                /********************* Registra il check-in! *********************/

                System.out.println("\nHai scelto l'operazione 5: Registra il check-in!");
                System.out.println("\nInserisci il numero della camera da verificare: ");
                int numCamera5 = Integer.parseInt(input.next().trim());
                input.nextLine();
                System.out.println("\nInserisci il nome del Cliente!");
                String nomeClienteIn = input.next();
                System.out.println("\nInserisci il cognome del Cliente!");
                String cognomeClienteIn = input.next();
                System.out.println("\nInserisci il CF del Cliente!");
                String CFIn = input.next();
                System.out.println("\nInserisci la data del check-in [gg/mm/yyyy]: ");
                String dataIn = input.nextLine();
                System.out.println("\nInserisci l'orario del check-in [hh:mm:ss]: ");
                String orarioIn = input.nextLine();
                ahc.registraCheck_in(nomeClienteIn, cognomeClienteIn, CFIn, dataIn, orarioIn, numCamera5);
                break;
            case 6:
                /********************* Registra il check-out! *********************/

                System.out.println("\nHai scelto l'operazione 6: Registra il check-out!");
                System.out.println("\nInserisci il numero della camera da verificare: ");
                int numCamera6 = Integer.parseInt(input.next().trim());
                input.nextLine();
                System.out.println("\nInserisci il nome del Cliente!");
                String nomeClienteOut = input.next();
                System.out.println("\nInserisci il cognome del Cliente!");
                String cognomeClienteOut = input.next();
                System.out.println("\nInserisci il CF del Cliente!");
                String CFOut = input.next();
                System.out.println("\nInserisci la data del check-in [gg/mm/yyyy]: ");
                String dataOut = input.nextLine();
                System.out.println("\nInserisci l'orario del check-in [hh:mm:ss]: ");
                String orarioOut = input.nextLine();
                ahc.registraCheck_in(nomeClienteOut, cognomeClienteOut, CFOut, dataOut, orarioOut, numCamera6);
                break;
            default:
                /********************* Operazione non esistente! *********************/

                System.out.println("\nOperazione non esistente!");
                break;
        }
    }

    public void menuAddettoPulizie(AHC ahc){
        System.out.println("\nBenvenuto Addetto delle pulizie!");
        input = new Scanner(System.in);
        System.out.println("\nSeleziona un'operazione");
        System.out.println("\n1: Pulisci camera");
        System.out.println("\n0: Esci");
        System.out.println("\nNumero ----->>>>: ");
        int selezioneAddettoPulizie = Integer.parseInt(input.next().trim());
        input.nextLine();

        switch (selezioneAddettoPulizie) {
            case 0:
                System.out.println("Exit");
                System.exit(0);
                break;
            case 1:
                /********************* Pulisci camera *********************/

                System.out.println("\nHai scelto l'operazione 1: Pulisci camera");
                System.out.println("\nEcco l'lenco delle camere da pulire: ");
                ahc.visualizzaCameraDaPulire();
                System.out.println("\nSeleziona il numero della camera che desideri pulire: ");
                int numeroCameraDaPulire = Integer.parseInt(input.next().trim());
                input.nextLine();
                cameraDaPulire = ahc.selezionaCameraDaPulire(numeroCameraDaPulire);
                System.out.println("\nRegistra la fine della pulizia!");
                ahc.registraFinePulizia(cameraDaPulire);
                break;
            default:
                /********************* Operazione non esistente! *********************/

                System.out.println("\nOperazione non esistente!");
                break;
        }
    }

    public void menuCliente(AHC ahc){
        System.out.println("Benvenuto Cliente!");
        input = new Scanner(System.in);
        System.out.println("\nSeleziona un'operazione");
        System.out.println("\n1: Effettua prenotazione.");
        System.out.println("\n2: Effettua pagamento.");
        System.out.println("\n0: Esci");
        System.out.println("\nNumero ----->>>>: ");
        int selezioneCliente = Integer.parseInt(input.next().trim());
        switch (selezioneCliente) {
            case 0:
                System.out.println("Exit");
                System.exit(0);
                break;
            case 1:
                /********************* Effettua prenotazione *********************/

                System.out.println("\nHai scelto l'operazione 1: Effettua prenotazione");
                System.out.println("\nInserisci il numero della camera che vuoi prenotare: ");
                int numeroCamera1 = Integer.parseInt(input.next().trim());
                input.nextLine();
                System.out.println("\nDi seguito verrà visualizzato il calendario dei giorni occupati per la camera selezionata!");
                ahc.richiestaPrenotazione(numeroCamera1);
                System.out.println("\nInserisci i dati relativi al cliente!");
                System.out.println("\nInserisci il nome del Cliente!");
                String nomeCliente = input.next();
                System.out.println("\nInserisci il cognome del Cliente!");
                String cognomeCliente = input.next();
                System.out.println("\nInserisci il CF del Cliente!");
                String CF = input.next();
                Cliente clienteSoggiorno = ahc.inserisciNuovoCliente(nomeCliente, cognomeCliente, CF);
                int numOspiti = Integer.parseInt(input.next().trim());
                input.nextLine();
                System.out.println("\nInserisci la data di arrivo[gg/mm/yyyy]: ");
                String dataArrivo = input.nextLine();
                LocalDate dataArrivoConvertita = ahc.convertiStringInData(dataArrivo);
                System.out.println("\nInserisci la data di partenza[gg/mm/yyyy]: ");
                String dataPartenza = input.nextLine();
                LocalDate dataPartenzaConvertita = ahc.convertiStringInData(dataPartenza);
                ahc.inserisciDatiSoggiorno(numeroCamera1, clienteSoggiorno, numOspiti, dataArrivoConvertita, dataPartenzaConvertita);
                break;
            case 2:
                /********************* Effettua pagamento *********************/

                System.out.println("\nHai scelto l'operazione 2: Effettua pagamento");
                System.out.println("\nInserisci il codice numerico relativo alla prenotazione del tuo soggiorno: ");
                int idPrenotazione1 = Integer.parseInt(input.next().trim());
                input.nextLine();
                Prenotazione prenotazione = ahc.richiestaPagamento(idPrenotazione1);
                System.out.println("\nScegli la modalità di pagamento che preferisci (Scrivi: 'Carta' oppure 'Bonifico'): ");
                String modalitaPagamento = input.next();
                System.out.println("\nHai scelto la modalità: '" + modalitaPagamento + "'");
                System.out.println("\nInserisci i dati relativi a '" + modalitaPagamento + "'");
                if (modalitaPagamento.equals("Carta")){
                    System.out.println("\nInserisci il nome del titolare della carta: ");
                    String nomeTitolare = input.next();
                    System.out.println("\nInserisci il cognome del titolare della carta: ");
                    String cognomeTitolare = input.next();
                    System.out.println("\nInserisci il numero della carta: ");
                    int numeroCarta = Integer.parseInt(input.next().trim());
                    input.nextLine();
                    System.out.println("\nInserisci il codice CVV della carta: ");
                    int codiceCVV = Integer.parseInt(input.next().trim());
                    input.nextLine();
                    CartaCredito_Debito carta = ahc.inserisciDatiCarta(nomeTitolare, cognomeTitolare, numeroCarta, codiceCVV);
                    ahc.scegliModalitaPagamento(prenotazione, modalitaPagamento, carta, null);
                    break;
                }
                else if (modalitaPagamento.equals("Bonifico")){
                    System.out.println("\nInserisci il nome del titolare del conto bancario: ");
                    String nomeTitolare = input.next();
                    System.out.println("\nInserisci il cognome del titolare del conto bancario: ");
                    String cognomeTitolare = input.next();
                    System.out.println("\nInserisci il codice IBAN: ");
                    String IBAN = input.nextLine();
                    BonificoBancario bonifico = ahc.inserisciDatiBonifico(nomeTitolare, cognomeTitolare, IBAN);
                    ahc.scegliModalitaPagamento(prenotazione, modalitaPagamento, null, bonifico);
                    break;
                }
                else {
                    System.out.println("\nHai inserito la modalità errata. Riprova! ");
                    break;
                }
            default:
                /********************* Operazione non esistente *********************/

                System.out.println("Operazione non esistente!");
            break;
        }
    }
}
