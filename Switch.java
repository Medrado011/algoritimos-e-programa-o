import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("====Escolha uma opção====");
        System.out.println("1-cadastrar produtos");
        System.out.println("2-Listar produtos");
        System.out.println("3-Remover um produto");
        System.out.println("4-Sair do programa");
        int menu = e.nextInt();
        switch(menu) {
            case 1:
                System.out.println("Você escolheu a opção 1");
                System.out.println("Que é a opção de adicionar um produto");
                break;
            case 2:
                System.out.println("Você escolheu a opção 2 ");
                System.out.println("Que é a opção de listar os produtos");
                break;
            case 3:
                System.out.println("Você escolheu a opção 3");
                System.out.println("Que é a opção de remover um programa");
                break;
            case 4:
                System.out.println("Você escolheu a opção 4");
                System.out.println("Saindo do programa...");
                break;
            default:
                System.out.println("Item invalido");

        }
e.close();
    }

}