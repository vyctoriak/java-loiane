package Lista01;

// Faça um programa que peça dois números e imprima a soma

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double numero1 = scan.nextDouble();
        double numero2 = scan.nextDouble();
        scan.close();
        double soma = numero1 + numero2;
        System.out.println(soma);
    }
}
