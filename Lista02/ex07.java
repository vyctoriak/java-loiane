package Lista02;

import java.util.Scanner;

/*
Faça um programa que leia três números e mostre o maior e o menor deles.
 */

public class ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = scan.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = scan.nextDouble();
        System.out.println("Digite o terceiro número: ");
        double num3 = scan.nextDouble();

        if(num1 >= num2 && num1 >= num3) {
            System.out.println("O primeiro número é o maior!");
        } else if(num2 >= num1 && num2 >= num3) {
            System.out.println("O segundo número é o maior!");
        } else {
            System.out.println("O terceiro número é o maior!");
        }

        if(num1 <= num2 && num1 <= num2) {
            System.out.println("O primeiro número é o menor!");
        } else if(num2 <= num1 && num2 <= num3) {
            System.out.println("O segundo número é o menor!");
        } else {
            System.out.println("O terceiro número é o menor!");
        }

    }
}
