
public class Pessoa {
	private String nome;
	private int idade;
	
	
	public Pessoa(String nome, int idade)  throws Exception {
		super();
		if( nome == null || nome.length() == 0 || idade < 0) {
			throw new Exception("Valores invalidos para iniciarlizar");
		}
		this.nome = nome;
		this.idade = idade;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) throws Exception {
		if (nome == null || nome.length() == 0) {
			throw new Exception("Valor invalido para o atribulo NOME");
		}
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}
									// se usar o Exception precisa usar o throws no cabeçalho pois eh uma exceção verificada

	public void setIdade(int idade)  throws Exception{
		if(idade < 0) {
			throw new Exception("Valor invalido para idade");
		}
		this.idade = idade;
	}
	
	
	
	
}
