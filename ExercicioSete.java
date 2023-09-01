package aulasgen;

import java.util.Scanner;

public class ExercicioSete {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        float n1,n2,res;
        int conta;
        System.out.println("Escolha código da operação: \nCódigo 1- Soma\nCódigo 2- Subtração\nCódigo 3- Multiplicação\nCódigo 4- Divisão");
        conta = leia.nextInt();

        System.out.println("Digite o primeiro número: ");
        n1 = leia.nextFloat();

        System.out.println("Digite o primeiro número: ");
        n2 = leia.nextFloat();

        switch(conta){
            case 1:
                System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                break;
            case 2:
                System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
                break;
            case 3:
                System.out.println(n1 + " x " + n2 + " = " + (n1 * n2));
                break;
            case 4:
                System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
                break;
            default:
                System.out.println("Código inválido.");
        }
    }
}
