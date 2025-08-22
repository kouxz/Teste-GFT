package application;

import entities.Veiculo;

import java.util.Scanner;

import entities.Bicicleta;
import entities.Carro;
import entities.Moto;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

         Veiculo[] veiculos = { new Carro(), new Moto(), new Bicicleta() };

         System.out.println("Escolha o primeiro veículo: ");
         for(int i = 0; i < veiculos.length; i++) {
            System.out.println((i + 1) + " - " + veiculos[i].getNome());
         }
         int escolha1 = sc.nextInt();

         System.out.println("Escolha o segundo veículo: ");
         for(int i = 0; i < veiculos.length; i++) {
            System.out.println((i + 1) + " - " + veiculos[i].getNome());
         }
         int escolha2 = sc.nextInt();

         Veiculo v1 = veiculos[escolha1 -1];
         Veiculo v2 = veiculos[escolha2 -1];

         System.out.println("\nVeículos escolhidos: " + v1.getNome() + " vs " + v2.getNome());

         v1.mover();
         v2.mover();

         if (v1.getVelocidade() > v2.getVelocidade()) {
            System.out.println("O vencedor foi: " + v1.getNome() + " com " + v1.getVelocidade() + " km/h!");
         } else if (v2.getVelocidade() > v1.getVelocidade()) {
            System.out.println("O vencedor foi: " + v2.getNome() + " com " + v2.getVelocidade() + " km/h!");
         } else {
            System.out.println("Empate! Ambos tem a mesma velocidade de "+ v1.getVelocidade() + " km/h");
         }

         


         sc.close();
    }
}
