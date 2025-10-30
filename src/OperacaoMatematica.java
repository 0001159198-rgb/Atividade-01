import java.util.Scanner;

public class OperacaoMatematica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] notas = new float[2];

        for(int i=0; i <notas.length; i++) { //Utilizo um loop para preencer cada informação
            System.out.print("Digite a nota " + (i+1) + ": ");
            notas[i]= sc.nextFloat();
        }

        float soma = notas[0] + notas[1];
        float subtracao = notas[0] - notas[1];
        float multiplicando = notas[0] * notas[1];
        float divisao = notas[0] / notas[1];


        System.out.println("O valor da soma deu: " + soma); // Utilizo o 'notas[0] +notas[1]' para mostrar asoma dos resultados
        System.out.println("O valor da subratação deu: " + subtracao);
        System.out.println("O valor da multiplicação deu: " + multiplicando);
        System.out.println("O valor da divisão deu: " + divisao);
        sc.close();
    }
}
