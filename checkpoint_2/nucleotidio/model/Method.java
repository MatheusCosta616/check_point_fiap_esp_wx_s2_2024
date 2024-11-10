package com.example.cp2_2.src.main.java.br.com.fiap.twoespx.nucleotidio.model;

import java.util.List;

public class Method {
    private String name;
    private String about;
    private List<String> references;

    public Method() {}

    public Method(String name, String about, List<String> references) {
        this.name = name;
        this.about = about;
        this.references = references;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public List<String> getReferences() {
        return references;
    }

    public void setReferences(List<String> references) {
        this.references = references;
    }
} 