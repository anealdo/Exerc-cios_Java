package br.com.exercicios;

/*
 * Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais. 
 * Valide a entrada e permita repetir a operação. 
 */

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//variáveis para confirmar se o usuáro deseja continuar executando o programa ou não.
		String continuaB;
		String continua = "sim";
		
		/*
		 * Loop do/while será executado enquanto o usuário informar que deseja continuar a execução do programa.
		 */
		do {
		int paisA;
		System.out.println("Informe a quantidade de habitantes do país que tem o menor volume populacional: ");
		paisA = sc.nextInt();
		
		double taxaCrescPaisA;
		System.out.println("Informe a taxa de crescimento do país com o menor volume populacional: ");
		taxaCrescPaisA = sc.nextDouble();
		
		int paisB;
		System.out.println("Informe a quantidade de habitantes do país que tem o maior volume populacional: ");
		paisB = sc.nextInt();
		
		double taxaCrescPaisB = sc.nextDouble();
		System.out.println("Informe a taxa de crescimento do país com o maior volume populacional: ");
		
		double crescA;
		double crescB;
		int cont = 0;
		
		//Cálculo da quantidade de habitantes x taxa de créscimento populacional anual para os paises A e B.
		crescA = paisA * (1+taxaCrescPaisA / 100);
		crescB = paisB * (1+taxaCrescPaisB / 100);
		
		//Cálculo do crescimento anual enquanto a população do país B for maior que a do país A.
		while (crescB > crescA) {
			crescA *= (1+taxaCrescPaisA / 100);
			crescB *= (1+taxaCrescPaisB / 100);
		cont++;	
		}
		System.out.println("População do país A: " + crescA + "\nPopulação do país B: " + crescB);
		System.out.println("A população do país A igualará a população do país B em " + cont + " anos.");
		System.out.println("Deseja continuar? digite sim ou não");
		continuaB = sc.next();
		
		} while(continuaB.equals(continua)); 
		
		System.out.println("Programa finalizado!");
	}
		
}