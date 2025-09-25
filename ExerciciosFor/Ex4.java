import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double somaAlturas = 0;
        int count = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = sc.nextInt();
            System.out.print("Digite a altura da pessoa " + i + " (ex: 1.75): ");
            double altura = sc.nextDouble();
            if (idade > 50) {
                somaAlturas += altura;
                ++count;
            }
        }
        if (count > 0) {
            double media = somaAlturas / count;
            System.out.printf("A média das alturas das pessoas com mais de 50 anos é: %.2f metros%n", media);
        } else {
            System.out.println("Não há pessoas com mais de 50 anos.");
        }
    }
}
