package co.edu.konradlorenz.view;

import java.util.Scanner;

public class Vista {
	
	private Scanner sc = new Scanner(System.in);
	
	public int pedirTamaño(String mensaje) {
		int numero = sc.nextInt();
		return numero;
	}
}
