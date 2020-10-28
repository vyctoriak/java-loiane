package cursojava;

import java.util.Scanner;

public class SwitchCaseSimples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o dia da semana (em número): ");
        int diaDaSemana = scan.nextInt();

        switch (diaDaSemana) {
            case 1: System.out.println("Domingo!");
        }
    }
}
