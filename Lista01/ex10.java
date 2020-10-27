package Lista01;

/* Faça um programa que peça a temperatura em graus Celcius,
transforme e mostre em graus Fahrenheit. */

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celsius: ");
        double celsius = scan.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println(celsius + " em Fahrenheit é: " + fahrenheit);
    }
}
