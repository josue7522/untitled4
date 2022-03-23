package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner (System.in);

        System.out.println("Seja bem vindo");

        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        System.out.print("Digite a quantidade do produto: ");
        double quantidadeDoProduto = scanner.nextDouble();

        boolean temDesconto = quantidadeDoProduto > 10 ;

        double subTotal = quantidadeDoProduto * valorProduto;

        if (temDesconto) {
            double desconto = (subTotal * 10) / 100;
            subTotal = subTotal - desconto;
            System.out.println("valor total do produto é: " + subTotal + "$");
        } else {
            System.out.println("$$$$SEM DESCONTO PRA VOCE$$$$$$");
        }
        scanner.close();
    }
}
