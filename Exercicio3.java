
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner e=new Scanner(System.in);
        System.out.println("===A qual horario você pertence? ===");
        System.out.println("");
        System.out.println("M-Matutino");
        System.out.println("V-Vespertino");
        System.out.println("N-Noturno");
        char menu = e.next().toUpperCase().charAt(0);
        switch (menu){
            case 'M':
                System.out.println("Bom dia");
                break;
            case 'V':
                System.out.println("Boa tarde");
                break;
            case 'N':
                System.out.println("Boa noite");
                break;
            default:
                System.out.println("A opção não existe");
        }
        e.close();
    }
}
