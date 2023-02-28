package View;

import java.util.Scanner;
import Controller.OperacoesController;

public class Main {

	public static void main(String[] args) {

		OperacoesController OC = new OperacoesController();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma palavra: ");
		String palavra = sc.nextLine();
		
		String palavrainvertida = OC.InverteString(palavra);
		sc.close();
		
		System.out.println("Palavra Invertida: " + palavrainvertida);
	}

}
