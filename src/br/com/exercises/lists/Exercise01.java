package br.com.exercises.lists;

import java.util.ArrayList;
import java.util.List;

public class Exercise01 {
	/*
	 * Fa?a um Programa que leia um vetor de 5 n?meros inteiros e mostre-os
	 */
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println(list);		
	}
}