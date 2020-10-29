package Lista02;

import java.util.Scanner;

/*
Faça um Programa que leia 2 números e em seguida pergunte ao
usuário qual operação ele deseja realizar. O resultado da operação
deve ser acompanhado de uma frase que diga se o número é:
-> ímpar ou par
-> positivo ou negativo
 */
public class ex19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int primeiroNumero = input.nextInt();

        System.out.println("Digite outro número: ");
        int segundoNumero = input.nextInt();

        System.out.println("Escolha um opção a seguir: ");
        System.out.println("1. Saber se é ÍMPAR ou PAR.");
        System.out.println("2. Se o número é POSITIVO ou NEGATIVO.");

        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                if(primeiroNumero % 2 == 0 ) {
                    System.out.println("O número é PAR " + primeiroNumero);
                } else {
                    System.out.println("O número é ÍMPAR " + primeiroNumero);
                }
                if(segundoNumero % 2 == 0) {
                    System.out.println("O número é PAR " + segundoNumero);
                } else {
                    System.out.println("O número é ÍMPAR " + segundoNumero);
                }
                break;
            case 2:
                if(primeiroNumero < 0) {
                    System.out.println("O número é NEGATIVO " + primeiroNumero);
                } else {
                    System.out.println("O número é POSITIVO " + primeiroNumero);
                }
                if(segundoNumero < 0) {
                    System.out.println("O número é NEGATIVO " + segundoNumero);
                } else {
                    System.out.println("O número é POSITIVO " + segundoNumero);
                }
                break;
        }

    }
}
