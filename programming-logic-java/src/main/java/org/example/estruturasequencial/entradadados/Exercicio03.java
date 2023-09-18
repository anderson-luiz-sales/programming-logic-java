package org.example.estruturasequencial.entradadados;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        /*  Exercício 3: Solicite ao usuário que insira uma cidade e um estado separadamente. Em seguida, exiba uma mensagem combinando a cidade e o estado para formar um endereço completo.
	            ENTRADA 1: Itapolis
                ENTRADA 2: SP
	            SAÍDA: Itapolis - SP
        */
        Scanner sc = new Scanner(System.in);

        String cidade, estado;
        System.out.println("Informe a cidade: ");
        cidade = sc.next();

        System.out.println("Informe o estado: ");
        estado = sc.next();

        System.out.println(cidade + " - " + estado);

        sc.close();
    }
}
