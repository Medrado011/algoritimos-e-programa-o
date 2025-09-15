import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("\n\nCódigo          Produto          Preço\n\n" +
                "100         Cachorro Quente      R$1.20\n" +
                "101         Bauru Simples        R$1.30\n" +
                "102         Bauru com ovo        R$1.50\n" +
                "103         Hambúrguer           R$1.20\n" +
                "104         ChesseBurguer        R$1.30\n" +
                "105         Refrigerante         R$1.00");
        System.out.println("\nDigite o codigo do produto que deseja comprar:");
        int menu = e.nextInt();
        System.out.println("\nDigite a quantidade que deseja comprar:");
        int quantidade = e.nextInt();
        switch (menu) {
            case 100:
                System.out.println("Você ira pagar R$" + (quantidade * 1.20) + " por " + quantidade + " Cachorro Quente");

                break;
            case 101:
                System.out.println("Você ira pagar R$" + (quantidade * 1.30) + " por " + quantidade + " Cachorro Quente");

                break;
            case 102:
                System.out.println("Você ira pagar R$" + (quantidade * 1.50) + " por " + quantidade + " Cachorro Quente");

                break;
            case 103:
                System.out.println("Você ira pagar R$" + (quantidade * 1.20) + " por " + quantidade + " Cachorro Quente");

                break;
            case 104:
                System.out.println("Você ira pagar R$" + (quantidade * 1.30) + " por " + quantidade + " Cachorro Quente");

                break;
            case 105:
                System.out.println("Você ira pagar R$" + (quantidade * 1.00) + " por " + quantidade + " Cachorro Quente");

                break;
        }
    }
}
