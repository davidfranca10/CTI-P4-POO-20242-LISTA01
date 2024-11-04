package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double peso_saco, racao_gato1, racao_gato2, total_final;
		
		System.out.println("Peso do saco de ração(Kg): ");
		peso_saco = sc.nextDouble();
		System.out.println("Raçãp para o gato 1(g): ");
		racao_gato1 = sc.nextDouble();
		System.out.println("Raçãp para o gato 2(g): ");
		racao_gato2 = sc.nextDouble();
		racao_gato1 =  racao_gato1 / 1000;
		racao_gato2 =  racao_gato2 / 1000;
		total_final = peso_saco - 5*(racao_gato1+racao_gato2);
		System.out.println("Após cinco dias terá "+total_final+"Kg");
		
	}

}
