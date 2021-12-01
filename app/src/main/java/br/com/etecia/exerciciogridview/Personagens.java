package br.com.etecia.exerciciogridview;

public class Personagens {

    //Atributos globais
    private String nome;
    private String idade;
    private String pontuacao;
    private int miniatura;


    public Personagens(String nome, String idade, String pontuacao, int miniatura) {
        this.nome = nome;
        this.idade = idade;
        this.pontuacao = pontuacao;
        this.miniatura= miniatura;
    }

    //Métodos de acesso - getters e setters


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(String pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getMiniatura() {
        return miniatura;
    }

    public void setMiniatura(int miniatura) {
        this.miniatura = miniatura;
    }
}
