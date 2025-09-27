import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int qtdMais50 = 0, qtdEntre10e20 = 0, qtdPesoMenor40 = 0;
        double somaAlturas10a20 = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Idade da pessoa " + i + ": ");
            int idade = e.nextInt();
            System.out.print("Altura da pessoa " + i + " (em metros): ");
            double altura = e.nextDouble();
            System.out.print("Peso da pessoa " + i + " (em kg): ");
            double peso = e.nextDouble();
            if (idade > 50) qtdMais50++;
            if (idade >= 10 && idade <= 20) { somaAlturas10a20 += altura; qtdEntre10e20++; }
            if (peso < 40) qtdPesoMenor40++;
        }
        double mediaAlturas10a20 = qtdEntre10e20 > 0 ? somaAlturas10a20 / qtdEntre10e20 : 0;
        double percentualPesoMenor40 = (qtdPesoMenor40 * 100.0) / 10;
        System.out.println("\n--- Resultados ---");
        System.out.println("Quantidade de pessoas com mais de 50 anos: " + qtdMais50);
        System.out.printf("Média das alturas (10 a 20 anos): %.2f\n", mediaAlturas10a20);
        System.out.printf("Porcentagem de pessoas com peso < 40 kg: %.2f%%\n", percentualPesoMenor40);
        e.close();
    }
}
