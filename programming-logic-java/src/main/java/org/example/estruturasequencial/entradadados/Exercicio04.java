package org.example.estruturasequencial.entradadados;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        /*  Exercício 4: Peça ao usuário que informe seu e-mail e, em seguida, exiba uma mensagem de confirmação com o endereço de e-mail fornecido.
                ENTRADA: anderson.luiz.sales@gmail.com
	            SAÍDA: Seu e-mail é anderson.luiz.sales@gmail.com?
        */
        Scanner sc = new Scanner(System.in);

        String email;
        System.out.println("Informe o e-mail: ");
        email = sc.next();

        System.out.println("Seu e-mail é " + email + "?");

        sc.close();
    }
}
