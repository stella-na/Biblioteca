package gestao_pessoas;

public class Usuario extends Pessoa{
	public Usuario(String nome, String cpf, String fone, String endereco, String cep, String email) {
		super(nome, cpf, fone, endereco, cep, email);
	}

	String matricula;
	String curso;
	
}
