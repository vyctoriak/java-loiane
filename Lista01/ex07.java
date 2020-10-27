package Lista01;

/* Faça um programa que calcule a área de um quadrado, em seguida mostre o dobro
desta área para o usuário */

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o lado do quadrado: ");
        double lado = scan.nextDouble();
        scan.close();
        double area = Math.pow(lado, 2);
        System.out.println("A área do quadrado é: " + area);
        System.out.println("O dobro da área é: " + (area * 2));
    }
}
