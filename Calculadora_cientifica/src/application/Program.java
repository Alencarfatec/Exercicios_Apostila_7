package application;

import entities.CalculadoraCientifica;

public class Program {

	public static void main(String[] args) {
		CalculadoraCientifica calculadora1 = new CalculadoraCientifica();
		
		System.out.println(calculadora1.raiz(18));
		System.out.println(calculadora1.raiz(20.5));
		System.out.println(calculadora1.raiz("81"));
		
		System.out.println();
		
		System.out.println(calculadora1.potencia((byte)3, (byte)5));
		System.out.println(calculadora1.potencia("4","2"));
		System.out.println(calculadora1.potencia(2, 4.0));
	}

}
