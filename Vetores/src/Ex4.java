import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int[] A = new int[5];
        int[] B = new int[5];
        System.out.println("Digite 5 números inteiros para o vetor A:");
        for (int i = 0; i < 5; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = e.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            B[i] = A[i] * 3;
        }
        System.out.println("\nElementos do vetor B (A * 3):");
        for (int i = 0; i < 5; i++) {
            System.out.println("B[" + i + "] = " + B[i]);
        }

        e.close();
    }
}
