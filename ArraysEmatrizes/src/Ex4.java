import java.util.Scanner;

public class Ex4 {
    public static boolean isPar(int numero) {
        return numero % 2 == 0;
    }
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        while (true) {
            System.out.print("Digite um número acima de 0 (ou 0 para sair): ");
            int num = e.nextInt();
            if (num == 0) {
                System.out.println("Programa encerrado.");
                break;
            }
            if (isPar(num)) {
                System.out.println("Número par");
            } else {
                System.out.println("Número ímpar");
            }
        }
        e.close();
    }
}