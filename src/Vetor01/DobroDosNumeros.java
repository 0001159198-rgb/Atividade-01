package Vetor01;

import java.util.Scanner;

public class DobroDosNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declaração dos vetores
        int[] numeros = new int[5];
        int[] dobro = new int[5];

        // Leitura dos 5 números
        System.out.println("Digite 5 números: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            dobro[i] = numeros[i] * 2; // já calcula o dobro
        }

        // Exibição dos vetores lado a lado
        System.out.println("\nNúmero | Dobro");
        System.out.println("----------------");
        for (int i = 0; i < 5; i++) {
            System.out.println("   " + numeros[i] + "   |   " + dobro[i]);
        }

        sc.close();
    }
}
