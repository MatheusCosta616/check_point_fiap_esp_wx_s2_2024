package com.example.cp2_2.src.main.java.br.com.fiap.twoespx.nucleotidio.dto;

public class NucleotidioCountDTO {
    private int adenina;
    private int citosina;
    private int timina;
    private int guanina;

    public void incrementAdenina() {
        this.adenina++;
    }

    public void incrementCitosina() {
        this.citosina++;
    }

    public void incrementTimina() {
        this.timina++;
    }

    public void incrementGuanina() {
        this.guanina++;
    }

    public int getAdenina() {
        return adenina;
    }

    public int getCitosina() {
        return citosina;
    }

    public int getTimina() {
        return timina;
    }

    public int getGuanina() {
        return guanina;
    }

    @Override
    public String toString() {
        return String.format("A: %d\nC: %d\nT: %d\nG: %d", 
            adenina, citosina, timina, guanina);
    }
} 