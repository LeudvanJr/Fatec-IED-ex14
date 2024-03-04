package view;

import java.io.IOException;
import java.util.Scanner;

import controller.ConversaoController;

public class Principal {

	public static void main(String[] args) throws IOException {
		ConversaoController cControler = new ConversaoController();
		Scanner in = new Scanner(System.in);
		
		int valor;
		String binario;
		
		do {
			System.out.println("Insira um valor entre 0-2000:");
			valor = in.nextInt();
		}while(valor < 0 || valor > 2000);
		
		binario = cControler.decimalParaBinario(valor);
		System.out.println(binario);
	}

}
