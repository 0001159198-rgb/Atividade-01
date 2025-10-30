import java.util.Scanner;

public class ValidacaoSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Crie uma senha: ");
        String senha = sc.nextLine();

        if (senha.length() >= 6)
            System.out.println("Senha válida!");
        else
            System.out.println("Senha inválida! Deve conter pelo menos 6 caracteres.");

        sc.close();
    }
}
