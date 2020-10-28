package Lista02;

import java.util.Scanner;

/*
As Organizações Tabajara resolveram dar um aumento de salário aos
seus colaboradores e lhe contraram para desenvolver o programa que
calculará os reajustes.
    Faça um programa que recebe o salário de um colaborador e o
reajuste segundo o seguinte critério, baseado no salário atual:
    salários até R$ 280,00 (incluindo) : aumento de 20%
    salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
    salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
    salários de R$ 1500,00 em diante : aumento de 5% Após o
aumento ser realizado, informe na tela:
    o salário antes do reajuste;
    o percentual de aumento aplicado;
    o valor do aumento;
    o novo salário, após o aumento.
 */
public class ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu salario: R$ ");
        double salario = input.nextDouble();
        int percentual;

        if(salario <= 280) {
            percentual = 20;
        } else  if (salario >= 280 && salario <= 700) {
            percentual = 15;
        } else if (salario > 700 && salario <= 1500) {
            percentual = 10;
        } else {
            percentual = 5;
        }

        double aumento = (salario/100) * percentual;
        double salarioReajustado = salario + aumento;


        System.out.println("O salário antes do reajuste era de: R$ " + salario);
        System.out.println("A porcentagem de aumento foi: " + percentual + "%");
        System.out.println("O aumento foi de: R$ " + aumento);
        System.out.println("O valor do salário após reajuste é de: R$ " + salarioReajustado);

    }
}
