package br.com.exercises.lists;

import java.util.ArrayList;
import java.util.List;

public class Exercise03 {
	/*
	 * Faça um Programa que leia 4 notas, mostre as notas e a média na tela
	 */
	public static void main(String[] args) {
		List<Integer> notas = new ArrayList<Integer>();
		notas.add(10);
		notas.add(5);
		notas.add(8);
		notas.add(7);
		
		Integer media = 0;
		for(int i = 0; i < notas.size(); i++) {
			notas.add(i);
		}
		
	}

}