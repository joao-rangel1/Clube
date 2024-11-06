import java.util.ArrayList;


public class Liga {
    private String nomeLiga;
    private String pais;
    private ArrayList <Clube> clubes;


    public Liga(String nomeLiga, String pais, ArrayList <Clube> clubes) {
        this.nomeLiga = nomeLiga;
        this.pais = pais;
        this.clubes = clubes;
    }

    public String getNomeLiga() {
        return nomeLiga;
    }

    public void setNomeLiga(String nomeLiga) {
        this.nomeLiga = nomeLiga;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public ArrayList <Clube> getClubes() {
        return clubes;
    }


    public void setClubes(ArrayList <Clube> clubes) {
        this.clubes = clubes;
    }

    //metodo para criar uma liga
    public static Liga criarLiga(String nomeLiga, String pais, ArrayList <Clube> clubes) {
        Liga liga = new Liga(nomeLiga, pais, clubes);
        return liga;
    }

    //metodo que lista todos os clubes dentro de uma liga
    public static void listarJogadoresdosClubesdaLiga(Liga liga) {
        for (Clube clube : liga.getClubes()) {
            System.out.println("Clube: " + clube.getNomeClube());
            for (Jogador jogador : clube.getJogadores()) {
                System.out.println("Nome: " + jogador.getNomeJogador());
                
            }
        }
    }


}
