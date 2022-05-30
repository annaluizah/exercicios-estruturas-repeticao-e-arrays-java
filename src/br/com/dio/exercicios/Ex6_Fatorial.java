package br.com.dio.exercicios;

import java.util.Scanner;

/*Faça um programa que calcule o fatorial de um número inteiro fornecido
* pelo usuário
* Ex: 5!= 120
* */
public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número para mostrar o fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;

        System.out.println(fatorial + " ! = ");
        for(int i = fatorial; i >= 1; i--) {
            multiplicacao = multiplicacao * i;
        }

        System.out.println(multiplicacao);
    }
}
