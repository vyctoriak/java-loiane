package cursojava;

import java.util.Scanner;

public class SwitchCaseSimples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o dia da semana (em número): ");
        int diaDaSemana = scan.nextInt();

        switch (diaDaSemana) {
            case 0:
                System.out.println("Domingo!");
                break;
            case 1:
                System.out.println("Segunda-feira!");
                break;
            case 2:
                System.out.println("Terça-feira!");
                break;
            case 3:
                System.out.println("Quarta-feira!");
                break;
            case 4:
                System.out.println("Quinta-feira!");
                break;
            case 5:
                System.out.println("Sexta-feira!");
                break;
            case 6:
                System.out.println("Sábado!");
                break;
            case 7:
                System.out.println("Domingo!");
                break;
            default:
                System.out.println("Não é um dia válido!");
        }
    }
}
