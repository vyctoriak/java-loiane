package Lista03;

import java.util.Scanner;

/*
Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual
ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir informações.
 */
public class ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean infoValidas = false;
        String user;
        String password;

        do {
            System.out.println("Digite seu usuário: ");
            user = input.next();

            System.out.println("Digite sua senha: ");
            password = input.next();

            if(user.equalsIgnoreCase(password)) {
                infoValidas = false;
                System.out.println("O nome do usuário é igual a senha!");
            } else {
                infoValidas = true;
                System.out.println("Informações válidas!");
            }
        } while (!infoValidas);
    }
}
