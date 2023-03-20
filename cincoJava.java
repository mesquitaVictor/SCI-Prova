import java.util.Scanner;
public class cincoJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] nomes = new String[3];
        double[][] notas = new double[3][4];
        
        // Solicita nomes e notas dos alunos
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome do aluno " + (i+1) + ": ");
            nomes[i] = scanner.nextLine();
            
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("Digite a nota " + (j+1) + " de " + nomes[i] + ": ");
                notas[i][j] = scanner.nextDouble();
            }
            scanner.nextLine(); // consome o caractere de quebra de linha
        }
        
        // Calcula a média de cada aluno e encontra o mínimo e o máximo
        double mediaMax = 0, mediaMin = Double.MAX_VALUE;
        String nomeMax = "", nomeMin = "";
        
        for (int i = 0; i < nomes.length; i++) {
            double media = 0;
            for (int j = 0; j < notas[i].length; j++) {
                media += notas[i][j];
            }
            media /= notas[i].length;
            
            System.out.println(nomes[i] + ": " + media);
            
            if (media > mediaMax) {
                mediaMax = media;
                nomeMax = nomes[i];
            }
            if (media < mediaMin) {
                mediaMin = media;
                nomeMin = nomes[i];
            }
        }
        
        System.out.println("Maior média: " + nomeMax + " (" + mediaMax + ")");
        System.out.println("Menor média: " + nomeMin + " (" + mediaMin + ")");
        scanner.close();
    
    }
}
    
