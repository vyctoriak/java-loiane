package Lista01;

/*

Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso
ideal, usando a seguinte fórmula:
( 72,7 * altura ) - 58

 */

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();
        scan.close();

        double pesoIdeal = ( 72.7 * altura ) - 58;
        System.out.println("Seu peso idal é: " + pesoIdeal);
    }
}
