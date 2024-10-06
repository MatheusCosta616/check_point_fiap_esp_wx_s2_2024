package br.com.fiap.twoespwx.libunclepresser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {
    public static  List<String> readFile(String file) throws IOException {
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        }
        return lines;
    }

    public static long getFileSize(String file) throws  IOException {
        return Files.size(Paths.get(file));
    }

    public static void writeFile(String file, String content) throws IOException {
        Files.write(Paths.get(file), content.getBytes());
    }
}