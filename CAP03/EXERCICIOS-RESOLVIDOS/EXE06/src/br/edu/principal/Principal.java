package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		double sal, salreceber, grat, imp;
		
		System.out.println("Salário base do funcionário: ");
		sal = sc.nextDouble();
		grat = sal*0.05;
		imp = sal*0.07;
		salreceber = sal + grat - imp;
		System.out.println("O funcionário irá receber $"+salreceber);

	}

}
