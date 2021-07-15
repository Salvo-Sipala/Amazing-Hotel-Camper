package com.ahc.Domain;

import java.time.LocalDate;
import java.util.List;

public class CalendarioPrenotazioni {
    private int numeroCamera;
    private List<LocalDate> listaGiorniPrenotati;

    public CalendarioPrenotazioni(int numeroCamera, List<LocalDate> listaGiorniPrenotati) {
        this.numeroCamera = numeroCamera;
        this.listaGiorniPrenotati = listaGiorniPrenotati;
    }

    public int getNumeroCamera() {
        return numeroCamera;
    }

    public void setNumeroCamera(int numeroCamera) {
        this.numeroCamera = numeroCamera;
    }

    public List<LocalDate> getListaGiorniPrenotati() {
        return listaGiorniPrenotati;
    }

    public void setListaGiorniPrenotati(List<LocalDate> listaGiorniPrenotati) {
        this.listaGiorniPrenotati = listaGiorniPrenotati;
    }

    public void aggiungiGiorniPrenotati (List date){
        listaGiorniPrenotati.addAll(date);
    }

    @Override
    public String toString() {
        return "CalendarioPrenotazioni{" +
                "listaGiorniPrenotati=" + listaGiorniPrenotati +
                '}';
    }
}
