package br.classe.objeto;

public class Diretor extends Pessoa {
	
	int registroEducacao;
	int tempoEducacao; 
	String titulacao;
	
	
	public int getRegistroEducacao() {
		return registroEducacao;
	}
	public void setRegistroEducacao(int registroEducacao) {
		this.registroEducacao = registroEducacao;
	}
	public int getTempoEducacao() {
		return tempoEducacao;
	}
	public void setTempoEducacao(int tempoEducacao) {
		this.tempoEducacao = tempoEducacao;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String toString() {
		return "Diretor [registroEducacao=" + registroEducacao + ", tempoEducacao=" + tempoEducacao + ", titulacao="
				+ titulacao + ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", CPF="
				+ CPF + ", RG=" + RG + ", nomePai=" + nomePai + ", nomeMae=" + nomeMae + "]";
	}
	
	
	
	
	

}
