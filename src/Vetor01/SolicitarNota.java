package Vetor01;

import java.util.Scanner;

public class SolicitarNota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[5];
        double soma = 0;

        // Solicita as 5 notas
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }

        // Calcula a média
        double media = soma / notas.length;

        // Exibe as notas e a média
        System.out.println("\nNotas digitadas:");
        for (double nota : notas) {
            System.out.println(nota);
        }

        System.out.printf("\nMédia das notas: %.2f\n", media);

        sc.close();
    }
}
