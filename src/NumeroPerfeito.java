import java.util.Scanner;

public class NumeroPerfeito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        int somaDivisores = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) somaDivisores += i;
        }

        if (somaDivisores == n)
            System.out.println(n + " é um número perfeito!");
        else
            System.out.println(n + " não é perfeito.");

        sc.close();
    }
}
