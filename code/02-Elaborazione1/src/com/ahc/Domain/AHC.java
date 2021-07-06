package com.ahc.Domain;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class AHC {

    private TipoCamera tipoCameraCorrente;
    private List<TipoCamera> listaTipoCamere;
    private Map<Integer, TipoCamera> tipiCamera;
    private Cliente clienteCorrente;
    private List<Cliente> listaClienti;
    private List<CameraDaPulire> listaCamereDaPulire;
    private FinePulizia finePulizia;
    private Check_in check_in;
    private List<Check_in> listaCheck_in;
    private Check_out check_out;
    private List<Check_out> listaCheck_out;
    private List<Integer> numeriCamereDaPulire = new ArrayList<>();

    public AHC() {
        this.listaTipoCamere = new LinkedList<TipoCamera>();
        this.listaClienti = new LinkedList<Cliente>();
        this.listaCamereDaPulire = new LinkedList<CameraDaPulire>();
        this.listaCheck_in = new LinkedList<Check_in>();
        this.listaCheck_out = new LinkedList<Check_out>();
    }

    /* CASO D'USO 1 : GESTISCI CAMERA */

    public TipoCamera inserisciNuovoTipoCamera(int numeroCamera, int numeroPostiLetto, String descrizione){
        this.tipoCameraCorrente = new TipoCamera(numeroCamera, numeroPostiLetto, descrizione);
        return this.tipoCameraCorrente;
    }

    public void definisciPrezzoCamera(double prezzo){
        this.tipoCameraCorrente.setPrezzo(prezzo);
    }

    public void confermaTipoCamera(){
        int numeroCamera = this.tipoCameraCorrente.getNumeroCamera();
        tipiCamera.put(numeroCamera, this.tipoCameraCorrente);
    }

    /* CASO D'USO 9 : PULISCI CAMERA */

    public void visualizzaCameraDaPulire(){
        for (CameraDaPulire cp: listaCamereDaPulire){
            if (!cp.isPulita()){
                for (int i = 0; i < numeriCamereDaPulire.size(); i++){
                    numeriCamereDaPulire.set(i, cp.getNumeroCamera());
                    System.out.println("\nLista numeri camere da pulire: \n" + numeriCamereDaPulire.get(i));
                }
            }
        }
    }

    public CameraDaPulire selezionaCameraDaPulire(int numeroCamera){
        CameraDaPulire cameraSelezionata = null;
        for (CameraDaPulire cp: listaCamereDaPulire) {
            if (cp.getNumeroCamera() == numeroCamera) {
                if (!cp.isPulita()){
                    cameraSelezionata = cp;
                }
            }
        }
        return cameraSelezionata;
    }

    public void registraFinePulizia(CameraDaPulire camera){
        camera.setPulita(true);
        finePulizia.addCameraDaPulire(camera);
    }
    
    /* CASO D'USO 10 : VERIFICA DISPONIBILITA' CAMERA */

    public boolean verificaCheck_out(int numeroCamera){
        LocalDate localDate = null;
        LocalTime localTime = null;
        for (CameraDaPulire cp: listaCamereDaPulire) {
            for (Check_out co: listaCheck_out){
                if (numeroCamera == cp.getNumeroCamera() && numeroCamera == co.getNumeroCameraLiberata()) {
                    localDate = co.getDataCheckOut();
                    localTime = co.getOrarioCheckOut();
                    System.out.println("Data ultimo chech-out: " + localDate.toString() + "\nData ultimo chech-out: " + localTime.toString());
                }
            }

        }
        return false;
    }

    public boolean verificaFinePulizia(int numeroCamera){
        CameraDaPulire cameraSelezionata = null;
        for (CameraDaPulire cp: listaCamereDaPulire) {
            if (cp.getNumeroCamera() == numeroCamera) {
                if (!cp.isPulita()){
                    System.out.println("\nCamera selezionata non ancora pulita!");
                    return false;
                }
                else {
                    System.out.println("\nCamera selezionata pulita! Pronta per un nuovo check-in!");
                    return true;
                }
            }
        }
        return false;
    }

    public void registraCheck_in(String nome, String cognome, String CF, String data, String orario, int numeroCamera){
        clienteCorrente = new Cliente(nome, cognome, CF);
        LocalDate dataCheck_in = convertiStringInData(data);
        LocalTime orarioCheck_in = convertiStringInOrario(orario);
        check_in = new Check_in(clienteCorrente, dataCheck_in, orarioCheck_in,numeroCamera);
        System.out.println("\nCheck-in eseguito!");
    }

    /****METODI UTILI PER VARIE OPERAZIONI ****/
    public LocalDate convertiStringInData (String data){
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(data, formatoData);
    }

    public LocalTime convertiStringInOrario (String orario){

        DateTimeFormatter formatoOrario = DateTimeFormatter.ofPattern("HH:mm:ss");
        return LocalTime.parse(orario,formatoOrario);
    }

    //Metodo di puro test che permette di creare degli oggetti nel sistema
    public void inizializzaSistema (){
        TipoCamera camera1, camera2, camera3;
        Cliente cliente1, cliente2, cliente3;
        Check_in check_in1, check_in2, check_in3;
        Check_out check_out1, check_out2, check_out3;
        CameraDaPulire cameraDaPulire1, cameraDaPulire2, cameraDaPulire3;
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoOrario = DateTimeFormatter.ofPattern("HH:mm:ss");
        camera1 = new TipoCamera(1, 2, "Matrimoniale con colazione inclusa.");
        camera2 = new TipoCamera(2, 4, "Quadrupla con colazione inclusa.");
        camera3 = new TipoCamera(3, 4, "Quadrupla con angolo cottura, colazione non inclusa");
        camera1.setPrezzo(45.0);
        camera2.setPrezzo(70.0);
        camera3.setPrezzo(80.0);
        listaTipoCamere.add(camera1);
        listaTipoCamere.add(camera2);
        listaTipoCamere.add(camera3);
        cliente1 = new Cliente("Mario", "Rossi", "123");
        cliente2 = new Cliente("Salvatore", "Sipala", "234");
        cliente3 = new Cliente("Flavia", "Mauceri", "345");
        listaClienti.add(cliente1);
        listaClienti.add(cliente2);
        listaClienti.add(cliente3);
        check_in1 = new Check_in(cliente1, LocalDate.parse("02/07/2021",formatoData), LocalTime.parse("15:50:26"),1);
        check_in2 = new Check_in(cliente2, LocalDate.parse("10/05/2021",formatoData), LocalTime.parse("12:40:51"),2);
        check_in3 = new Check_in(cliente3, LocalDate.parse("25/06/2021",formatoData), LocalTime.parse("14:30:06"),3);
        listaCheck_in.add(check_in1);
        listaCheck_in.add(check_in2);
        listaCheck_in.add(check_in3);
        check_out1 = new Check_out(cliente1, LocalDate.parse("04/07/2021",formatoData), LocalTime.parse("10:20:35"),1);
        check_out2 = new Check_out(cliente2, LocalDate.parse("15/05/2021",formatoData), LocalTime.parse("09:40:15"),2);
        listaCheck_out.add(check_out1);
        listaCheck_out.add(check_out2);
    }

    //Test Stampa oggetti creati
    public void testStampa(){
        for (TipoCamera tc: listaTipoCamere) {
            tc.toString();
            System.out.println(tc);
        }
        for (Cliente c: listaClienti) {
            c.toString();
            System.out.println(c);
        }
        for (Check_in cin: listaCheck_in) {
            cin.toString();
            System.out.println(cin);
        }
        for (Check_out cout: listaCheck_out) {
            cout.toString();
            System.out.println(cout);
        }
    }

}
