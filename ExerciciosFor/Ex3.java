import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner e= new Scanner(System.in);
        System.out.println("Digite um valor inteiro: ");
        for (int i = e.nextInt(); i >= 1; --i) {
            System.out.println(i);
        }
    }
}