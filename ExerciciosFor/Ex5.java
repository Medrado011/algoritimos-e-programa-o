import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        double n1, n2, media;
        String nome;
        int aprovados = 0;
        int exame = 0;
        int reprovados = 0;
        double somaMedias = 0;
        for (int i = 1; i <= 6; i++) {
            System.out.println("Digite o nome do aluno "+i+" :");
            nome = e.next();
            System.out.print("Digite a primeira nota da pessoa " + i + ": ");
            n1 = e.nextDouble();
            System.out.print("Digite a segunda nota da pessoa " + i + " : ");
            n2 = e.nextDouble();
            media = (n1 + n2) / 2;
            somaMedias += media;
            if (media <= 3) {
                System.out.println("A média de aluno "+nome+" é " + media + "REPROVADO\n");
                reprovados++;
            } else if (media > 3 && media < 7) {
                System.out.println("A média de aluno "+nome+" é " + media + " EXAME\n");
                exame++;
            } else { // media >= 7
                System.out.println("A média de aluno "+nome+" é " + media + " APROVADO\n");
                aprovados++;
            }
        }
        double mediaClasse = somaMedias / 6;
        System.out.println("Total de alunos aprovados: " + aprovados);
        System.out.println("Total de alunos de exame: " + exame);
        System.out.println("Total de alunos reprovados: " + reprovados);
        System.out.printf("Média da classe: %.2f%n", mediaClasse);

        e.close();
    }
}


