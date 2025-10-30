import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        String[] nomes = new String[5];
        System.out.println("Digite 5 nomes:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = e.nextLine();
        }
        System.out.println("\nNomes do último para o primeiro:");
        for (int i = 4; i >= 0; i--) {
            System.out.println(nomes[i]);
        }
        System.out.println("\nPrimeiro nome armazenado: " + nomes[0]);
        System.out.println("Último nome armazenado: " + nomes[4]);
        e.close();
    }
}
