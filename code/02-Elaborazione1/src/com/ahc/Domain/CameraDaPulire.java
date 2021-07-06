package com.ahc.Domain;

import java.time.LocalDate;
import java.time.LocalTime;

public class CameraDaPulire {

    private int numeroCamera;
    private boolean pulita;
    private LocalDate dataPulizia;
    private LocalTime orarioPulizia;

    public CameraDaPulire(int numeroCamera, boolean pulita, LocalDate dataPulizia, LocalTime orarioPulizia) {
        this.numeroCamera = numeroCamera;
        this.pulita = pulita;
        this.dataPulizia = dataPulizia;
        this.orarioPulizia = orarioPulizia;
    }

    public int getNumeroCamera() {
        return numeroCamera;
    }

    public void setNumeroCamera(int numeroCamera) {
        this.numeroCamera = numeroCamera;
    }

    public boolean isPulita() {
        return pulita;
    }

    public void setPulita(boolean pulita) {
        this.pulita = pulita;
    }

    public LocalDate getDataPulizia() {
        return dataPulizia;
    }

    public void setDataPulizia(LocalDate dataPulizia) {
        this.dataPulizia = dataPulizia;
    }

    public LocalTime getOrarioPulizia() {
        return orarioPulizia;
    }

    public void setOrarioPulizia(LocalTime orarioPulizia) {
        this.orarioPulizia = orarioPulizia;
    }

    @Override
    public String toString() {
        return "CameraDaPulire{" +
                "numeroCamera=" + numeroCamera +
                ", pulita=" + pulita +
                ", dataPulizia=" + dataPulizia +
                ", orarioPulizia=" + orarioPulizia +
                '}';
    }
}
