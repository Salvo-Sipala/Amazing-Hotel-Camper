package com.ahc.Domain;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicInteger;

public class Soggiorno {
    private static final AtomicInteger count = new AtomicInteger(0);
    private final int IDSoggiorno;
    private int numeroCamera;
    private Cliente cliente;
    private int numeroOspiti;
    private LocalDate dataArrivo;
    private LocalDate dataPartenza;
    private boolean pagato;

    public Soggiorno(int numeroCamera, Cliente cliente, int numeroOspiti, LocalDate dataArrivo, LocalDate dataPartenza) {
        this.IDSoggiorno = count.incrementAndGet();
        this.numeroCamera = numeroCamera;
        this.cliente = cliente;
        this.numeroOspiti = numeroOspiti;
        this.dataArrivo = dataArrivo;
        this.dataPartenza = dataPartenza;
        this.pagato = false;
    }

    public static AtomicInteger getCount() {
        return count;
    }

    public int getIDSoggiorno() {
        return IDSoggiorno;
    }

    public int getNumeroCamera() {
        return numeroCamera;
    }

    public void setNumeroCamera(int numeroCamera) {
        this.numeroCamera = numeroCamera;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumeroOspiti() {
        return numeroOspiti;
    }

    public void setNumeroOspiti(int numeroOspiti) {
        this.numeroOspiti = numeroOspiti;
    }

    public LocalDate getDataArrivo() {
        return dataArrivo;
    }

    public void setDataArrivo(LocalDate dataArrivo) {
        this.dataArrivo = dataArrivo;
    }

    public LocalDate getDataPartenza() {
        return dataPartenza;
    }

    public void setDataPartenza(LocalDate dataPartenza) {
        this.dataPartenza = dataPartenza;
    }

    public boolean isPagato() {
        return pagato;
    }

    public void setPagato(boolean pagato) {
        this.pagato = pagato;
    }

}
