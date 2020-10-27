package Lista01;

//Faça um programa que peça o raio de um círculo, calcule e mostre sua área

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o raio do círculo: ");
        double raio = scan.nextDouble();
        scan.close();
        double area = Math.PI * Math.pow(raio, 2);

        System.out.println("A área do círculo é: " + area);


    }
}
