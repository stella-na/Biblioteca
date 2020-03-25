package gestao_pessoas;

public class Atendente extends Pessoa{
	public Atendente (String nome, String cpf, String fone, String endereco, String cep, String email) {
		super(nome, cpf, fone, endereco, cep, email);
	}
	
	Integer identificador;
	private String senha = "12345";
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
