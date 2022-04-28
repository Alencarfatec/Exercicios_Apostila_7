package entities;

public class CalculadoraCientifica {
	
	public Double raiz(int num1) {
		return Math.sqrt(num1);
	}
	public Double raiz(Double num1) {
		return Math.sqrt(num1);
	}
	public Double raiz(String text1) {
		return Math.sqrt(Double.parseDouble(text1));
	}
	
	public Double potencia(byte num1, byte num2) {
		return Math.pow(num1, num2);
	}
	public Double potencia(String text1, String text2) {
		return Math.pow(Double.parseDouble(text1), Double.parseDouble(text2));
	}
	public Double potencia(int num1 , Double num2) {
		return Math.pow(num1, num2);
	}
	
	
}
