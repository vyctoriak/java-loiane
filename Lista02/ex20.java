package Lista02;

import java.util.Scanner;

public class ex20 {
/*
Faça um programa que faça 5 perguntas para uma pessoa sobre um
crime. As perguntas são:
a) Telefonou para a vítima?
b) Esteve no local do crime?
c) Mora perto da vítima?
d) Devia para a vítima?
e) Já trabalhou para a vítima?
O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "SUSPEITA"
entre 3 e 4 como "CÚMPLICE" e 5 como "ASSASSINO". Caso contrário, ele será classificado como
"INOCENTE".
 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Telefonou para a vítima? ");
        boolean primeiraResposta = input.nextBoolean();

        System.out.println("Esteve no local do crime? ");
        boolean segundaResposta = input.nextBoolean();

        System.out.println("Mora perto da vítima? ");
        boolean terceiraResposta = input.nextBoolean();

        System.out.println("Devia para a vítima? ");
        boolean quartaResposta = input.nextBoolean();

        System.out.println("Já trabalhou para vítima? ");
        boolean quintaResposta = input.nextBoolean();

        int count = 0;

        if (primeiraResposta == true){
            count++;
        }

        if (segundaResposta == true){
            count++;
        }

        if (terceiraResposta == true){
            count++;
        }

        if (quartaResposta == true){
            count++;
        }

        if (quintaResposta == true){
            count++;
        }

        if (count == 2){
            System.out.println("Suspeita");
        } else if (count == 3 || count == 4){
            System.out.println("Cúmplice");
        } else if (count == 5){
            System.out.println("Assassino");
        } else if (count == 0){
            System.out.println("Inocente");
        }

    }
}
