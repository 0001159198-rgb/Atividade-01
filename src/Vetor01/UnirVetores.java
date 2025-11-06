package Vetor01;

import java.util.Scanner;

public class UnirVetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int[] vetorC = new int[10]; // resultado de (A + B)

        // Ler o primeiro vetor
        System.out.println("Digite 5 números para o primeiro vetor:");
        for (int i = 0; i < 5; i++) {
            System.out.print("A[" + i + "]: ");
            vetorA[i] = sc.nextInt();
        }

        // Leitura do segundo vetor
        System.out.println("\nDigite 5 números para o segundo vetor:");
        for (int i = 0; i < 5; i++) {
            System.out.print("B[" + i + "]: ");
            vetorB[i] = sc.nextInt();
        }

        // Preenche o terceiro vetor com os valores de A e B
        for (int i = 0; i < 5; i++) {
            vetorC[i] = vetorA[i];      // primeiros 5 elementos
            vetorC[i + 5] = vetorB[i];  // próximos 5 elementos
        }

        // Exibe o vetor resultante
        System.out.println("\nVetor resultante (A + B):");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetorC[i] + " ");
        }

        sc.close();
    }
}
