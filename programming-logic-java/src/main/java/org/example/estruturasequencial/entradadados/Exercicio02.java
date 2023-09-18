package org.example.estruturasequencial.entradadados;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        /*  Exercício 2: Peça ao usuário que insira sua idade e, em seguida, imprima uma mensagem informando quantos anos ele terá daqui a 10 anos.
	            ENTRADA: 30
	            SAÍDA: Voce tera 30 anos daqui 10 anos
        */

        Scanner sc = new Scanner(System.in);

        int idade;
        System.out.println("Informe a idade: ");
        idade = sc.nextInt();

        System.out.println("Voce tera " + idade + " daqui 10 anos");

        sc.close();
    }
}
