package aulasgen;

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num;
        System.out.println("Digite um número: ");
        num = leia.nextInt();

        if (num % 2 == 0 && num > 0) {
            System.out.println("O número " + num + " é par e positivo.");
        }else if (num % 2 == 0 && num < 0){
            System.out.println("O número " + num + " é par e negativo.");
        }else if (num %2 !=0 && num > 0) {
            System.out.println("O número " + num + " é ímpar e positivo.");
        }else {
            System.out.println("O número " + num + " é ímpar e negativo.");
        }


    }
}