package Lista01;

/* Faça um programa que pergunte quanto você ganha por hora e o número de
horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês. */

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora? ");
        double valorHora = scan.nextDouble();
        System.out.println("Quantas horas você trabalhou no mês? ");
        double horas = scan.nextDouble();

        double salario = valorHora * horas;
        System.out.println("Seu salário é: " + salario);
    }
}
