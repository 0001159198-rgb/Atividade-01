import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Base (a): ");
        int a = sc.nextInt();
        System.out.print("Expoente (b): ");
        int b = sc.nextInt();

        int resultado = 1;
        for (int i = 1; i <= b; i++) {
            resultado *= a;
        }

        System.out.println(a + "^" + b + " = " + resultado);
        sc.close();
    }
}
