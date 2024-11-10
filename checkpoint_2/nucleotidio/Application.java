package com.example.cp2_2.src.main.java.br.com.fiap.twoespx.nucleotidio;

import com.example.cp2_2.src.main.java.br.com.fiap.twoespx.nucleotidio.dto.NucleotidioSequenceDTO;
import com.example.cp2_2.src.main.java.br.com.fiap.twoespx.nucleotidio.service.NucleotidioService;
import com.example.cp2_2.src.main.java.br.com.fiap.twoespx.nucleotidio.util.FileHandler;

import java.util.List;

public class Application {
    private static final String DEFAULT_INPUT = "entradas/entrada1.txt";
    private static final String DEFAULT_OUTPUT = "saidas/resultado.txt";

    public static void main(String[] args) {
        String inputFile = args.length > 0 ? args[0] : DEFAULT_INPUT;
        String outputFile = args.length > 1 ? args[1] : DEFAULT_OUTPUT;

        System.out.println("\n\n------------------------------------");
        System.out.println(":: Nucleotidio Counter - Versão Moderna ::");
        System.out.println("Arquivo de entrada: " + inputFile);
        System.out.println("Arquivo de saída: " + outputFile);
        System.out.println("------------------------------------\n");

        NucleotidioService service = new NucleotidioService();
        FileHandler fileHandler = new FileHandler();
        
        try {
            List<String> sequences = fileHandler.readSequences(inputFile);
            StringBuilder output = new StringBuilder();
            
            for (String sequence : sequences) {
                try {
                    NucleotidioSequenceDTO result = service.processSequence(sequence);
                    System.out.println("Processando sequência: " + sequence);
                    output.append(result.toString()).append("\n\n");
                } catch (Exception e) {
                    System.err.println("Erro ao processar sequência: " + sequence);
                    System.err.println("Motivo: " + e.getMessage());
                }
            }
            
            fileHandler.writeResults(outputFile, output.toString());
            System.out.println("\nProcessamento concluído! Resultados salvos em: " + outputFile);
            
        } catch (Exception e) {
            System.err.println("Erro fatal: " + e.getMessage());
            System.exit(1);
        }
    }
} 