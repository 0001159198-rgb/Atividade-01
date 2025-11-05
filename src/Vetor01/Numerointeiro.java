import java.util.Scanner;

public class Numerointeiro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma = 0; // variável para acumular a soma
        
        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            soma += numeros[i]; // Vai  comular as soma realizadas
        }

        // Exibição dos resultados
        System.out.println("\nOs números digitados foram:");
        for (int num : numeros) {
            System.out.println(num);
        }

        System.out.println("\nA soma total dos valores é: " + soma);

        sc.close();
    }
}
