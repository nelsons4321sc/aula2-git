package decisao;

public class LogicasAninhadas {

	public static void main(String[] args) {
		
		int nota1 = 30;
		int nota2 = 60;
		int nota3 = 40;
		int nota4 = 50;
		int media = 0;
		
		media = (nota1+nota2+nota3+nota4) / 4;
		
		
		
		if (media >= 50) {
			if (media >= 70 ) {
				System.out.println("Aluno está aprovado direto");
			} else {
				System.out.println("Aluno está em recuperação");
			}
		} else {
			System.out.println("Aluno Reprovado");
		}
	}

}
