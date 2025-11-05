package Vetor01;

import java.util.Scanner;

public class BuscaNome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[10];

        System.out.println("=== Cadastro de Nomes ===");

        // Lê 10 nomes
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome do " + (i + 1) + "° aluno: ");
            nomes[i] = sc.nextLine();
        }

        // Solicita um nome para buscar
        System.out.print("\nDigite um nome para buscar: ");
        String busca = sc.nextLine();

        // Verifica se o nome está no vetor
        boolean encontrado = false;
        for (String nome : nomes) {
            if (nome.equalsIgnoreCase(busca)) { // ignora maiúsculas/minúsculas
                encontrado = true;
                break;
            }
        }

        // Exibe o resultado
        if (encontrado) {
            System.out.println("\n O nome \"" + busca + "\" está na lista");
        } else {
            System.out.println("\n O nome \"" + busca + "\" não foi encontrado na lista.");
        }

        sc.close();
    }
}

