package Lista02;

/*
Faça um programa para a leitura de duas notas parciais de um aluno.
O programa deve calcular a média alcançada por aluno, e apresentar:
a) A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
b) A mensagem "Reprovado", se a média for menor do que sete;
c) A mensagem "Aprovado com Distinção" se a média for igual a dez.
 */

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira a primeira nota: ");
        double primeiraNota = scan.nextDouble();
        System.out.println("Insira a segunda nota: ");
        double segundaNota = scan.nextDouble();
        double media = (primeiraNota + segundaNota) / 2;

        if(media == 10) {
            System.out.println("Aprovado com Distinção");
        } else if(media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
