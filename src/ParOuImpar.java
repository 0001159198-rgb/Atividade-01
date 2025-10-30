import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        System.out.println("=== Par ou impar ===");
        Scanner sc = new  Scanner(System.in);
        System.out.print("Digite um número: ");
        int i = sc.nextInt();

        if (i % 2 == 0) {
            System.out.println("o número "+i+" é par");
        }
        else {
            System.out.println("o número "+i+" é ímpar");
        }
    }
}
