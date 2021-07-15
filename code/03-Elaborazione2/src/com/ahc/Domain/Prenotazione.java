package com.ahc.Domain;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.concurrent.atomic.AtomicInteger;

public class Prenotazione {

    private static final AtomicInteger  count = new AtomicInteger(0);
    private final int IDPrenotazione;
    private Soggiorno soggiorno;
    private LocalDate dataPrenotazione;
    private LocalTime orarioPrenotazione;
    private double importoDaPagare;

    public Prenotazione(Soggiorno soggiorno, LocalDate dataPrenotazione, LocalTime orarioPrenotazione, double importoDaPagare) {
        this.IDPrenotazione = count.incrementAndGet();
        this.soggiorno = soggiorno;
        this.dataPrenotazione = dataPrenotazione;
        this.orarioPrenotazione = orarioPrenotazione;
        this.importoDaPagare = importoDaPagare;
    }

    public static AtomicInteger getCount() {
        return count;
    }

    public int getIDPrenotazione() {
        return IDPrenotazione;
    }

    public Soggiorno getSoggiorno() {
        return soggiorno;
    }

    public void setSoggiorno(Soggiorno soggiorno) {
        this.soggiorno = soggiorno;
    }

    public LocalDate getDataPrenotazione() {
        return dataPrenotazione;
    }

    public void setDataPrenotazione(LocalDate dataPrenotazione) {
        this.dataPrenotazione = dataPrenotazione;
    }

    public LocalTime getOrarioPrenotazione() {
        return orarioPrenotazione;
    }

    public void setOrarioPrenotazione(LocalTime orarioPrenotazione) {
        this.orarioPrenotazione = orarioPrenotazione;
    }

    public double getImportoDaPagare() {
        return importoDaPagare;
    }

    public void setImportoDaPagare(double importoDaPagare) {
        this.importoDaPagare = importoDaPagare;
    }

    @Override
    public String toString() {
        return "Prenotazione{" +
                "IDPrenotazione=" + IDPrenotazione +
                ", soggiorno=" + soggiorno +
                ", dataPrenotazione=" + dataPrenotazione +
                ", orarioPrenotazione=" + orarioPrenotazione +
                ", importoDaPagare=" + importoDaPagare +
                '}';
    }
}
