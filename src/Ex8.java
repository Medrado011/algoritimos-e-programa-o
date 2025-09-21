import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int count = 1;
        while (count <= 5) {
            double n1, n2;
            do {
                System.out.print("Digite a 1ª nota do aluno " + count + " (0 a 10): ");
                n1 = e.nextDouble();
                if (n1 < 0 || n1 > 10) {
                    System.out.println("Nota inválida! Digite novamente.");
                }
            } while (n1 < 0 || n1 > 10);
            do {
                System.out.print("Digite a 2ª nota do aluno " + count + " (0 a 10): ");
                n2 = e.nextDouble();
                if (n2 < 0 || n2 > 10) {
                    System.out.println("Nota inválida! Digite novamente.");
                }
            } while (n2 < 0 || n2 > 10);
            double media = (n1 + n2) / 2.0;
            System.out.println("Média do aluno " + count + "é: " + media + "\n");
            count++;
        }
        e.close();
    }
}
