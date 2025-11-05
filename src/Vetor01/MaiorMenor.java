package Vetor01;

import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[10];

        System.out.println("===Descobir se é maior ou menor===");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° Número: ");
            numeros[i] = sc.nextDouble();
        }
        double menor = numeros[0];
        double maior = numeros[0];

        for (double numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }
        // Varificar se os números são iguais
        if (menor == maior) {
            System.out.println("\nERRO: todos os números são iguais!");
        } else {
            System.out.println("\nValores digitados:");
            for (double n : numeros) {
                System.out.println(n);
            }
            System.out.println("\nMaior valor: " + maior);
            System.out.println("\nMenor valor: " + menor);
            sc.close();
        }
    }
}