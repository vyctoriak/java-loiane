package Lista01;

//Faça um programa que converta metros para centimetros

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double metros = scan.nextDouble();
        scan.close();
        double conversao = metros * 100;

        System.out.println("Centímetros: " + conversao);
    }
}
