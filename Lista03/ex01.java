package Lista03;

import java.util.Scanner;

/*
Faça um programa que peça uma nota entre zeo e dez. Mostre uma mensagem caso o valor seja
inválido e continue pedindo até que o usuário informe um valor válido.
 */
public class ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean notaValida = false;

        do {
            System.out.println("Insira a nota: ");
            int nota = input.nextInt();

            if(nota >= 0 && nota <= 10) {
                notaValida = true;
                System.out.println("Nota válida!");
            } else {
                System.out.println("Por favor, insira uma nota válida.");
            }
        } while (!notaValida);

    }
}
