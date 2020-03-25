package gestao_acervos;

public class Acervo {
	
	public String codigo;
	public String anoPublicacao;
	public String volume;
	public String numeroPaginas;
	public String nome;
	public int tipo;
	
	public Livro livro;
	public Revista revista;
	public Jornal jornal;
	

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Acervo(String nome, String codigo, String anoPublicacao, String volume, String numeroPaginas) {
		this.codigo = codigo;
		this.anoPublicacao = anoPublicacao;
		this.volume = volume;
		this.numeroPaginas = numeroPaginas;
		this.nome = nome;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(String anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(String numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public boolean contentEquals(String codigo2) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
