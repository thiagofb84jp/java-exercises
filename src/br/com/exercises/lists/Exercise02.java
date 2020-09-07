package br.com.exercises.lists;

import java.util.ArrayList;
import java.util.List;

public class Exercise02 {
	/*
	 * Faça um Programa que leia um vetor de 10 números reais e mostre-os na ordem
	 * inversa
	 */
	public static void main(String[] args) {
		List<Double> list = new ArrayList<>();
		list.add(589.543D);
		list.add(10.5D);
		list.add(-5.9D);
		list.add(5858.66D);
		list.add(87.66D);
		list.add(2D);

		System.out.println("Ordem normal: " + list);

		for (int i = 0, j = list.size() - 1; i < j; i++) {
			list.add(i, list.remove(j));
		}

		System.out.println("Ordem reversa: " + list);
	}
}