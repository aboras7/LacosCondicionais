package aulasgen;

import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String palavra1, palavra2, palavra3;

        System.out.println("Digite a primeira palavra:");
        palavra1 = ler.nextLine();

        System.out.println("Digite a segunda palavra:");
        palavra2 = ler.nextLine();

        System.out.println("Digite a terceira palavra:");
        palavra3 = ler.nextLine();

        if(palavra1.equals("Vertebrado")) {
            if(palavra2.equals("Ave")) {
                if(palavra3.equals("Carnívoro")) {
                    System.out.println("Águia");
                } else {
                    System.out.println("Pomba");
                }
            } else {
                if(palavra3.equals("Onívoro")) {
                    System.out.println("Homem");
                } else {
                    System.out.println("Vaca");
                }
            }
        } else {
            if(palavra2.equals("Inseto")) {
                if(palavra3.equals("Hetamófago")) {
                    System.out.println("Pulga");
                } else {
                    System.out.println("Lagarta");

                }
            } else {
                if(palavra3.equals("Hematófago")) {
                    System.out.println("Sanguessuga");
                } else
                    System.out.println("Minhoca");
            }
        }
    }
}
