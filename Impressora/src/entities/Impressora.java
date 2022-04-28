package entities;

public class Impressora {
	
	public void exibir(float num1) {
		System.out.println(num1);
	}
	public void exibir(float num1, float num2) {
		System.out.println(num1 + "," + num2);
	}
	public void exibir(float num1, String text1) {
		System.out.println(num1 + "," + text1);
	}
	public void exibir(String text1, float num1) {
		System.out.println(text1 + "," + num1);
	}
	public void exibir(String text1, String text2, String text3) {
		System.out.println(text1 + "," + text2 + "," + text3 );
	}
	public void exibir(int num1, int num2, String text1) {
		System.out.println(num1 + "," + num2 + "," + text1);
	}
	
}
