package com.ahc.Domain;

import java.time.LocalDate;
import java.time.LocalTime;

public class Check_out {

    private Cliente cliente;
    private LocalDate dataCheckOut;
    private LocalTime orarioCheckOut;
    private int numeroCameraLiberata;

    public Check_out(Cliente cliente, LocalDate dataCheckOut, LocalTime orarioCheckOut, int numeroCameraLiberata) {
        this.cliente = cliente;
        this.dataCheckOut = dataCheckOut;
        this.orarioCheckOut = orarioCheckOut;
        this.numeroCameraLiberata = numeroCameraLiberata;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getDataCheckOut() {
        return dataCheckOut;
    }

    public void setDataCheckOut(LocalDate dataCheckOut) {
        this.dataCheckOut = dataCheckOut;
    }

    public LocalTime getOrarioCheckOut() {
        return orarioCheckOut;
    }

    public void setOrarioCheckOut(LocalTime orarioCheckOut) {
        this.orarioCheckOut = orarioCheckOut;
    }

    public int getNumeroCameraLiberata() {
        return numeroCameraLiberata;
    }

    public void setNumeroCameraLiberata(int numeroCameraLiberata) {
        this.numeroCameraLiberata = numeroCameraLiberata;
    }

    @Override
    public String toString() {
        return "Check_out{" +
                "cliente=" + cliente +
                ", dataCheckOut=" + dataCheckOut +
                ", orarioCheckOut=" + orarioCheckOut +
                ", numeroCameraLiberata=" + numeroCameraLiberata +
                '}';
    }
}
