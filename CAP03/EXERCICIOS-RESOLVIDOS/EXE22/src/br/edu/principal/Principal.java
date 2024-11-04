package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double vlr_sal, qtd_kw, vlr_kw, vlr_reais, desc, vlr_desc;
		
		System.out.println("Salário: ");
		vlr_sal = sc.nextDouble();
		System.out.println("Quantidade de quilowatts consumida: ");
		qtd_kw = sc.nextDouble();
		vlr_kw = vlr_sal/5;
		vlr_reais = vlr_kw * qtd_kw;
		desc = vlr_reais * 15/100;
		vlr_desc = vlr_reais - desc;
		System.out.println("Valor de cada quilowatt $"+vlr_kw);
		System.out.println("Valor a ser pago por essa residência $"+vlr_reais);
		System.out.println("Valor com desconto: $"+vlr_desc);
	}

}
