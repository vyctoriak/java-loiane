package Lista02;

import java.util.Scanner;

public class ex12 {

/*
Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda,
que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o
FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita).
O Salário Líquido corresponde ao Salário Bruto menos os descontos. O programa deverá pedir ao usuário o
valor da sua hora e a quantidade de horas trabalhadas no mês.
-> Desconto do IR:
-> Salário Bruto até 900 (inclusive) - isento
-> Salário Bruto até 1500 (inclusive) - desconto de 5%
-> Salário Bruto até 2500 (inclusive) - desconto de 10%
-> Salário Bruto acima de 2500 - desconto de 20%
Imprima na tela as informações, dispostas conforme o exemplo abaixo.
No exemplo o valor da hora é 5 e a quantidade de hora é 220.

Salário Bruto: (5 * 220) : R$ 1100,00
(-) IR (5%) : R$ 55,00
(-) INSS ( 10%) : R$ 110,00
FGTS (11%) : R$ 121,00
Total de descontos : R$ 165,00
Salário Liquido : R$ 935,00

 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu valor por hora: R$");
        double valorHora = input.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
        double horasMes = input.nextDouble();

        double salarioBruto = valorHora * horasMes;

        int percentualIR = 0;
        if ( salarioBruto <= 900) {
            percentualIR = 0;
        } else if(salarioBruto > 900 && salarioBruto <= 1500) {
            percentualIR = 5;
        } else if(salarioBruto > 1500 && salarioBruto <= 2500) {
            percentualIR = 10;
        } else if(salarioBruto > 2500) {
            percentualIR = 20;
        }

        double ir = (salarioBruto / 100) * percentualIR;
        double inss = (salarioBruto / 100) * 100;
        double fgts = (salarioBruto / 100) * 11;
        double totalDesconto = ir + inss;
        double salarioLiquido = salarioBruto - totalDesconto;

        System.out.println("Salário Bruto: (" + valorHora + " * " + horasMes + "): " + salarioBruto);
        System.out.println("(-) IR (" + percentualIR + "%):" + ir);
        System.out.println("(-) INSS (10%): " + inss);
        System.out.println("FGTS (11%): " + fgts);
        System.out.println("Salário Líquido: " + salarioLiquido);
    }
}
