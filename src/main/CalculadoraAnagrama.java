package main;

import java.util.Arrays;
import java.util.Scanner;

public class CalculadoraAnagrama {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String p1, p2;

        System.out.println("Digite a primeira palavra: ");
        p1 = sc.nextLine();

        System.out.println("Digite a segunda palavra: ");
        p2 = sc.nextLine();

        // colocando apenas minusculas e sem espaços
        p1 = p1.toLowerCase().replaceAll("\\s+" , "");
        p2 = p2.toLowerCase().replaceAll("\\s+" , "");

        char[] l1 = p1.toCharArray();
        char[] l2 = p2.toCharArray();

        Arrays.sort(l1);
        Arrays.sort(l2);

        if (Arrays.equals(l1, l2)) {
            System.out.println("Resultado: as palavras são anagramas!");
        } else {
            System.out.println("Resultado: as palavras não são anagramas");
        }

        sc.close();
    }
}
