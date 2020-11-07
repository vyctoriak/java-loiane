package Lista03;

import java.util.Scanner;

/*
Faça um programa que leia e valide as seguintes informações:
a) Nome: maior que 3 caracteres;
b) Idade: entre 0 e 150;
c) Salário: maior que zero;
d) Sexo: "f" ou "m";
e) Estado Civil: 's', 'c', 'v', 'd'.
 */
public class ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;
        boolean infoValidas = false;

        do {
            System.out.println("Digite seu nome: ");
            nome = input.next();

            System.out.println("Digite sua idade: ");
            idade = input.nextInt();

            System.out.println("Digite seu salário: ");
            salario = input.nextDouble();

            System.out.println("Digite seu sexo: ");
            sexo = input.next();

            System.out.println("Digite seu estado civil: ");
            estadoCivil = input.next();

            if(nome.length() > 3) {
                infoValidas = true;
                System.out.println("Nome válido!");
            } else {
                System.out.println("Nome inválido, precisa ter mais que 3 caracteres.");
            }
            if(idade >= 0 && idade <= 150) {
                infoValidas = true;
                System.out.println("Idade válida!");
            } else {
                System.out.println("Idade precisa ser entre 0 e 150");
            }
            if(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
                infoValidas = true;
                System.out.println("Sexo válido!");
            } else {
                System.out.println("Sexo inválido. Precisa ser 'f' ou 'm'");
            }
            if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") ||
                    estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")) {

                infoValidas = true;
                System.out.println("Estado civil válido!");
            } else {
                System.out.println("Estado civil precisa ser 's', 'c', 'v' ou 'd' ");
            }
        } while (!infoValidas);
    }
}
