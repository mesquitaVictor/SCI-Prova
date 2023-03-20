import java.util.Scanner;
public class quatroJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criando o vetor de 5 posições
        int[] vetor = new int[5];

        // Solicitando os números e armazenando no vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = sc.nextInt();
        }

        // Imprimindo o valor na posição 3 (índice 2)
        System.out.println("O valor na posição 3 é: " + vetor[2]);
        sc.close();
    }
}
    
