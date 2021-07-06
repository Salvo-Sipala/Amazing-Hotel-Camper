package com.ahc.Domain;

public class TipoCamera {

    private int numeroCamera;
    private int numeroPostiLetto;
    private String descrizione;
    private Double prezzo;

    public TipoCamera(int numeroCamera, int numeroPostiLetto, String descrizione) {
        this.numeroCamera = numeroCamera;
        this.numeroPostiLetto = numeroPostiLetto;
        this.descrizione = descrizione;
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
