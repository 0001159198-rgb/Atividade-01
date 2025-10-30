import java.util.Scanner;

public class SomaImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite N: ");
        int n = sc.nextInt();

        int soma = 0;
        for (int i = 1; i <= n; i += 2) {
            soma += i;
        }

        System.out.println("Soma dos ímpares de 1 até " + n + " = " + soma);
        sc.close();
    }
}
