import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int count = 1;
        int dentroFaixa = 0;
        while (count <= 10) {
            System.out.println("\nInsira a altura da " + count + "ª pessoa (em metros): ");
            double altura = e.nextDouble();
            System.out.println("insira o peso da " + count + "ª pessoa (em kg): ");
            double peso = e.nextDouble();
            double imc = peso / (altura * altura);
            if (imc >= 18.5 && imc <= 24.9) {
                dentroFaixa++;
            }
            count++;
        }
        System.out.println("Quantidade de pessoas com IMC normal: " + dentroFaixa);
        e.close();
    }
}
