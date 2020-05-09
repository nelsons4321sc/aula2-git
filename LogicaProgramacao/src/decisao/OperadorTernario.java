package decisao;

public class OperadorTernario {

	public static void main(String[] args) {
		
		int nota1 = 70;
		int nota2 = 60;
		int nota3 = 90;
		int nota4 = 50;
		int media = 0;
		
		media = (nota1+nota2+nota3+nota4) / 4;
		
		String resultado = media >= 70 ? "Aluno Aprovado" : (media >= 40 && media <= 60) ? "Aluno em recuperação" : "Aluno Reprovado";
		
		System.out.println(resultado);
		
			

	}

}
