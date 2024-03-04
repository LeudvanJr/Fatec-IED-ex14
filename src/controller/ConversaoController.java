package controller;

public class ConversaoController {
	public ConversaoController() {
		// TODO Auto-generated constructor stub
	}
	
	//Funcao para converter decimal em binario
	public String decimalParaBinario(int n) {
		
		//quando o quociente for 0, a sequencia de divisoes encerra
		if(n==0)
			return "";
		
		/*
		 * O resto da divisao eh guardado, para compor o resultado em binario.
		 * E o dividendo eh passado como parametro para uma nova chamada,
		 * formando uma cadeia de divisoes que, por meio do resto,
		 * converte decimal em binario.
		 */
		String resto = String.valueOf(n % 2);
		int quociente = n/2;
		
		return decimalParaBinario(quociente) + resto;
	}
}
