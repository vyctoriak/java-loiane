package Lista02;

/*
Faça um programa que leia três números e mostre o maior deles
 */

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = scan.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = scan.nextDouble();
        System.out.println("Digite o terceiro número: ");
        double num3 = scan.nextDouble();

        if(num1 > num2 && num1 > num3) {
            System.out.println("O primeiro número é o maior!");
        } else if(num2 > num1 && num2 > num3) {
            System.out.println("O segundo número é o maior!");
        } else {
            System.out.println("O terceiro número é o maior!");
        }


    }
}
