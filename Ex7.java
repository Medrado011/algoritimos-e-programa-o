import java.util.Scanner;

public class Ex7 {
    public static long calcularFatorial(int numero) {
        long fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = e.nextInt();
        long resultado = calcularFatorial(num);
        System.out.println("O fatorial de " + num + " é: " + resultado);
        e.close();
    }
}
