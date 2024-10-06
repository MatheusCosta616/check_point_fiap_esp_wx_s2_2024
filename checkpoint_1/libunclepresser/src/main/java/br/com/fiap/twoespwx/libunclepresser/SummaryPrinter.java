package br.com.fiap.twoespwx.libunclepresser;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SummaryPrinter {
    public static void printSummary(String inputFileName, String outputFileName, List<String> inputLines, String compressedOutput) {
        System.out.println("-----------------------------------------------------------");
        System.out.println("|        LIB UNCLE PRESSER - GRUPO Quarteto Sinistro        |");
        System.out.println("|-----------------------------------------------------------|");
        System.out.println("|                                                           |");
        System.out.printf("| INPUT  FILENAME: %s\n", inputFileName);
        System.out.printf("| OUTPUT FILENAME: %s\n", outputFileName);
        System.out.println("|                                                           |");
        System.out.printf("| INPUT FILE SIZE: %.1fKB\n", inputLines.stream().mapToInt(String::length).sum() / 1024.0);
        System.out.println("|                                                           |");
        System.out.printf("| TOTAL INPUT CHARACTERS: %d\n", inputLines.stream().mapToInt(String::length).sum());
        System.out.println("|                                                           |");

        Map<Character, Integer> frequencies = calculateFrequencies(inputLines);
        System.out.println("| FREQUENCIES:                                              |");
        for (Map.Entry<Character, Integer> entry : frequencies.entrySet()) {
            System.out.printf("| %c: %d (%.2f%%)\n", entry.getKey(), entry.getValue(), (entry.getValue() / (double) inputLines.stream().mapToInt(String::length).sum()) * 100);
        }
        System.out.println("|                                                           |");
        System.out.println("| OPTIONS:                                                  |");
        System.out.println("|                                                           |");
        System.out.println("| ALGORITHM: Run-Length Encoding (RLE)                      |");
        System.out.println("| TEXT-CODIFICATION: UTF-8                                  |");
        System.out.printf("| COMPRESSION RATE: =~ %.2f%%                              |\n", ((1 - (double) compressedOutput.length() / inputLines.stream().mapToInt(String::length).sum()) * 100));
        System.out.println("|                                                           |");
        System.out.printf("| OUTPUT FILE SIZE: %d BYTES                               |\n", compressedOutput.getBytes().length);
        System.out.println("|                                                           |");
        System.out.println(" -----------------------------------------------------------");
        System.out.println("|                                                           |");
        System.out.println("| SCORE: WELL-DONE                                          |");
        System.out.println("|                                                           |");
        System.out.println(" -----------------------------------------------------------");
    }

    private static Map<Character, Integer> calculateFrequencies(List<String> inputLines) {
        Map<Character, Integer> frequencies = new HashMap<>();
        for (String line : inputLines) {
            for (char nucleotide : line.toCharArray()) {
                frequencies.put(nucleotide, frequencies.getOrDefault(nucleotide, 0) + 1);
            }
        }
        return frequencies;
    }
}