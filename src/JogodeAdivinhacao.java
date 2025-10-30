import java.util.Scanner;

public class JogodeAdivinhacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double DOLAR = 5.50; // taxa fixa
        final double EURO  = 6.00;

        System.out.print("Digite o valor em reais: R$ ");
        double reais = sc.nextDouble();

        System.out.print("Converter para (1) Dólar ou (2) Euro? ");
        int opcao = sc.nextInt();

        if (opcao == 1)
            System.out.printf("US$ %.2f%n", reais / DOLAR);
        else if (opcao == 2)
            System.out.printf("€ %.2f%n", reais / EURO);
        else
            System.out.println("Opção inválida.");

        sc.close();
    }
}
