import java.util.Scanner;

public class ConversordeTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Conversor de Temperatura ===");
        System.out.println("Escolha a conversão:");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");
        System.out.print("Opção: ");
        int opcao = sc.nextInt();

        double temperatura, resultado;

        if (opcao == 1) {
            // Celsius → Fahrenheit
            System.out.print("Digite a temperatura em Celsius: ");
            temperatura = sc.nextDouble();
            resultado = (temperatura * 9 / 5) + 32;
            System.out.println("A temperatura em Fahrenheit é: " + resultado + " °F");
        } else if (opcao == 2) {
            // Fahrenheit → Celsius
            System.out.print("Digite a temperatura em Fahrenheit: ");
            temperatura = sc.nextDouble();
            resultado = (temperatura - 32) * 5 / 9;
            System.out.println("A temperatura em Celsius é: " + resultado + " °C");
        } else {
            System.out.println("Opção inválida!");
        }

        sc.close();
    }
}