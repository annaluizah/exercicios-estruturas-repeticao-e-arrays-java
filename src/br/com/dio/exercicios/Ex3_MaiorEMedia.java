package br.com.dio.exercicios;

import java.util.Scanner;

/*Faça um programa que leia 5 números e informe
* o maior número e a média desses números*/
public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int count = 0;
        int soma = 0;
        int numMaior = 0;

        do {
            System.out.println("Digite o número: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > numMaior) numMaior = numero;
            count++;
        } while (count < 5);

        System.out.println("Maior número é: " + numMaior);
        System.out.println("A média dos números é: " + (soma/5));

    }
}
