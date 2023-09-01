package aulasgen;

import java.util.Scanner;

public class ExercicioOito {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int codigo;
        float saldo, saque, deposito;
        saldo = 1000;
        System.out.println("Escolha código da operação: \nCódigo 1- Saldo\nCódigo 2- Saque\nCódigo 3- Depósito");
        codigo = leia.nextInt();

        switch (codigo) {
            case 1:
                System.out.println("Operação - Saldo\nSaque: R$" + saldo);
            break;
            case 2:
                System.out.println("Digite o valor do saque: ");
                saque = leia.nextFloat();
                if (saldo - saque <0)
                System.out.println("Operação - Saque\nSaldo Insuficiente!");
                else {
                System.out.println("Operação - Saque\nSaldo: R$" + (saldo - saque));
            }
            break;
            case 3:
                System.out.println("Digite o valor do depósito: ");
                deposito = leia.nextFloat();
                System.out.println("Operação - Depósito\nSaldo: R$" + (saldo+ deposito));
                break;
            default:
            System.out.println("Código inválido.");
        }

        }
    }