import java.util.Scanner;

public class MaiordeDoisNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] n = new float[2];

        for(int i=0; i <n.length; i++) {
            System.out.print("Digite o " + (i+1) + "° número: ");
            n[i]= sc.nextFloat();
        }
        if (n[0] == n[1]){
            System.out.println("Os números são iguais");
            sc.close();
        }
        else {
            if (n[0] > n[1]) {
                System.out.print("O número " + n[0] + " é o maior");
            } else {
                System.out.print("O número " + n[1] + " é o maior");
            }
        }
    }
}
