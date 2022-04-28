package application;

import entities.Impressora;

public class Program {

	public static void main(String[] args) {
		Impressora impressora1 = new Impressora();
		
		impressora1.exibir(2.5f);
		impressora1.exibir(10.5f, 20.7f);
		impressora1.exibir(30.6f, "Esse e");
		impressora1.exibir("O tal Jogo que", 20.7f);
		impressora1.exibir("e melhor que godofwar 4", "de usuario para ter uma", "ideia da midia do playstation 4");
		impressora1.exibir(1, 2, "Lacoste");

	}

}
