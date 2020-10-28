package Lista02;

/*
Faça um programa que perfunte em que turno você estuda. Peça para digitar M (matutino) ou V (Vespertino)
ou N (Noturno). Imprima a mensagem "Bom dia", "Boa tarde" ou "Boa noite" ou "Valor inválido" conforme o caso.
 */

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o turno que você estuda (M-matutino, V-vespertino, N-noturno)");
        String turno = input.next();

        if(turno.equalsIgnoreCase("m")) {
            System.out.println("Bom dia!");
        } else if(turno.equalsIgnoreCase("v")) {
            System.out.println("Boa tarde!");
        } else if(turno.equalsIgnoreCase("n")) {
            System.out.println("Boa noite!");
        } else {
            System.out.println("Valor inválido!");
        }
    }
}
