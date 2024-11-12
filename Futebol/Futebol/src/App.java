import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Clube> clubes = new ArrayList<>();

        while (true) {
            System.out.println("Bem vindo ao programa de futebol");
            System.out.println("Selecione uma opção para começar");
            System.out.println("1 - Adicionar um clube");
            System.out.println("2 - Adicionar um jogador");
            System.out.println("3 - Listar jogadores de um clube");
            System.out.println("4 - Remover um jogador");
            System.out.println("5 - Listar todos os jogadores");
            System.out.println("6 - Procurar jogadores por clube");
            System.out.println("7 - Sair");

            int numero = entrada.nextInt();
            entrada.nextLine(); // consume newline character

            switch (numero) {
                case 1:
                    System.out.println("Digite o nome do clube:");
                    String nomeClube = entrada.nextLine();
                    System.out.println("Digite a cidade do clube:");
                    String cidade = entrada.nextLine();
                    System.out.println("Digite a liga do clube:");
                    String liga = entrada.nextLine();
                    Clube novoClube = new Clube(nomeClube, cidade, liga, new ArrayList<>());
                    clubes.add(novoClube);
                    System.out.println("Clube adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("Digite o nome do jogador:");
                    String nomeJogador = entrada.nextLine();
                    System.out.println("Digite o salário do jogador:");
                    double salario = entrada.nextDouble();
                    entrada.nextLine(); // consume newline character
                    System.out.println("Digite o nome do clube do jogador:");
                    String clubeJogador = entrada.nextLine();
                    Jogador novoJogador = new Jogador(nomeJogador, salario, clubeJogador);
                    for (Clube clube : clubes) {
                        if (clube.getNomeClube().equals(clubeJogador)) {
                            clube.adicionarJogador(novoJogador);
                            System.out.println("Jogador adicionado com sucesso!");
                            break;
                        }
                    }
                    break;

                case 3:
                    System.out.println("Digite o nome do clube:");
                    String clubeName = entrada.nextLine();
                    for (Clube clube : clubes) {
                        if (clube.getNomeClube().equals(clubeName)) {
                            System.out.println("Jogadores do clube " + clubeName + ":");
                            clube.listarJogadores();
                            break;
                        }
                    }
                    break;

                case 4:
                    System.out.println("Digite o nome do jogador a ser removido:");
                    String jogadorRemover = entrada.nextLine();
                    for (Clube clube : clubes) {
                        if (clube.getTime().containsKey(jogadorRemover)) {
                            clube.removerJogador(jogadorRemover);
                            System.out.println("Jogador removido com sucesso!");
                            break;
                        }
                    }
                    break;

                case 5:
                    System.out.println("Todos os jogadores:");
                    for (Clube clube : clubes) {
                        for (Jogador jogador : clube.getJogadores()) {
                            System.out.println(jogador.getNomeJogador() + " - Clube: " + jogador.getClube());
                        }
                    }
                    break;

                case 6:
                    System.out.println("Digite o nome do clube:");
                    String clubeProcurar = entrada.nextLine();
                    for (Clube clube : clubes) {
                        if (clube.getNomeClube().equals(clubeProcurar)) {
                            System.out.println("Jogadores do clube " + clubeProcurar + ":");
                            for (Jogador jogador : clube.procurarPorClube(clubeProcurar)) {
                                System.out.println(jogador.getNomeJogador() + " - Salário: " + jogador.getSalario());
                            }
                            break;
                        }
                    }
                    break;

                case 7:
                    System.out.println("Saindo do programa...");
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
