package com.example.cp2_2.src.main.java.br.com.fiap.twoespx.nucleotidio.dto;

public class NucleotidioSequenceDTO {
    private String sequence;
    private int sequenceSize;
    private NucleotidioCountDTO counts;

    public NucleotidioSequenceDTO(String sequence) {
        this.sequence = sequence;
        this.sequenceSize = sequence.length();
        this.counts = new NucleotidioCountDTO();
    }

    public String getSequence() {
        return sequence;
    }

    public int getSequenceSize() {
        return sequenceSize;
    }

    public NucleotidioCountDTO getCounts() {
        return counts;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sequência: ").append(sequence).append("\n");
        sb.append("Tamanho: ").append(sequenceSize).append("\n");
        sb.append(counts.toString());
        return sb.toString();
    }
} 