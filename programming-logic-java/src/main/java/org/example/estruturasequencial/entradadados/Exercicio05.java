package org.example.estruturasequencial.entradadados;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        /*  Exercício 5: Solicite ao usuário que insira seu número de telefone, incluindo o código de área. Em seguida, exiba uma mensagem de agradecimento junto com o número de telefone fornecido.
                ENTRADA: (16) 99719 – 1541
	            SAÍDA: Obrigado por fornecer o número (16) 99719 – 1541
         */
        Scanner sc = new Scanner(System.in);

        String telefone;
        System.out.println("Informe o telefone: ");
        telefone = sc.nextLine();

        System.out.println("Obrigado por fornecer o número " + telefone);

        sc.close();
    }
}
