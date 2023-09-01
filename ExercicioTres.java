package aulasgen;

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String nome;
        int idade;
        boolean primeira;

        System.out.println("Digite o nome do doador: ");
        nome = leia.nextLine();

        System.out.println("Digite a idade do doador: ");
        idade = leia.nextInt();

        System.out.println("Digite se é a primeira doação: true/false ");
        primeira = leia.nextBoolean();

        if (idade >= 60 && idade <= 69) {
            if (primeira == false) {
                System.out.println("O paciente não está apto para doar.");
            } else {
                System.out.println("O paciente está apto para doar.");

            }
        } else if (idade < 18 || idade > 69) {
            System.out.println("O paciente não está apto para doar.");

        } else {
            System.out.println("O paciente está apto para doar.");
        }
    }
}

