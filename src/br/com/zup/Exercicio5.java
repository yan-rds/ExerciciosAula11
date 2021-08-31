package br.com.zup;

// Escreva um programa que declare um inteiro, inicialize-o com 0, e incremente-o de 1000 em 1000, imprimindo seu valor na tela, até que seu valor seja 100000 (cem mil).

public class Exercicio5 {
    public static void main(String[] args) {

        // Definindo variáveis
        int contador = 1;
        int numeroMostrado = 0;
        int divisao = 100000 / 1000;

        // Criando estrutura de repetição
        while (contador <= divisao){
            System.out.println(numeroMostrado);
            numeroMostrado += 1000;
            contador ++;
        }
    }
}
