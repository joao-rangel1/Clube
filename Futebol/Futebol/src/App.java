import java.util.Scanner;
import java.util.ArrayList;


public class App {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        // codigo pra iniciar o programa
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
        ArrayList<Clube> clubes = new ArrayList<>();


        switch(numero){ 
            case 1:
            System.out.println("Digite o nome do clube");
             

        }
         

    }
}
