package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, n2, n3, m;
		
		System.out.println("Digite o N1: ");
		n1 = sc.nextDouble();
		System.out.println("Digite o N2: ");
		n2 = sc.nextDouble();
		System.out.println("Digite o N3: ");
		n3 = sc.nextDouble();
		
		m = (n1 + n2 + n3)/3;
		
		System.out.println("Sua média foi "+ m);
		

	}

}
