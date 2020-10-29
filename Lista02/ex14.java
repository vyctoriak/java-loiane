package Lista02;
/*
Faça um programa que lê as duas notas parciais obtidas por um aluno
numa disciplina ao longo de um semestre, e calcule a sua média. A atribuição
de conceitos obedece à tabela abaixo:

Média de Aproveitamento Conceito
o Entre 9.0 e 10.0 A
o Entre 7.5 e 9.0 B
o Entre 6.0 e 7.5 C
o Entre 4.0 e 6.0 D
o Entre 4.0 e zero E

 */

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a primeira nova: ");
        double primeiraNota = input.nextInt();
        System.out.println("Digite a segunta nota: ");
        double segundaNota = input.nextInt();

        double media = primeiraNota + segundaNota / 2;

        if(media >= 9 && media <= 10) {
            System.out.println("Média A, Aprovado");
        } else if (media >= 7.5 && media < 9) {
            System.out.println("Média B, Aprovado");
        } else if(media >= 6.5 && media < 7.5) {
            System.out.println("Média C, Aprovado");
        } else if (media >= 4 && media < 6 ) {
            System.out.println("Média D, Reprovado");
        } else if (media >= 4 && media < 0) {
            System.out.println("Média E, Reprovado");
        }
    }
}
