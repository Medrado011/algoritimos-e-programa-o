import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int candidato1 = 0, candidato2 = 0, candidato3 = 0, candidato4 = 0;
        int nulos = 0, brancos = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o voto do eleitor " + i + " (1-4 = candidato, 5 = nulo, 6 = branco): ");
            int voto = e.nextInt();
            switch (voto) {
                case 1: candidato1++; break;
                case 2: candidato2++; break;
                case 3: candidato3++; break;
                case 4: candidato4++; break;
                case 5: nulos++; break;
                case 6: brancos++; break;
                default: System.out.println("Voto inválido! Não será contabilizado."); i--; break;
            }
        }
        System.out.println("\n--- Resultado da eleição ---");
        System.out.println("Candidato 1: " + candidato1 + " votos");
        System.out.println("Candidato 2: " + candidato2 + " votos");
        System.out.println("Candidato 3: " + candidato3 + " votos");
        System.out.println("Candidato 4: " + candidato4 + " votos");
        System.out.println("Votos nulos: " + nulos);
        System.out.println("Votos em branco: " + brancos);
        int totalVotos = 10;
        double percentualNulosBrancos = ((nulos + brancos) * 100.0) / totalVotos;
        System.out.printf("Percentual de nulos + brancos: %.2f%%\n", percentualNulosBrancos);
        e.close();
    }
}

