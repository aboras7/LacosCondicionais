package aulasgen;

import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
    int opcao;
    double quant;
    Scanner leia = new Scanner(System.in);
        System.out.println("Digite o código do produto: ");
        opcao = leia.nextInt();
        System.out.println("Digite a quantidade do produto: ");
        quant = leia.nextInt();

        switch(opcao) {
            case 1:
                System.out.println("Produto: Cachorro Quente. \nValor: $" + (quant*10));
                break;
            case 2:
                System.out.println("Produto: X-Salada. \nValor: $" + (quant*15));
                break;
            case 3:
                System.out.println("Produto: X-Bacon. \nValor: $" + (quant*18));
                break;
            case 4:
                 System.out.println("Produto: Bauru. \nValor: $" + (quant*12));
                break;
            case 5:
                System.out.println("Produto: Refrigerante. \nValor: $" + (quant*8));
                break;
            case 6:
                System.out.println("Produto: Suco de Laranja. \nValor: $" + (quant*13));
                break;
        }
        }
}
