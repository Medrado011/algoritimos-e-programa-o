import java.util.Random;

public class Ex3 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] numeros = new int[10];
        int menor;
        System.out.println("Números sorteados:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = r.nextInt(10) + 1;
            System.out.print(numeros[i] + " ");
        }
        menor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println("\nMenor número: " + menor);
    }
}