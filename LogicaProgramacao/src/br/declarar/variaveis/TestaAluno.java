package br.declarar.variaveis;

import javax.swing.JOptionPane;

import br.classe.objeto.Aluno;

public class TestaAluno {

	public static void main(String[] args) {
		//aluno1 - varável de referência
		//instanciar ou construir - new Aluno
		
		String nome = JOptionPane.showInputDialog("Qual é o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual é a idade do aluno?");
		String dataNascimento = JOptionPane.showInputDialog("data de nascimento?");
		String mae = JOptionPane.showInputDialog("Nome da mâe?");
		String pai = JOptionPane.showInputDialog("Nome do pai");
		String matricula = JOptionPane.showInputDialog("Data da matricula?");
		String nota1 = JOptionPane.showInputDialog("Nota 1");
		String nota2 = JOptionPane.showInputDialog("Nota 2");
		String nota3 = JOptionPane.showInputDialog("Nota 3");
		String nota4 = JOptionPane.showInputDialog("Nota 4");
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setNomeEscola("Uninove");
		aluno1.setDataMatricula(matricula);
		aluno1.setNomePai(pai);
		aluno1.setNomeMae(mae);
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));
		
		
		System.out.println("Aluno: "+
		aluno1.getNome()+" sua idade é "
				+aluno1.getIdade()+" anos"+
				" e estuda na faculdade "+
				aluno1.getNomeEscola()+ " sua média na escola é de "+
				aluno1.getMediaNota());
		
		System.out.println("Por causa do valor da média: "+
		aluno1.getMediaNota()+", o aluno "+
				aluno1.getNome()+" foi "+
		(aluno1.getAlunoAprovado() ? "aprovado" : "reprovado"));
		
		/*+++++===================================================================================++++*/
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Maria");
		aluno2.setIdade(20);
		aluno2.setNomeEscola("FEI");
		
		System.out.println("Aluno: "+aluno2.getNome()+" sua idade é "+aluno2.getIdade()+" anos"+
				" e estuda na faculdade "+aluno2.getNomeEscola());
		/*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
		
		System.out.println(aluno1);
		System.out.println("Salário  Aluno: "+ aluno2.salario());
		
	}

}
