package org.example.estruturasequencial.entradadados;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        //Entrada de dados no JAVA
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome;
        System.out.println("Informe o nome: ");
        nome = sc.next();

        int idade;
        System.out.println("Informe a idade: ");
        idade = sc.nextInt();

        double peso;
        System.out.println("Informe o peso: ");
        peso = sc.nextDouble();

        char sexo;
        System.out.println("Informe o sexo da pessoal");
        sexo = sc.next().charAt(0);

        //Saída de dados em JAVA
        System.out.println("Nome da pessoa = " + nome);
        System.out.println("Idade da pessoal = " + idade);
        System.out.println("Peso da pessoa = " + peso);
        System.out.println("Sexo da pessoa = " + sexo);

        sc.close();
    }
}
