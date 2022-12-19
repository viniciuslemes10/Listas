package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestandoSet {

	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		alunos.add("Victor Lemes");
		alunos.add("Vinicius Lemes");
		alunos.add("Nicolas Santos");
		alunos.add("Paulo Silveira");
		
		//Adicionando Alunos
		
		System.out.println(alunos.size());
		//A quantidade de Alunos
		
		alunos.add("Nicolas Santos");
		//Adicionando um Aluno existente
		
		System.out.println(alunos.size());
		//Testando para ver se a quantidade mudou
		
		boolean adicionou = alunos.add("Victor");
		System.out.println("Victor foi adicionado ao Set? " + adicionou);
		
	}

}
