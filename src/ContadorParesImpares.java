import java.util.Scanner;

public class ContadorParesImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pares = 0, impares = 0;

        System.out.print("Quantos números deseja digitar? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int num = sc.nextInt();
            if (num % 2 == 0)
                pares++;
            else
                impares++;
        }

        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);
        sc.close();
    }
}
