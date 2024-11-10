package com.example.cp2_2.src.main.java.br.com.fiap.twoespx.nucleotidio.service;


import com.example.cp2_2.src.main.java.br.com.fiap.twoespx.nucleotidio.dto.NucleotidioSequenceDTO;
import com.example.cp2_2.src.main.java.br.com.fiap.twoespx.nucleotidio.exception.InvalidSequenceException;

public class NucleotidioService {
    private static final int MAX_SEQUENCE_LENGTH = 16;
    
    public NucleotidioSequenceDTO processSequence(String sequence) {
        validateSequence(sequence);
        
        NucleotidioSequenceDTO dto = new NucleotidioSequenceDTO(sequence);
        
        for (char nucleotideo : sequence.toCharArray()) {
            switch (nucleotideo) {
                case 'A':
                    dto.getCounts().incrementAdenina();
                    break;
                case 'C':
                    dto.getCounts().incrementCitosina();
                    break;
                case 'T':
                    dto.getCounts().incrementTimina();
                    break;
                case 'G':
                    dto.getCounts().incrementGuanina();
                    break;
            }
        }
        
        return dto;
    }
    
    private void validateSequence(String sequence) {
        if (sequence == null || sequence.isEmpty()) {
            throw new InvalidSequenceException("A sequência não pode ser vazia");
        }
        
        if (sequence.length() > MAX_SEQUENCE_LENGTH) {
            throw new InvalidSequenceException(
                String.format("A sequência não pode ter mais que %d caracteres", MAX_SEQUENCE_LENGTH)
            );
        }
        
        if (!sequence.matches("[ACTG]+")) {
            throw new InvalidSequenceException("A sequência contém caracteres inválidos");
        }
    }
} 