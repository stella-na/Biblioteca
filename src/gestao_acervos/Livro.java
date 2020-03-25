package gestao_acervos;

public class Livro extends Acervo{
	public Livro(String nome, String codigo, String anoPublicacao, String volume, String numeroPaginas) {
		super(nome, codigo, anoPublicacao, volume, numeroPaginas);
	
	}
	
	int codigoAutor;
	public String nomeAutor;
	public String editora;	
	String ISBN;
	public String edicao;
	
	
	void procurar(Livro livro) {
		
	}


	public String getNomeAutor() {
		return nomeAutor;
	}


	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}


	public String getEditora() {
		return editora;
	}


	public void setEditora(String editora) {
		this.editora = editora;
	}


	public String getEdicao() {
		return edicao;
	}


	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
}
