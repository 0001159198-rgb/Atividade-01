import java.util.Scanner;

public class SomaSimples {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in); // Utilizo o Scanner coletar as informações presentes do codigo
        float[] notas = new float[2]; // utilizo int[] para amarzenar as informações de notas

        for(int i=0; i <notas.length; i++) { //Utilizo um loop para preencer cada informação
            System.out.print("Digite a nota " + (i+1) + ": ");
            notas[i]= sc.nextFloat();
        }

        float soma = notas[0] + notas[1];

        System.out.println("O valorda soma deu: " + soma); // Utilizo o 'notas[0] +notas[1]' para mostrar asoma dos resultados
        sc.close();
    }
}