package cursojava;

import java.util.Scanner;

public class BreakEContinue {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Entre com um número: ");
        int num = input.nextInt();

        System.out.println("Entre com um limite: ");
        int max = input.nextInt();

        input.close();

        for (int i = num; i <=max; i++) {

            if(i % 7 == 0) {
//                break;
                continue; // se for múltiplo de 7, n vai aparecer no print
            }
            System.out.println("O valor de i é: " + i);

        }

    }

}
