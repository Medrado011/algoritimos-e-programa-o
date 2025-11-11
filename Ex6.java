public class Ex6 {
    public static int encontrarMax(int[] vetor) {
        int max = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > max) {
                max = vetor[i];
            }
        }
        return max;
    }
    public static int encontrarMin(int[] vetor) {
        int min = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < min) {
                min = vetor[i];
            }
        }
        return min;
    }
    public static double calcularMediaMaxMin(int[] vetor) {
        int max = encontrarMax(vetor);
        int min = encontrarMin(vetor);
        return (max + min) / 2.0;
    }
    public static void main(String[] args) {
        int[] numeros = {5, 8, 2, 10, 3, 7};
        int maior = encontrarMax(numeros);
        int menor = encontrarMin(numeros);
        double media = calcularMediaMaxMin(numeros);
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Média entre max e min: " + media);
    }
}
