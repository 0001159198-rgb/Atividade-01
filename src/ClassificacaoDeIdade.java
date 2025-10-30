import java.util.Scanner;

public class ClassificacaoDeIdade {
    public static void main(String[] args) {
        System.out.println("== Classificação de Idade ==");
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a sua idade: ");
        int idade = sc.nextInt();

        if (idade < 0) {
            System.out.println("Idade inválida");
        } else if (idade < 12) {
            System.out.println("Você está classificado como Criança");
        } else if (idade < 18) {
            System.out.println("Você está classificado como Adolescente");
        } else if (idade < 60) {
            System.out.println("Você está classificado como Adulto");
        } else {
            System.out.println("Você está classificado como Idoso");
        }

        sc.close();
    }
}
