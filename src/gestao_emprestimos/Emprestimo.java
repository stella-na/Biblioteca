package gestao_emprestimos;


import java.util.Date;

public class Emprestimo {
	
	String nome;
	String nomeProduto;
	Date dataEmprestimo;
	Date dataDevolucao;
	Date dataDevolvida;
	
	Emprestimo e;
	
	public Emprestimo (String nome, String nomeProduto, Date dataEmprestimo, Date dataDevolucao) {
		this.nome = nome;
		this.nomeProduto = nomeProduto;
		this.dataEmprestimo = dataEmprestimo;
		this.dataDevolucao = dataDevolucao;
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}
	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}
	public Date getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}	
}
