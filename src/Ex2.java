import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int pares, impares, count, numero;
        count = 1;
        pares = 0;
        impares = 0;
        while (count <= 10) {
            System.out.println("Insira o " + count + "°Numero");
            numero = e.nextInt();
            if (numero % 2 == 0) {
                pares++;

            } else {
                impares++;
            }
            count++;
        }
        System.out.println("\n\nNumeros Pares: " + pares);
        System.out.println("Numeros Impares: " + impares);
        e.close();
    }
}