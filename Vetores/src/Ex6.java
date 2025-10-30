import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int[] A = new int[4];
        int[] B = new int[7];
        int[] C = new int[11];
        System.out.println("Digite 4 números inteiros para o vetor A:");
        for (int i = 0; i < 4; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = e.nextInt();
        }
        System.out.println("\nDigite 7 números inteiros para o vetor B:");
        for (int i = 0; i < 7; i++) {
            System.out.print("B[" + i + "]: ");
            B[i] = e.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            C[i] = A[i];
        }
        for (int i = 0; i < 7; i++) {
            C[i + 4] = B[i];
        }
        System.out.println("\nElementos do vetor C (junção de A e B):");
        for (int i = 0; i < 11; i++) {
            System.out.print(C[i] + " ");
        }
        e.close();
    }
}
