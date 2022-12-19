package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {
		

		String aula1 = "Modelando a classe Aula";
		String aula2 = "Conhecendo mais de listas";
		String aula3 = "Trabalhando com Cursos e Sets";

		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);        

		System.out.println(aulas);
		
		aulas.remove(0); //removendo uma aula na pisição 0
		System.out.println(aulas);
		
		System.out.println("Foreach:");
		
		for (String aula : aulas) { //fazendo um foreach
		    System.out.println("Aula: " + aula);
		}
		
		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula é " + primeiraAula);
		
		System.out.println("For:");
		
		for(int i = 0; i < aulas.size(); i++) {	//fazendo um for
			System.out.println("Aula: " + aulas.get(i));
		}
		
		System.out.println(aulas.size()); //metodo que mostra a quantidade
		
		System.out.println("Usando o método forEach com lambda:");
		
		aulas.forEach(aula -> { //usando o mtodo forEach com lambda
		    System.out.println("Percorrendo:");
		    System.out.println("Aula " + aula);
		});
		
		aulas.add("Aumentando nosso conhecimento");
		System.out.println("Não ordenado:");
		System.out.println(aulas);
		
		System.out.println("Ordenado:");
		Collections.sort(aulas);
		System.out.println(aulas);
		
	 }
}


