package Lista01;

/*
Faça um programa que pergunte quanto você ganha por hora e o seu número de horas
trabalhadas no mês. Calcule e mostre o total do seu salário no referifo mês, sabendo-se
que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato,
faça um programa ue nos dê:
a) Salário bruto
b) Quanto pagou ao INSS
c) Quanto pagou ao sindicato
c) O salário líquido
d) Calcule os descontos e o salário líquido, conforme a tabela abaixo:

salário bruto: R$ - IR (11%) : R$ - INSS (8%) : R$ - Sindicato (5%) : R$ = Salário Líquido : R$

*/

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu valor ganho por hora: ");
        double valorHora = scan.nextDouble();
        System.out.println("Digite a quantidade horas trabalhas no mês: ");
        double horasTrabalhadasNoMes = scan.nextDouble();

        double salario = horasTrabalhadasNoMes * valorHora;
        double inss = (salario / 100) * 8;
        double sindicato = (salario / 100) * 5;
        double impostoDeRenda = (salario / 100) * 11;
        double totalDeDescontos = inss + sindicato + impostoDeRenda;

        System.out.println("Seu salário esse mês: R$ " + (salario - totalDeDescontos));

    }
}
