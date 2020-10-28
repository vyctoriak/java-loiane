package Lista02;

/*
Faça um programa que peça um valor e mostre na tela se o valor é positivo ou negativo
 */

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite qualquer número: ");
        double numero = scan.nextDouble();

        if(numero < 0) {
            System.out.println("O número é negativo!");
        } else {
            System.out.println("O número é positivo!");
        }
    }
}
