package be.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salario, new_salario;
		
		System.out.println("Digite o salário: ");
		salario = sc.nextDouble();
		new_salario = salario*1.25;
		System.out.println("Seu salário recebeu um aumento de 25%, ficando $"+new_salario);

	}

}
