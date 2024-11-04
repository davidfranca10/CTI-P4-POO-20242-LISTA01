package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, n2, n3, peso1, peso2, peso3, media;
		
		System.out.println("Digite N1: ");
		n1 = sc.nextDouble();
		System.out.println("Digite N2: ");
		n2 = sc.nextDouble();
		System.out.println("Digite N3: ");
		n3 = sc.nextDouble();
		System.out.println("Peso da nota 1: ");
		peso1 = sc.nextDouble();
		System.out.println("Peso da nota 2: ");
		peso2 = sc.nextDouble();
		System.out.println("Peso da nota 3: ");
		peso3 = sc.nextDouble();
		
		media = (n1*peso1 + n2*peso2 + n3*peso3)/(peso1+peso2+peso3);
		
		System.out.println("Sua média foi "+ media);

	}

}
