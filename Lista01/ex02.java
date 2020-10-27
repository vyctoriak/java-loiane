package Lista01;

import java.util.Scanner;

//Faça um programa que peça um número e então mostre a mensagem:
//"O número informado foi [número]"

public class ex02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double numero = scan.nextDouble();

        System.out.println("O número informado foi " + numero);

    }
}
