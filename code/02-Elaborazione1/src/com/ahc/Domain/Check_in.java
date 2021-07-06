package com.ahc.Domain;

import java.time.LocalDate;
import java.time.LocalTime;

public class Check_in {

    private Cliente cliente;
    private LocalDate dataCheckIn;
    private LocalTime orarioCheckIn;
    private int numeroCameraOccupata;

    public Check_in(Cliente cliente, LocalDate dataCheckIn, LocalTime orarioCheckIn, int numeroCameraOccupata) {
        this.cliente = cliente;
        this.dataCheckIn = dataCheckIn;
        this.orarioCheckIn = orarioCheckIn;
        this.numeroCameraOccupata = numeroCameraOccupata;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getDataCheckIn() {
        return dataCheckIn;
    }

    public void setDataCheckIn(LocalDate dataCheckIn) {
        this.dataCheckIn = dataCheckIn;
    }

    public LocalTime getOrarioCheckIn() {
        return orarioCheckIn;
    }

    public void setOrarioCheckIn(LocalTime orarioCheckIn) {
        this.orarioCheckIn = orarioCheckIn;
    }

    public int getNumeroCameraOccupata() {
        return numeroCameraOccupata;
    }

    public void setNumeroCameraOccupata(int numeroCameraOccupata) {
        this.numeroCameraOccupata = numeroCameraOccupata;
    }

    @Override
    public String toString() {
        return "Check_in{" +
                "cliente=" + cliente +
                ", dataCheckIn=" + dataCheckIn +
                ", orarioCheckIn=" + orarioCheckIn +
                ", numeroCameraOccupata=" + numeroCameraOccupata +
                '}';
    }
}
