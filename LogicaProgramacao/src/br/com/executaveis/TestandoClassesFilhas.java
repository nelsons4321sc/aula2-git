package br.com.executaveis;

import br.classe.objeto.Aluno;
import br.classe.objeto.Diretor;


public class TestandoClassesFilhas {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setNome("João Alves");
		aluno.setIdade(17);
		aluno.pessoaMaiorIdade();
		
		Diretor diretor = new Diretor();
		diretor.setNome("Afonso");
		diretor.pessoaMaiorIdade();
		
		System.out.println(diretor.pessoaMaiorIdade());
		
	
		
		
		
		
	}

}
