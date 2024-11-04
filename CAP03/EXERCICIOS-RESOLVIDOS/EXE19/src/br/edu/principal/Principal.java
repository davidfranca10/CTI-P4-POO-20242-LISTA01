package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a_degrau, a_usuario, qtd_degraus;
		
		System.out.println("Altura de cada degrau(m): ");
		a_degrau= sc.nextDouble();
		System.out.println("Altura que o usuario deseja alcançar(m): ");
		a_usuario = sc.nextDouble();
		qtd_degraus = a_usuario/a_degrau; 
		System.out.println("É necessário subir "+qtd_degraus+" degraus para alcançar os "+a_usuario+" metros.");
		
	}

}
