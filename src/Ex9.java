import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int codigo, quantidade;
        double totalCompra = 0.0;
        do {
            System.out.print("Insira o código do produto ou aperte 0 para encerrar: ");
            codigo = e.nextInt();
            if (codigo == 0) break; // condição de saída
            System.out.print("Insira a quantidade: ");
            quantidade = e.nextInt();
            double preco = 0.0;
            String produto = "";
            switch (codigo) {
                case 100:
                    produto = "Cachorro quente";
                    preco = 1.20;
                    break;
                case 101:
                    produto = "Bauru Simples";
                    preco = 1.30;
                    break;
                case 102:
                    produto = "Bauru com ovo";
                    preco = 1.50;
                    break;
                case 103:
                    produto = "Hambúrguer";
                    preco = 1.20;
                    break;
                case 104:
                    produto = "Cheeseburguer";
                    preco = 1.30;
                    break;
                case 105:
                    produto = "Refrigerante";
                    preco = 1.00;
                    break;
                default:
                    System.out.println("Código inválido!");
            }
            double totalProduto = preco * quantidade;
            totalCompra += totalProduto;
            System.out.println("Produto: " + produto);
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Total do produto: R$ " + totalProduto + "\n");
        } while (codigo != 0);
        System.out.println("Total da compra: R$ " + totalCompra);
        e.close();
    }
}
