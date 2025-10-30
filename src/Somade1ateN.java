import java.util.Scanner;

public class Somade1ateN {
    public static void main(String[] args) {
        System.out.println("== Soma de 1 até N ==");
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número N: ");
        int n = sc.nextInt();

        int soma = 0;

        for (int i = 1; i <= n; i++) {
            soma += i;
        }

        System.out.println("A soma de 1 até " + n + " é: " + soma);

        sc.close();
    }
}
