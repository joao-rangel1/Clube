import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Clube {
    private String nomeClube;
    private String cidade;
    private HashMap <String,Jogador> time;
    private String Liga;




 
    public Clube(String nomeClube, String cidade, String Liga, ArrayList <Jogador> jogadores) {
        
        this.nomeClube = nomeClube;
        this.cidade = cidade;
        this.Liga = Liga;
        this.time = new HashMap <String,Jogador>();
    }

    public void adicionarJogador(Jogador jogador) {
        time.put(jogador.getNomeJogador(), jogador);
    }

    // metodo getJogadores que retorna uma lista de jogadores
    
    public List<Jogador> getJogadores() {
        List<Jogador> jogadores = new ArrayList<Jogador>();
        for (Jogador jogador : time.values()) {
            jogadores.add(jogador);
        }
        return jogadores;
    }

    public void removerJogador(String nomeJogador) {
        time.remove(nomeJogador);
    }

    public void listarJogadores() {
        for (String nomeJogador : time.keySet()) {
            System.out.println(nomeJogador);
        }
    }

    public List<Jogador> procurarPorClube(String clube) {
        List<Jogador> jogadores = new ArrayList<Jogador>();
        for (Jogador jogador : time.values()) {
            if (jogador.getClube().equals(clube)) {
                jogadores.add(jogador);
            }
        }
        return jogadores;
    }




 
    public String getNomeClube() {
        return nomeClube;
    }

    public void setNomeClube(String nomeClube) {
        this.nomeClube = nomeClube;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }


    public String getLiga() {
        return Liga;
    }

    public void setLiga(String Liga) {
        this.Liga = Liga;
    }


    public HashMap <String,Jogador> getTime() {
        return time;
    }




}
