import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        System.out.println("=== Selecione um dia da semana ===");
        System.out.println("1-Domingo");
        System.out.println("2-Segunda-Feira");
        System.out.println("3-Terça-Feira");
        System.out.println("4-Quarta-Feira");
        System.out.println("5-Quinta-Feira");
        System.out.println("6-Sexta-Feira");
        System.out.println("7-Sabado");
        System.out.println("8- Encerrar sistema");
        int menu = e.nextInt();
        switch (menu) {
            case 1:
                System.out.println("Você escolheu Domingo");
                break;
            case 2:
                System.out.println("Você escolheu Segunda-Feira ");
                break;
            case 3:
                System.out.println("Você escolheu Terça-Feira");
                break;
            case 4:
                System.out.println("Você escolheu Quarta-Feira");
                break;
            case 5:
                System.out.println("Você escolheu Quinta-Feira");
                break;
            case 6:
                System.out.println("Você escolheu Sexta-Feira");
                break;
            case 7:
                System.out.println("Você escolheu Sabado");
                break;
            case 8:
                System.out.println("Você escolheu Sair do programa");
                System.out.println("Encerrando serviço...");
                break;
            default:
                System.out.println("A opção não existe");
        }
        e.close();
    }
}
