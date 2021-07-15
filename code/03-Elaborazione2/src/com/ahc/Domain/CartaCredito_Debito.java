package com.ahc.Domain;

public class CartaCredito_Debito {

    private String nomeTitolare;
    private String cognomeTitolare;
    private long numeroCarta;
    private int codiceCVV;
    private double creditoResiduo;

    public CartaCredito_Debito(String nomeTitolare, String cognomeTitolare, long numeroCarta, int codiceCVV, double creditoResiduo) {
        this.nomeTitolare = nomeTitolare;
        this.cognomeTitolare = cognomeTitolare;
        this.numeroCarta = numeroCarta;
        this.codiceCVV = codiceCVV;
        this.creditoResiduo = creditoResiduo;
    }

    public String getNomeTitolare() {
        return nomeTitolare;
    }

    public void setNomeTitolare(String nomeTitolare) {
        this.nomeTitolare = nomeTitolare;
    }

    public String getCognomeTitolare() {
        return cognomeTitolare;
    }

    public void setCognomeTitolare(String cognomeTitolare) {
        this.cognomeTitolare = cognomeTitolare;
    }

    public long getNumeroCarta() {
        return numeroCarta;
    }

    public void setNumeroCarta(long numeroCarta) {
        this.numeroCarta = numeroCarta;
    }

    public int getCodiceCVV() {
        return codiceCVV;
    }

    public void setCodiceCVV(int codiceCVV) {
        this.codiceCVV = codiceCVV;
    }

    public double getCreditoResiduo() {
        return creditoResiduo;
    }

    public void setCreditoResiduo(double creditoResiduo) {
        this.creditoResiduo = creditoResiduo;
    }

    public String stampaModalitaPagamento(){
        return "\nCarta di credito/debito.";
    }

}
