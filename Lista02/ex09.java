package Lista02;

import java.util.Scanner;

/*
Faça um programa que leia três números e mostre-os em ordem decrescente
 */
public class ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = input.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = input.nextInt();
        System.out.println("Digite o terceiro número: ");
        int num3 = input.nextInt();

        if (num1 <= num2 && num1 <= num3 && num2 <= num3){
            //num1 é menor
            //num3 é maior
            // num1 < num2 < num3
            System.out.println(num3 + " - " + num2 + " - " + num1);

        } else if (num1 <= num2 && num1 <= num3 && num3 <= num2){
            //num1 é menor
            //num2 é maior
            // num1 < num3 < num2
            System.out.println(num2 + " - " + num3 + " - " + num1);

        } else if (num2 <= num1 && num2 <= num3 && num1 <= num3){
            //num2 é menor
            //num3 é maior
            // num2 < num1 < num3
            System.out.println(num3 + " - " + num1 + " - " + num2);

        } else if (num2 <= num1 && num2 <= num3 && num3 <= num1){
            //num2 é menor
            //num1 é maior
            // num2 < num3 < num1
            System.out.println(num1 + " - " + num3 + " - " + num2);

        } else if (num3 <= num1 && num3 <= num2 && num1 <= num2){
            //num3 é menor
            //num2 é maior
            // num3 < num1 < num2
            System.out.println(num2 + " - " + num1 + " - " + num3);

        } else if (num3 <= num1 && num3 <= num2 && num2 <= num1){
            //num3 é menor
            //num1 é maior
            // num3 < num2 < num1
            System.out.println(num1 + " - " + num2 + " - " + num3);

        }
    }
}
