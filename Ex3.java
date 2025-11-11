import java.util.Scanner;

public class Ex3 {
    public static int encontrarMax(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int a = e.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = e.nextInt();
        int maior = encontrarMax(a, b);
        System.out.println("O maior valor é: " + maior);
        e.close();
    }
}
