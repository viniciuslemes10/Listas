package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as colecoes do Java",
                "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));
        
        Aluno aluno1 = new Aluno("Vinicius Lemes", 13350);
        Aluno aluno2 = new Aluno("Victor Lemes", 13349);
        Aluno aluno3 = new Aluno("Carlos Santos", 22150);
        
        javaColecoes.matricula(aluno1);
        javaColecoes.matricula(aluno2);
        javaColecoes.matricula(aluno3);
        
        System.out.println("Todos os alunos matriculados: ");
        
        Set<Aluno> alunos = javaColecoes.getAlunos();
        Iterator<Aluno> iterador = alunos.iterator();
        while(iterador.hasNext()) {
        	Aluno proximo = iterador.next();
        	System.out.println(proximo);
        }
        
//        javaColecoes.getAlunos().forEach(aluno -> {
//        	System.out.println(aluno);
//        });
        
        Aluno aluno4 = new Aluno("Vinicius Lemes", 13350);
        System.out.println("O aluno " + aluno4 + " está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(aluno4));
        
        System.out.println("O aluno1 é equals aluno4?");
        System.out.println(aluno1.equals(aluno4));
        
        //Se dois objetos são equals obrigatoriamente tem que ter o mesmo hashCode:
        
        System.out.println(aluno1.hashCode() == aluno4.hashCode());
	}

}
