package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double ang, alt, escada, radiano;
		
		System.out.println("Ângulo de inclinação da escada em graus: ");
		ang= sc.nextDouble();
		System.out.println("Altura da parede onde esta a ponta da escada: ");
		alt = sc.nextDouble();
		radiano = ang * 3.14/180;
		escada = alt / Math.sin(radiano);
		System.out.println("A medida da escada é de "+escada+" metros");
		
	}

}
