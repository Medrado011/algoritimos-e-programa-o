import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        double numero1, numero2;
        System.out.println("Insira seu primeiro numero: ");
        numero1 = e.nextDouble();
        System.out.println("Insira seu segundo numero: ");
        numero2 = e.nextDouble();
        System.out.println("=====Selecione uma opção=====");
        System.out.println("");
        System.out.println("M-Media entre os numeros");
        System.out.println("S-Diferença entre os numeros");
        System.out.println("P-Produto entre os numeros");
        System.out.println("D-Divisão do primeiro pelo segundo");
        char menu = e.next().toUpperCase().charAt(0);
        switch (menu) {
            case 'M':
                System.out.printf("A media entre os numeros é %.2f: ",(numero1 / numero2));
                break;
            case 'S':
                if (numero1 > numero2) {
                    System.out.println("A diferença entre os numeros é: " + (numero1 - numero2));
                } else {
                    System.out.println("A diferença entre os numeros é: " + (numero2 - numero1));
                }
                break;
            case 'P':
                System.out.println("O produto dos numeros indicados é " + (numero1 * numero2));
                break;
            case 'D':
                System.out.println("O resultado da divisão é " + (numero1 / numero2));
                break;
            default:
                System.out.println("A opção não existe");

        }
        e.close();
    }
}
