package gestao_emprestimos;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class RepositorioEmprestimo {
	
	public List<Emprestimo> emprestimos;
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	
	public RepositorioEmprestimo() {
		emprestimos = new ArrayList<Emprestimo>();
	}
	
	public void registrar (Emprestimo e) {
		emprestimos.add(e);
	}
	
	public void remover(String nomeProduto) {
		int posicao = -1;
		for(Emprestimo emprestimo : emprestimos) {
			if (emprestimo.nomeProduto.contentEquals(nomeProduto)) {
				posicao = emprestimos.indexOf(emprestimo);
				break;
			}
		}
		if (posicao != -1) {
			emprestimos.remove(posicao);
		}			
	}
	
	public void listar() {
		
		if(emprestimos != null && emprestimos.size() >= 1) {
			for (int i = 0; i < emprestimos.size(); i++) {
			
				System.out.println("Usu�rio: " + emprestimos.get(i).nome + "\nProduto: " +  emprestimos.get(i).nomeProduto +
				        		   "\nData de Empr�stimo: " +  formato.format(emprestimos.get(i).dataEmprestimo) + 
				        		   "\nData de Devolu��o: " +  formato.format(emprestimos.get(i).dataDevolucao));
				System.out.println("--------------------------------");
			}
			
		}else {
		System.out.println("\nN�o existem empr�stimos cadastrados\n");
		}
	}
}
