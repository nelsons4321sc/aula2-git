package decisao;

public class Numero {

	public static void main(String[] args) {
		boolean num1 = false;
		boolean num2 = false;
		boolean num3 = true;
		
		if(num1 && num2 | num3) {
			System.out.println("entrou na condição");
		}else {
			System.out.println("NÃO entrou na condição");
		}

	}

}
