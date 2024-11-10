package com.example.cp2_2.src.main.java.br.com.fiap.twoespx.nucleotidio.model;

public class SequenceInput {
    private String sequence_uuid;
    private String sequence;

    public SequenceInput() {}

    public SequenceInput(String sequence_uuid, String sequence) {
        this.sequence_uuid = sequence_uuid;
        this.sequence = sequence;
    }

    public String getSequence_uuid() {
        return sequence_uuid;
    }

    public void setSequence_uuid(String sequence_uuid) {
        this.sequence_uuid = sequence_uuid;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }
} 