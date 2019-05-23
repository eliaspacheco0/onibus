package com.example.lims.onibus;

public class Contact {

    private String Numeronome;
    private int Onibus;

    public Contact() {
    }

    public Contact(String numeronome, int onibus) {
        Numeronome = numeronome;
        Onibus = onibus;
    }

    // Getter


    public String getNumeronome() {
        return Numeronome;
    }

    public int getOnibus() {
        return Onibus;
    }

    // Setter

    public void setNumeronome(String numeronome) {
        Numeronome = numeronome;
    }

    public void setOnibus(int onibus) {
        Onibus = onibus;
    }
}
