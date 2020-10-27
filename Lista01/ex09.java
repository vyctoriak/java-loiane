package Lista01;

/* Faça um programa que peça a temperatura em graus Farenheit,
transforme e mostre a temperatura em graus Celsius. */

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura (Fahrenheit): ");
        double fahrenheit = scan.nextDouble();
        double celsius = (5 * (fahrenheit-32) / 9);

        System.out.println("A temperatura " + fahrenheit + " (fahrenheit) em graus Celsius é: " + celsius);
    }
}
