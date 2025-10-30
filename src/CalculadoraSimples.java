import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Calculadora Simples ===");
        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        char operacao = sc.next().charAt(0); // lê o primeiro caractere digitado

        double resultado;

        // Estrutura if-else para escolher a operação
        if (operacao == '+') {
            resultado = num1 + num2;
            System.out.println("Resultado: " + resultado);
        } else if (operacao == '-') {
            resultado = num1 - num2;
            System.out.println("Resultado: " + resultado);
        } else if (operacao == '*') {
            resultado = num1 * num2;
            System.out.println("Resultado: " + resultado);
        } else if (operacao == '/') {
            if (num2 != 0) {
                resultado = num1 / num2;
                System.out.println("Resultado: " + resultado);
            } else {
                System.out.println("Erro: divisão por zero não é permitida!");
            }
        } else {
            System.out.println("Operação inválida!");
        }

        sc.close(); // Boa prática: fecha o Scanner
    }
}