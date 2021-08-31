package br.com.zup;

// Faça um programa que leia n números inteiros positivos e calcule a soma desses números.

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Definindo variáveis
        int totalDeNumeros;
        int contador = 1;
        int numeroInserido;
        boolean numeroNegativo = false;
        int soma = 0;

        // Primeira parte do console
        System.out.println("Este programa irá ler a quantidade de números (inteiros e positivos) que você quiser, e somá-los");
        System.out.println("Para começarmos, digite a quantidade de números inteiros e positivos que você irá inserir");
        totalDeNumeros = leitor.nextInt();


        // Criando a estrutura de repetição
        while (contador <= totalDeNumeros) {
            System.out.println("Digite o " + contador + "º número");
            numeroInserido = leitor.nextInt();
            soma = soma + numeroInserido;
            contador++;
            if (numeroInserido < 0){
                numeroNegativo = true;
            }
        }

        // Condicional que dirá pro usuário se ele digitou um valor inválido
        if (numeroNegativo == false) {
            System.out.println("A soma dos números inseridos é de: "+soma);
        }
        else {
            System.out.println("Você digitou um número negativo, por favor recomece");
        }

    }
}
