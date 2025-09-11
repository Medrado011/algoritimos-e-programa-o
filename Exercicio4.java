import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner e=new Scanner(System.in);
        System.out.println("Insira seu salario:");
        double salario = e.nextDouble();
        System.out.println("=== Selecione de qual plano você faz parte ===");
        System.out.println("");
        System.out.println("A-Plano A");
        System.out.println("B-Plano B");
        System.out.println("C-Plano C");
        char menu = e.next().toUpperCase().charAt(0);
        switch (menu) {
            case 'A':
                System.out.println("Parabens você recebeu um aumento de 10%, seu novo salario é de R$"+ (salario+(salario*0.10)) );
                break;
            case 'B':
                System.out.println("Parabens você recebeu um aumento de 15%, seu novo salario é de R$"+ (salario+(salario*0.15)) );
                break;
            case 'C':
                System.out.println("Parabens você recebeu um aumento de 20%, seu novo salario é de R$"+ (salario+(salario*0.20)) );
                break;
            default:
                System.out.println("Plano não existente");

        }
        e.close();
    }
}
