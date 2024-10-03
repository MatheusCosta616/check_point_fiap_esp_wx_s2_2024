/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 *
 * Grupo: Batata Doce
 * Autores:
 *      -Caíque Walter Silva - RM550693
 *      -Guilherme Nobre Bernardo - RM98604
 *      -Matheus José de Lima Costa - RM551157
 *      -Felipe
 */

package br.com.fiap.twoespwx.libunclepresser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {

    public static String compressRLE(String inp) {
        if (inp == null || inp.isEmpty()) {
            return "";
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;
        for (int i = 1; i < inp.length(); i++) {
            if (inp.charAt(i) == inp.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(inp.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        compressed.append(inp.charAt(inp.length() - 1)).append(count);
        return compressed.toString();
    }

    public static void main(String[] args) {
        String inputFile = args[0];
        String outputFile = args[1];

        try {
            String inputText = new String(Files.readAllBytes(Paths.get(inputFile)));

            long inputFileSize = Files.size(Paths.get(inputFile));

            String compressedText = compressRLE(inputText);
            long outputFileSize = compressedText.length();

            double compressionRate = ((double) outputFileSize / inputFileSize) * 100;

            String summary = String.format(
                    " -----------------------------------------------------------\n" +
                            "|           LIB UNCLE PRESSER - GRUPO 2           |\n" +
                            " -----------------------------------------------------------\n" +
                            "| INPUT  FILENAME: %s\n" +
                            "| OUTPUT FILENAME: %s\n" +
                            "| INPUT FILE SIZE: %d BYTES\n" +
                            "| OUTPUT FILE SIZE: %d BYTES\n" +
                            "| COMPRESSION RATE: =~ %.2f%%\n" +
                            " -----------------------------------------------------------\n",
                    inputFile, outputFile, inputFileSize, outputFileSize, compressionRate
            );

            Files.write(Paths.get(outputFile), summary.getBytes());

        } catch (IOException e) {
            System.out.println("Erro ao ler ou escrever arquivos: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
