package entities;

public class Bicicleta extends Veiculo {
    public Bicicleta() {
        super("Caloi", 45);
    }

    @Override
    public void mover() {
        System.out.println("Bicicleta: pedalando...");
    }
}

