package Lista02;

/*
Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar,
sabendo que a decisão é sempre pelo mais barato
 */

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro preço: R$ ");
        double primeiroPreco = input.nextDouble();
        System.out.print("Digite o segundo preço: R$ ");
        double segundoPreco = input.nextDouble();
        System.out.print("Digite o terceiro preço: R$ ");
        double terceiroPreco = input.nextDouble();

        if(primeiroPreco <= segundoPreco && primeiroPreco <= segundoPreco) {
            System.out.println("O primeiro preço é o mais barato: " + primeiroPreco);
        } else if(segundoPreco <= primeiroPreco && segundoPreco <= terceiroPreco) {
            System.out.println("O segundo preço é o mais barato: " + segundoPreco);
        } else {
            System.out.println("O terceiro preço é o mais barato: " + terceiroPreco);
        }
    }
}
