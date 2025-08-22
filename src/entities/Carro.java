package entities;

public class Carro extends Veiculo {
    public Carro() {
        super("Corolla", 180);
    }

    @Override
    public void mover() {
        System.out.println("Carro: Vruuummmmmmm!");
    }
}
