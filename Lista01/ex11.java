package Lista01;

/*
Faça um programa que peça 2 números inteiros e um número real.
Calcule e mostre:
a) O produto do dobro do primeiro com a metade do segundo
b) A soma do triplo do primeiro com o terceiro
c) O terceiro elevado ao cubo
*/

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num1 = scan.nextInt();
        System.out.println("Digite mais um número inteiro: ");
        int num2 = scan.nextInt();
        System.out.println("Digite um número real: ");
        double num3 = scan.nextDouble();
        scan.close();

        int primeiroResultado = (num1 * 2) * (num2 / 2);
        double segundoResultado = (num1 * 3) + num3;
        double terceiroResultado = Math.pow(num3, 3);

        System.out.println("O produto do dobro do primeiro com a metade do segundo: " + primeiroResultado);
        System.out.println("A soma do triplo do primeiro com o terceiro: " + segundoResultado);
        System.out.println("O terceiro elevado ao cubo: " + terceiroResultado);


    }
}
