package com.ahc.Domain;

public class TipoCamera {

    private int numeroCamera;
    private int numeroPostiLetto;
    private String descrizione;
    private Double prezzo;
    private int tipologiaCamera; //1 -> Camera B&B; 2 -> Camera casa vacanze

/*
    public TipoCamera(int numeroCamera, int numeroPostiLetto, String descrizione) {
        this.numeroCamera = numeroCamera;
        this.numeroPostiLetto = numeroPostiLetto;
        this.descrizione = descrizione;
    }
*/

    public TipoCamera(int numeroCamera, int numeroPostiLetto, String descrizione, int tipologiaCamera) {
        switch (tipologiaCamera){
            case 1: //B&B
                this.numeroCamera = numeroCamera;
                this.numeroPostiLetto = numeroPostiLetto;
                this.descrizione = descrizione;
                this.prezzo = getPrezzo() * 1.2;  //1.2 rappresenta le tasse
                break;
            case 2:  //Casa vacanze
                this.numeroCamera = numeroCamera;
                this.numeroPostiLetto = numeroPostiLetto;
                this.descrizione = descrizione;
                this.prezzo = getPrezzo() * 1.5;  //1.5 rappresenta le tasse
                break;
        }
    }

    public int getNumeroCamera() {
        return numeroCamera;
    }

    public void setNumeroCamera(int numeroCamera) {
        this.numeroCamera = numeroCamera;
    }

    public int getNumeroPostiLetto() {
        return numeroPostiLetto;
    }

    public void setNumeroPostiLetto(int numeroPostiLetto) {
        this.numeroPostiLetto = numeroPostiLetto;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

    public void stampaTipoCamera(){
        System.out.println(this.numeroCamera + this.numeroPostiLetto + this.descrizione);
    }

    @Override
    public String toString() {
        return "TipoCamera{" +
                "numeroCamera=" + numeroCamera +
                ", numeroPostiLetto=" + numeroPostiLetto +
                ", descrizione='" + descrizione + '\'' +
                ", prezzo=" + prezzo +
                '}';
    }
}
