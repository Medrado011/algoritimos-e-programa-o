import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("=== Escolha um mes === ");
        System.out.println("1-Janeiro");
        System.out.println("2-Fevereiro");
        System.out.println("3-Março");
        System.out.println("4-Abril");
        System.out.println("5-Maio");
        System.out.println("6-Junho");
        System.out.println("7-Julho");
        System.out.println("8-Agosto");
        System.out.println("9-Setembro");
        System.out.println("10-Outubro");
        System.out.println("11-Novembro");
        System.out.println("12-Dezembro");
        System.out.println("13-Encerrar Programa");
        int menu = e.nextInt();
        switch (menu) {
            case 1:
                System.out.println("Você escolheu Janeiro");
                break;
            case 2:
                System.out.println("Você escolheu Fevereiro");
                break;
            case 3:
                System.out.println("Você escolheu Março");
                break;
            case 4:
                System.out.println("Você escolheu Abril");
                break;
            case 5:
                System.out.println("Você escolheu Maio");
                break;
            case 6:
                System.out.println("Você escolheu Junho");
                break;
            case 7:
                System.out.println("Você escolheu Julho");
                break;
            case 8:
                System.out.println("Você escolheu Agosto");
                break;
            case 9:
                System.out.println("Você escolheu Setembro");
                break;
            case 10:
                System.out.println("Você escolheu Outubro");
                break;
            case 11:
                System.out.println("Você escolheu Novembro");
                break;
            case 12:
                System.out.println("Você escolheu Dezembro");
                break;
            case 13:
                System.out.println("Você escolheu encerrar");
                System.out.println("Saindo do programa...");
                break;
            default:
                System.out.println("A opção não existe");
        }
        e.close();
    }

}
