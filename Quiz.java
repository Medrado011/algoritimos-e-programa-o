import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        boolean executando = true;

        // Vetores base de perguntas
        String[] perguntas = new String[20];
        String[][] alternativas = new String[20][4];
        int[] respostasCorretas = new int[20];
        int totalPerguntas = 10;

        // Inicializa as 10 perguntas
        perguntas[0] = "Qual é a capital do Brasil?";
        alternativas[0] = new String[]{"1) São Paulo", "2) Brasília", "3) Rio de Janeiro", "4) Belo Horizonte"};
        respostasCorretas[0] = 2;

        perguntas[1] = "Qual é o maior planeta do Sistema Solar?";
        alternativas[1] = new String[]{"1) Marte", "2) Saturno", "3) Júpiter", "4) Terra"};
        respostasCorretas[1] = 3;

        perguntas[2] = "Quem pintou a Mona Lisa?";
        alternativas[2] = new String[]{"1) Leonardo da Vinci", "2) Michelangelo", "3) Picasso", "4) Van Gogh"};
        respostasCorretas[2] = 1;

        perguntas[3] = "Em que continente fica o Egito?";
        alternativas[3] = new String[]{"1) Europa", "2) Ásia", "3) África", "4) América"};
        respostasCorretas[3] = 3;

        perguntas[4] = "Quanto é 9 x 7?";
        alternativas[4] = new String[]{"1) 63", "2) 56", "3) 72", "4) 49"};
        respostasCorretas[4] = 1;

        perguntas[5] = "Qual é o elemento químico representado por 'O'?";
        alternativas[5] = new String[]{"1) Ouro", "2) Oxigênio", "3) Ósmio", "4) Hidrogênio"};
        respostasCorretas[5] = 2;

        perguntas[6] = "Quantos estados tem o Brasil?";
        alternativas[6] = new String[]{"1) 24", "2) 25", "3) 26", "4) 27"};
        respostasCorretas[6] = 3;

        perguntas[7] = "Quem foi o primeiro homem a pisar na Lua?";
        alternativas[7] = new String[]{"1) Neil Armstrong", "2) Yuri Gagarin", "3) Buzz Aldrin", "4) Alan Shepard"};
        respostasCorretas[7] = 1;

        perguntas[8] = "Qual é o maior oceano do mundo?";
        alternativas[8] = new String[]{"1) Atlântico", "2) Índico", "3) Ártico", "4) Pacífico"};
        respostasCorretas[8] = 4;

        perguntas[9] = "Quem escreveu 'Dom Casmurro'?";
        alternativas[9] = new String[]{"1) José de Alencar", "2) Machado de Assis", "3) Monteiro Lobato", "4) Lima Barreto"};
        respostasCorretas[9] = 2;

        while (executando) {
            System.out.println("\n==== Bem-Vindo ao Quiz ====\n");
            System.out.println("1 - Jogar");
            System.out.println("2 - Configuração");
            System.out.println("3 - Sair\n");
            System.out.print("Escolha uma opção: ");
            if (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("Entrada inválida. Digite o número da opção.");
                continue;
            }
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    jogarQuiz(sc, perguntas, alternativas, respostasCorretas, totalPerguntas);
                    break;

                case 2:
                    totalPerguntas = configuracao(sc, perguntas, alternativas, respostasCorretas, totalPerguntas);
                    break;

                case 3:
                    System.out.println("Saindo... Até logo!");
                    executando = false;
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        sc.close();
    }

    public static void jogarQuiz(Scanner sc, String[] perguntas, String[][] alternativas, int[] respostasCorretas, int totalPerguntas) {
        int pontuacao = 0;
        int resposta;

        System.out.println("\n=== QUIZ DE CONHECIMENTOS GERAIS ===");

        for (int i = 0; i < totalPerguntas; i++) {
            if (perguntas[i] == null || perguntas[i].trim().isEmpty() || perguntas[i].equals("--- Pergunta deletada ---")) continue;

            System.out.println("\nPergunta " + (i + 1) + ": " + perguntas[i]);
            for (int j = 0; j < 4; j++) {
                if (alternativas[i][j] != null) {
                    System.out.println(alternativas[i][j]);
                }
            }

            System.out.print("Sua resposta (1-4): ");
            while (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.print("Entrada inválida. Digite 1, 2, 3 ou 4: ");
            }
            resposta = sc.nextInt();
            sc.nextLine();
            if (resposta == respostasCorretas[i]) pontuacao++;
        }

        System.out.println("\n=== RESULTADO FINAL ===");
        System.out.println("Você acertou " + pontuacao + " de " + totalPerguntas + " perguntas.");
        System.out.println("\nPressione Enter para voltar ao menu");
        sc.nextLine();
    }

    public static int configuracao(Scanner sc, String[] perguntas, String[][] alternativas, int[] respostasCorretas, int totalPerguntas) {
        boolean emConfiguracao = true;
        int opcao;

        while (emConfiguracao) {
            System.out.println("\n=== MENU DE CONFIGURAÇÃO ===");
            System.out.println("1 - Alterar uma pergunta ou resposta");
            System.out.println("2 - Deletar uma pergunta");
            System.out.println("3 - Visualizar perguntas");
            System.out.println("4 - Criar nova pergunta");
            System.out.println("5 - Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");

            if (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("Entrada inválida. Digite um número entre 1 e 5.");
                continue;
            }

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    alterarPergunta(sc, perguntas, alternativas, respostasCorretas, totalPerguntas);
                    break;
                case 2:
                    deletarPergunta(sc, perguntas, alternativas, totalPerguntas);
                    break;
                case 3:
                    visualizarPerguntas(perguntas, alternativas, totalPerguntas);
                    break;
                case 4:
                    totalPerguntas = criarPergunta(sc, perguntas, alternativas, respostasCorretas, totalPerguntas);
                    break;
                case 5:
                    emConfiguracao = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        return totalPerguntas;
    }

    // Altera as perguntas
    public static void alterarPergunta(Scanner sc, String[] perguntas, String[][] alternativas, int[] respostasCorretas, int totalPerguntas) {
        System.out.println("\nDigite o número da pergunta que deseja alterar (1 a " + totalPerguntas + "): ");
        if (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.println("Entrada inválida!");
            return;
        }
        int num = sc.nextInt();
        sc.nextLine();

        if (num < 1 || num > totalPerguntas) {
            System.out.println("Número inválido!");
            return;
        }

        int i = num - 1;

        System.out.println("Pergunta atual: " + perguntas[i]);
        System.out.print("Digite a nova pergunta: ");
        perguntas[i] = sc.nextLine();

        for (int j = 0; j < 4; j++) {
            System.out.print("Digite a alternativa " + (j + 1) + ": ");
            alternativas[i][j] = (j + 1) + ") " + sc.nextLine();
        }

        System.out.print("Digite o número da alternativa correta (1 a 4): ");
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.print("Entrada inválida. Digite 1 a 4: ");
        }
        respostasCorretas[i] = sc.nextInt();
        sc.nextLine();

        System.out.println("Pergunta alterada com sucesso!");
    }

    // Deleta as perguntas
    public static void deletarPergunta(Scanner sc, String[] perguntas, String[][] alternativas, int totalPerguntas) {
        System.out.println("\nDigite o número da pergunta que deseja deletar (1 a " + totalPerguntas + "): ");
        if (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.println("Entrada inválida!");
            return;
        }
        int num = sc.nextInt();
        sc.nextLine();

        if (num < 1 || num > totalPerguntas) {
            System.out.println("Número inválido!");
            return;
        }

        int i = num - 1;
        perguntas[i] = "--- Pergunta deletada ---";
        for (int j = 0; j < 4; j++) {
            alternativas[i][j] = null;
        }

        System.out.println("Pergunta deletada com sucesso!");
    }

    //Mostra as perguntas
    public static void visualizarPerguntas(String[] perguntas, String[][] alternativas, int totalPerguntas) {
        System.out.println("\n=== LISTA DE PERGUNTAS ===");
        boolean any = false;
        for (int i = 0; i < totalPerguntas; i++) {
            if (perguntas[i] == null || perguntas[i].trim().isEmpty() || perguntas[i].equals("--- Pergunta deletada ---")) continue;
            any = true;
            System.out.println("\n" + (i + 1) + ") " + perguntas[i]);
            for (int j = 0; j < 4; j++) {
                if (alternativas[i][j] != null) {
                    System.out.println(alternativas[i][j]);
                }
            }
        }
        if (!any) {
            System.out.println("Nenhuma pergunta disponível para exibir.");
        }
    }

    // Cria uma nova pergunta
    public static int criarPergunta(Scanner sc, String[] perguntas, String[][] alternativas, int[] respostasCorretas, int totalPerguntas) {
        if (totalPerguntas >= perguntas.length) {
            System.out.println("Limite máximo de perguntas atingido!");
            return totalPerguntas;
        }

        int i = totalPerguntas;

        System.out.print("\nDigite a nova pergunta: ");
        perguntas[i] = sc.nextLine();

        for (int j = 0; j < 4; j++) {
            System.out.print("Digite a alternativa " + (j + 1) + ": ");
            alternativas[i][j] = (j + 1) + ") " + sc.nextLine();
        }

        System.out.print("Digite o número da alternativa correta (1 a 4): ");
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.print("Entrada inválida. Digite 1 a 4: ");
        }
        respostasCorretas[i] = sc.nextInt();
        sc.nextLine();

        totalPerguntas++;
        System.out.println("Nova pergunta adicionada com sucesso!");

        return totalPerguntas;
    }
}