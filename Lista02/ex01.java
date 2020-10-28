package Lista02;

/*
Faça um programa que peça dois números e imprima o maior deles
*/

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = scan.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = scan.nextDouble();

        if(num1 > num2) {
            System.out.println("O número 1 (" + num1 + ") é maior que o número 2");
        } else {
            System.out.println("O número 2 (" + num2 + ") é maior que o número 1");
        }


    }
}
