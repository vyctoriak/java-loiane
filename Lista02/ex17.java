package Lista02;

/*
Faça um Programa que peça um número correspondente a um
determinado ano e em seguida informe se este ano é ou não bissexto.
 */

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite ano: ");

        int ano = scan.nextInt();

        if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)){
            System.out.println("O ano é bissexto");
        } else {
            System.out.println("O ano não é bissexto");
        }
    }
}
