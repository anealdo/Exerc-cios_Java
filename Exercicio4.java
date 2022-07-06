package br.com.exercicios;

/*
 * Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento 
 * de 3% e que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%. Faça um programa
 * que calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a 
 * população do país B, mantidas as taxas de crescimento. 
 */

public class Exercicio4 {

	public static void main(String[] args) {

		int paisA = 80000;
		int paisB = 200000;
		double crescA;
		double crescB;
		int cont = 0;
		
		crescA = paisA * 1.03;
		crescB = paisB * 1.015;

		while (crescB > crescA) {
			crescA *= 1.03;
			crescB *= 1.015;
		cont++;	
		}

		System.out.println("População do país A: " + crescA + "\nPopulação do país B: " + crescB);
		System.out.println("A população do país A igualará a população do país B em " + cont + " anos.");
	}

}
