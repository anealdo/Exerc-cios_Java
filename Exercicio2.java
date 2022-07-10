package br.com.exercicios;

import java.util.Scanner;

public class Exercicio2 {

	/*
	 * Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do
	 * usuário,mostrando uma mensagem de erro e voltando a pedir as informações. 
	 */
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String nome;
		String senha;

		System.out.println("Informe o nome do usuário: ");
		nome = sc.next();
		
		System.out.println("Informe uma senha");
		senha = sc.next();

		while(senha.equals(nome)) {
			System.out.println("A senha digitada é inválida");
			System.out.println("Informe o nome do usuário: ");
			nome = sc.next();
			
			System.out.println("Informe uma senha");
			senha = sc.next();
		
		}

	}
}
