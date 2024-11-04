package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salario, perc, aumento, new_salario;
		
		System.out.println("Digite o salario: ");
		salario = sc.nextDouble();
		System.out.println("Percentual de almento: ");
		perc = sc.nextDouble();
		aumento = salario * (perc/100);
		System.out.println("Seu aumento foi de $"+aumento);
		new_salario = salario + aumento;
		System.out.println("Seu salário pós almento $"+new_salario);

	}

}
