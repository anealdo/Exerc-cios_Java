package Treino;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		int[] numero= new int [5];
		int suporte=0, media=0, soma = 0;

		for(int i=0; i < numero.length; i++) {
			System.out.println("Informe 5 números: ");
			numero[i]=scan.nextInt();
			soma += numero[i]; 
			media =soma /numero.length;
			if(suporte < numero[i]) {
				suporte = numero[i];				
			}
		}

		System.out.println("Maior número do Array "+suporte);
		System.out.println("Média dos números do Array: " + media);

	}

}




