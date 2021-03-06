package br.com.exercises.structureDecision;

import java.util.Locale;
import java.util.Scanner;

public class Exercise10 {

	/**
	 * Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.US);

		System.out.println("Por favor, informe o turno no qual voc? estuda:");
		String turno = in.next();
		
		switch (turno.toUpperCase()) {
		case "M":
			System.out.println("Bom dia!");
			break;
		case "V":
			System.out.println("Boa tarde!");
			break;			
		case "N":
			System.out.println("Boa noite!");
			break;
		default:
			System.out.println("Valor inv?lido. Por favor, verifique novamente.");
			break;
		}
		
		in.close();
	}
}