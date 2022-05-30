package br.com.dio.exercicios;

import java.util.Scanner;

/*Faça um programa que peça N números inteiros, calcule e mostre
* a quantidade de números pares e a quantidade de números ímpares.  */
public class Ex4_ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Quantos números você quer? ");
        quantidadeNumeros = scan.nextInt();

        int count = 0;

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares++;
            else quantImpares++;

            count++;
        } while (count < quantidadeNumeros);

        System.out.println("Quantidade Pares: " + quantPares);
        System.out.println("Quantidade Ímpares: " + quantImpares);


    }
}
