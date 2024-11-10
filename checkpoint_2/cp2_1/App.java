package com.example.cp2_1;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    private NucleotideoRandomGenerator nurad;
    private Scanner scanner = new Scanner(System.in);

    public App(NucleotideoRandomGenerator nurad) {
        this.nurad = nurad;
    }

    public void controllerImplementacao(int entrada) {
        String resultado = nurad.generate(entrada);
        System.out.println("Resultado: " + resultado);
    }

    public static void main(String[] args) {
        NucleotideoRandomGenerator generator = new NucleotideoRandomGeneratorImpl();
        App app = new App(generator);

        System.out.println("Digite o numero:");
        Scanner scanner = new Scanner(System.in);
        int entrada = scanner.nextInt();
        app.controllerImplementacao(entrada);
    }
}
