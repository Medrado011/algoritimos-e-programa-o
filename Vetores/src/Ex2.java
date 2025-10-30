import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int[] numeros = new int[10];
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = e.nextInt();
        }
        System.out.println("\nNúmeros pares:");
        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i] + " ");
            }
        }
        System.out.println("\n\nNúmeros ímpares:");
        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.print(numeros[i] + " ");
            }
        }
        e.close();
    }
}
