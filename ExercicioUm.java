package aulasgen;

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int a ,b ,c;

        System.out.println("Digite o primeiro número: ");
        a = leia.nextInt();

        System.out.println("Digite o segundo número: ");
        b = leia.nextInt();

        System.out.println("Digite o terceiro número: ");
        c = leia.nextInt();

        if ((a+b) > c ) {
            System.out.println("A Soma de A + B é Maior do que C");}
        else if ((a+b) < c ) {
            System.out.println("A Soma de A + B é Menor do que C");}
        else {
            System.out.println("A Soma de A + B é Igual a C");
        }
    }
}

