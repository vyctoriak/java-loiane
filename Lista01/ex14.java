package Lista01;

/*
Faça um programa que peça o tamanho de um arquivo para download (em MB)
e a velocidade de um link de internet (em Mbps), calcule e informe o tempo
aproximado de download do arquivo usando este link (em minutos).
 */

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho do arquivo (em MB): ");
        double tamanhoDoArquivo = scan.nextDouble();

        System.out.println("Digite a velocidade da internet (em Mbps): ");
        double velocidadeInternet = scan.nextDouble();

        double tempoDeDownload = tamanhoDoArquivo / velocidadeInternet;
        System.out.println("O arquivo será baixado em " + tempoDeDownload + " minutos.");

    }
}
