package Lista03;
/*
Supondo que a população a população de um país A seja da ordem de 80.000 habitantes
com uma taxa anual de crescimento de 3% e que a população do país B seja 200.000 habitantes
com uma taxa anual de crescimento de 1.5%. Faça um programa que calcule e escreva o número de anos
necessários para que a população do país A ultrapasse ou iguale a população do país B, mantidas as
taxas de crescimento.
 */

public class ex04 {
    public static void main(String[] args) {
        int populacaoPaisA = 80000;
        int populacaoPaisB = 200000;
        int count = 0;

        while (populacaoPaisA < populacaoPaisB) {
            populacaoPaisA += (populacaoPaisA / 100) * 3;
            populacaoPaisB += (populacaoPaisB/100) * 1.5;
            count++;
        }

        System.out.println("Quantidade população A: " + populacaoPaisA);
        System.out.println("Quantidade população B: " + populacaoPaisB);
        System.out.println("Quantidade de anos: " + count);

    }

}
