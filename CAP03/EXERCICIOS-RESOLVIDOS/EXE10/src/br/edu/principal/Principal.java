package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double area, raio;
		
		System.out.println("Digite o raio: ");
		raio = sc.nextDouble();
		area = 3.1415 * (raio*raio);
		System.out.println("a área do circulo é "+area);
	}

}
