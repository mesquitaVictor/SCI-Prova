import java.util.Scanner;
public class tresJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.println("Digite o nome do aluno:");
            String nome = scanner.nextLine();

            double nota1, nota2, nota3, nota4;
            System.out.println("Digite a primeira nota:");
            nota1 = scanner.nextDouble();
            System.out.println("Digite a segunda nota:");
            nota2 = scanner.nextDouble();
            System.out.println("Digite a terceira nota:");
            nota3 = scanner.nextDouble();
            System.out.println("Digite a quarta nota:");
            nota4 = scanner.nextDouble();

            double media = (nota1 + nota2 + nota3 + nota4) / 4;

            System.out.printf("O aluno %s obteve média %.1f e está ", nome, media);
            if (media >= 6.0) {
                System.out.println("APROVADO.");
            } else {
                System.out.println("REPROVADO.");
            }

            scanner.nextLine(); // Limpa o buffer do scanner

            System.out.println("Deseja continuar (S/N)?");
            String resposta = scanner.nextLine();
            continuar = resposta.equalsIgnoreCase("S");
        }

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
    
