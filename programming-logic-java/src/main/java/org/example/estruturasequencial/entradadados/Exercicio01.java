package org.example.estruturasequencial.entradadados;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
      /*  Exercício 1: Solicite ao usuário que informe seu nome e, em seguida, exiba uma mensagem de boas-vindas usando o nome fornecido.
                ENTRADA: Anderson
                SAÍDA: Anderson bem-vindo ao JAVA
      */
        Scanner sc = new Scanner(System.in);

        String nome;
        System.out.println("Informe o nome: ");
        nome = sc.next();

        System.out.println(nome + " bem-vindo ao JAVA");

        sc.close();
    }
}
