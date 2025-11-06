package Vetor01;

import java.util.Scanner;

public class NumerosPositivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];

        // Ler os 10 números
        System.out.println("Digite 10 números (positivos ou negativos): ");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // Exibe apenas os números positivos
        System.out.println("\nNúmeros positivos digitados: ");
        for (int i = 0; i < 10; i++) {
            if (numeros[i] > 0) { // verifica se o número é positivo
                System.out.println(numeros[i]);
            }
        }

        sc.close();
    }
}
