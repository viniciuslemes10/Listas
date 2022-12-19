package br.com.alura;

public class TestaBuscaAlunosNoCurso {
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
        
        System.out.println("Quem é o aluno com a matricula 13349?");
        
      //A matricula 13360 não existe por isso lança uma exception
        Aluno aluno = javaColecoes.buscaMatriculado(13360);
        System.out.println("Aluno : " + aluno);
	}
}
