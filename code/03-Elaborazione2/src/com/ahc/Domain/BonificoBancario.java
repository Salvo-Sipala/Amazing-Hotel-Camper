package com.ahc.Domain;

public class BonificoBancario {

    private String nomeTitolare;
    private String cognomeTitolare;
    private String codiceIBAN;
    private double creditoResiduo;

    public BonificoBancario(String nomeTitolare, String cognomeTitolare, String codiceIBAN, double creditoResiduo) {
        this.nomeTitolare = nomeTitolare;
        this.cognomeTitolare = cognomeTitolare;
        this.codiceIBAN = codiceIBAN;
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

    public String getCodiceIBAN() {
        return codiceIBAN;
    }

    public void setCodiceIBAN(String codiceIBAN) {
        this.codiceIBAN = codiceIBAN;
    }

    public double getCreditoResiduo() {
        return creditoResiduo;
    }

    public void setCreditoResiduo(double creditoResiduo) {
        this.creditoResiduo = creditoResiduo;
    }

    public String stampaModalitaPagamento(){
        return "\nBonifico bancario.";
    }

}
