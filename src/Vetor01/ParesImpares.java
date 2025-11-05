package Vetor01;

import java.util.Scanner;

public class ParesImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];

        System.out.println("===Descobir se é Par ou Ímpar===");
        for (int i = 0; i < num.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° Número: ");
            num[i] = sc.nextInt();
        }

        System.out.println("\nOs números digitados foram:");
        for (int n : num) {
            System.out.println(n);
        }

        System.out.println("\n Os números pares são: " );
        for (int n : num) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        }
        System.out.println("\n Os números Ímpares: ");
        for (int n : num) {
            if (n % 2 == 1) {
                System.out.println(n);
            }
        }
        sc.close();
    }
}
