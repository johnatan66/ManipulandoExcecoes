


public class MainClass {
	public static void main(String args[]) {
		
		try {
			Pessoa p = new Pessoa("", 40);
		}
		catch(Exception ex) {
			System.out.println("ERRO: "+ex.getMessage());
		}
		
		
		/*
		
		int    valor1;
		int    valor2;
		Scanner teclado = new Scanner(System.in);
		
		//usa o try para iniciar um bloco que sera verificado
		try {
		System.out.println("Digite um valor inteiro");
		valor1 = teclado.nextInt();
		System.out.println("Digite um valor real");
		valor2 = teclado.nextInt();
		
		float res = valor1/valor2;
		
		System.out.println("Resultado da divisao = "+res);
		
		// para usar o catch tem que ter uma sequencia de erros do mais simples para o mais complexo.
	}
	catch(ArithmeticException ex) {
		System.out.println("Erro na divisao");
	}
	catch(InputMismatchException ex) {
		System.out.println("Erro na entrada de dados");
	}
	catch(Exception ex) {
		System.out.println("Deu ruim");
		
	}
	
	*/
	}
}
