package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double hora, h, m, conversao;
		
		System.out.println("Hora: ");
		hora = sc.nextDouble();
		h = Math.floor(hora);
		m = hora  - h;
		conversao = (h*60) + (m * 100);
		System.out.println("Equivale a "+conversao+" minutos");

	}

}