package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class TestaAluno {

	public static void main(String[] args) {
		Collection<String> alunos = new HashSet<>(); //tabela de espalhamento
		alunos.add("Vinicius Lemes");
		alunos.add("Victor Lemes");
		alunos.add("Rodrigo Guedes");
		alunos.add("Albert Silva");
		alunos.add("Renan Carvalho");
		alunos.add("Victor Lemes");
		
		//No Set você pode adicionar um elemento igual porém não irá aparecer dois elementos iguais,
		// aparecerá apenas um como no exemplo alunos.add("Victor Lemes");
		
		//Não tem garantia da ordem que os elementos vão ser adicionados
		
		System.out.println(alunos);
		
		boolean alunoEstaMatriculado = alunos.contains("Vinicius Lemes");
		alunos.remove("Albert Silva");
		
		System.out.println(alunoEstaMatriculado);
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
	}

}
