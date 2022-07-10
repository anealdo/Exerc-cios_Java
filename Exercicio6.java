package br.com.exercicios;

	/*
	 * Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro. 
	 * Depois modifique o programa para que ele mostre os números um ao lado do outro. 
	 */

public class Exercicio6 {
	public static void main(String[] args) {
		
		int outraLinha = 0;
		//imprimindo cada número em linhas diferentes.
		for (int i = 0; outraLinha <= 20; outraLinha++) {
			System.out.println(outraLinha);
		}
		
		int mesmaLinha = 0;
		//
		for (int i = 0; mesmaLinha <= 20; mesmaLinha++) {
			System.out.print(mesmaLinha);
		}
	}
}
