package Vetor01;

import java.util.Scanner;

public class OrdemInversa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[8];

        System.out.println("===Ordem Invertida===");
        for(int i=0; i < num.length; i++){
            System.out.print("Digite o " + (i+1) + " número: ");
            num[i]=sc.nextInt();
        }

        System.out.println("\nOs números em ordem inversa são:");
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.println(num[i]);
        }
        sc.close();
    }
}
