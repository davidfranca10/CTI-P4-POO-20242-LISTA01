package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salario, cheque1, cheque2, cpmf1, cpmf2, saldo;
		
		System.out.println("Salário: ");
		salario = sc.nextDouble();
		System.out.println("Cheque 1: ");
		cheque1 = sc.nextDouble();
		System.out.println("Cheque21: ");
		cheque2 = sc.nextDouble();
		cpmf1 = cheque1 * 0.38/100;
		cpmf2 = cheque2 * 0.38/100;
		saldo = salario - cheque1 - cheque2 - cpmf1 - cpmf2;
		System.out.println("Valor de saldo: $"+saldo);
		
		
		
	}

}
