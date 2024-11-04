package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x, y, z;
		
		System.out.println("Tamanho da escadas em metros: ");
		z = sc.nextDouble();
		System.out.println("Altura que deseja pegar  o quadro: ");
		x = sc.nextDouble();
		y = Math.pow(z, 2) -  Math.pow(x, 2);
		y = Math.sqrt(y);
		System.out.println("A Distância em que deverá ficar a escada é de "+y+" metros");
		
	}

}
