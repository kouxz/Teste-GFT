package entities;

public class Moto extends Veiculo {
    public Moto() {
        super("Kawasaki", 150);
    }

    @Override
    public void mover() {
        System.out.println("Moto: randandandan");
    }
}

