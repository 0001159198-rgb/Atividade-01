import java.util.Scanner;

public class TabuadaInvertida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para ver sua tabuada invertida: ");
        int n = sc.nextInt();

        for (int i = 10; i >= 1; i--) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        sc.close();
    }
}
