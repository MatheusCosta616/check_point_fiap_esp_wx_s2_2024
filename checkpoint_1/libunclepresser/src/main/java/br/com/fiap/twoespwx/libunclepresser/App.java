/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 *
 * Grupo: Quarteto Sinistro
 * Autores:
 *      -Caíque Walter Silva - RM550693
 *      -Guilherme Nobre Bernardo - RM98604
 *      -Matheus José de Lima Costa - RM551157
 *      -Felipe Heilmann Marques - 551026
 */

package br.com.fiap.twoespwx.libunclepresser;

import java.io.IOException;
import java.util.List;

public class App {
    public static void main(String[] args) {
        String inputFile = args[0];
        String outputFile = args[1];

        NucleotidesCompresser nucleotidesCompresser = new NucleotidesCompresser();

        try {
            List<String> inputLines = FileHandler.readFile(inputFile);

            StringBuilder compressedOutput = new StringBuilder();
            for (String line : inputLines) {
                line = line.trim();

                compressedOutput.append(nucleotidesCompresser.compress(line)).append(System.lineSeparator());
            }

            FileHandler.writeFile(outputFile, compressedOutput.toString());


            SummaryPrinter.printSummary(inputFile, outputFile, inputLines, compressedOutput.toString());
        } catch (IOException e) {
            System.err.println("Erro ao processar os arquivos: " + e.getMessage());
        }
    }
}
