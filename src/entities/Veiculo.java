package entities;

public abstract class Veiculo {
    protected String nome;
    protected int velocidade;

    

    public Veiculo(String nome, int velocidade) {
        this.nome = nome;
        this.velocidade = velocidade;
    }

    public String getNome() {
        return nome;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public abstract void mover();
}
