import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[5];
        System.out.println("Digite 5 números inteiros para o vetor A:");
        for (int i = 0; i < 5; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = e.nextInt();
        }
        System.out.println("\nDigite 5 números inteiros para o vetor B:");
        for (int i = 0; i < 5; i++) {
            System.out.print("B[" + i + "]: ");
            B[i] = e.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            C[i] = A[i] - B[i];
        }
        System.out.println("\nElementos do vetor C (A - B):");
        for (int i = 0; i < 5; i++) {
            System.out.println("C[" + i + "] = " + C[i]);
        }
        e.close();
    }
}
