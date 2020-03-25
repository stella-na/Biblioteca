package gestao_acervos;

public class Revista extends Acervo{
	public Revista(String nome, String codigo, String anoPublicacao, String volume, String numeroPaginas) {
		super(nome, codigo, anoPublicacao, volume, numeroPaginas);
	
	}
	
	public String edicao;
}
