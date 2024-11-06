public class Jogador {
    private String nomeJogador;
    private double salario;
    private String clube;
    

    public Jogador(String nomeJogador, double salario, String clube) {
        this.nomeJogador = nomeJogador;
        this.salario = salario;
        this.clube = clube;
    }
    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getClube() {
        return clube;
    }

    public void setClube(String clube) {
        this.clube = clube;
    }

    public static Jogador adcionarJogador(String nomeJogador, double salario, String clube) {
        Jogador jogador = new Jogador(nomeJogador, salario, clube);
        return jogador;
    }

    
}
