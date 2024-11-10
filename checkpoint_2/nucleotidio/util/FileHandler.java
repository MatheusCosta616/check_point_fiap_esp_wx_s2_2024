package com.example.cp2_2.src.main.java.br.com.fiap.twoespx.nucleotidio.util;

import java.io.*;
import java.nio.file.*;
import java.util.List;

public class FileHandler {
    
    public List<String> readSequences(String filename) throws IOException {
        try {
            List<String> lines = Files.readAllLines(Paths.get(filename));
            System.out.println("Lidas " + lines.size() + " sequências do arquivo: " + filename);
            return lines;
        } catch (IOException e) {
            System.err.println("Erro ao ler arquivo " + filename);
            throw e;
        }
    }
    
    public void writeResults(String filename, String content) throws IOException {
        try {
            Files.write(Paths.get(filename), content.getBytes());
            System.out.println("Resultados escritos com sucesso em: " + filename);
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo " + filename);
            throw e;
        }
    }
} 