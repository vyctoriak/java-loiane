package Lista02;

/*
Faça um programa que verifique se uma letra digitada é "F" ou "M".
Conforme a letra escrever -> "F - Feminino", "M - Masculino", "Sexo Inválido!"
 */

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma letra F ou M: ");
        String letra = scan.next();

        if(letra.equalsIgnoreCase("f")) {
            System.out.println("F - Feminino");
        } else if (letra.equalsIgnoreCase("m")) {
            System.out.println("M - Masculino");
        } else {
            System.out.println("Sexo inválido!");
        }
    }
}
