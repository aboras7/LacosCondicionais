package aulasgen;

import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String nome;
        int codigo;
        float salario;

        System.out.println("Insira o seu nome: ");
        nome = leia.nextLine();
        System.out.println("Insira o código do cargo: ");
        codigo = leia.nextInt();
        System.out.println("Insira o seu salário: ");
        salario = leia.nextFloat();

        switch (codigo) {
            case 1:
                System.out.println("Nome do colaborador: " + nome + "\nCargo: Gerente \nSalário: " + (salario + (salario * 0.10)));
            case 2:
                System.out.println("Nome do colaborador: " + nome + "\nCargo: Gerente \nSalário: " + (salario + (salario * 0.10)));
        }


    }
}