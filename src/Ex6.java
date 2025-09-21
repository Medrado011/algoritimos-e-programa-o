import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int count = 1;
        int numero;
        int menor = 0;
        while (count <= 10) {
            System.out.println("Insira o seu " + count + "°Numero: ");
            numero = e.nextInt();
            if (count == 1 || numero < menor) {
                menor = numero;
            }
            count++;
        }
        System.out.println("O menor numero é " + menor);
        e.close();
    }
}
