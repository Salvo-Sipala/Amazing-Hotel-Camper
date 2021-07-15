package com.ahc.Domain;

// Utilizzo dei Generics per poter inserire la modalita di pagamento in base alla scelta del cliente
public class Pagamento <T>{
    private Prenotazione prenotazione;
    private T modalitaPagamento;

    public Pagamento(Prenotazione prenotazione, T modalitaPagamento) {
        this.prenotazione = prenotazione;
        this.modalitaPagamento = modalitaPagamento;
    }

    public Prenotazione getPrenotazione() {
        return prenotazione;
    }

    public void setPrenotazione(Prenotazione prenotazione) {
        this.prenotazione = prenotazione;
    }

    public T getModalitaPagamento() {
        return modalitaPagamento;
    }

    public void setModalitaPagamento(T modalitaPagamento) {
        this.modalitaPagamento = modalitaPagamento;
    }

}
