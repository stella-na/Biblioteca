package gestao_pessoas;

import java.util.ArrayList;
import java.util.List;

public class ColecaoPessoas {
	
public List<Pessoa> listarPessoa;
	
	public ColecaoPessoas() {
		listarPessoa = new ArrayList<Pessoa>();
	}
	
	public void inserir (Pessoa p) {
		listarPessoa.add(p);
	
	}
	public boolean procurar (String cpf) {
		boolean encontrado = false;
		int i = 0;
		while(encontrado == false && i < listarPessoa.size()) {
			if (listarPessoa.get(i).getCpf().compareToIgnoreCase(cpf) == 0) {
				encontrado = true;
			}else {
				i++;
			}
		}
		if(encontrado) {
			System.out.println("Usuário: " + listarPessoa.get(i).getNome() + "\nCPF: " +listarPessoa.get(i).getCpf() +
	        		   "\nTelefone: " + listarPessoa.get(i).getFone() + "\nEndereço: " + listarPessoa.get(i).getEndereco() +
	        		   "\nCEP: " + listarPessoa.get(i).getCep() + "\nE-mail: " + listarPessoa.get(i).getEmail());
	System.out.println("--------------------------------");
		} else {
			System.out.println("\n   CPF não cadastrado\n");
			return true;
		}
		return encontrado;
		
	}
	
	public void remover(String cpf) {
		int posicao = -1;
		for(Pessoa pessoa : listarPessoa) {
			if (pessoa.getCpf().contentEquals(cpf)) {
				posicao = listarPessoa.indexOf(pessoa);
				break;
			}
		}
		if (posicao != -1) {
			listarPessoa.remove(posicao);
		}
	}
	
	public void listar() {
		
		if(listarPessoa != null && listarPessoa.size() >= 1) {
			for (int i = 0; i < listarPessoa.size(); i++) {
				
				System.out.println("Usuário: " + listarPessoa.get(i).getNome() + "\nCPF: " +listarPessoa.get(i).getCpf() +
				        		   "\nTelefone: " + listarPessoa.get(i).getFone() + "\nEndereço: " + listarPessoa.get(i).getEndereco() +
				        		   "\nCEP: " + listarPessoa.get(i).getCep() + "\nE-mail: " + listarPessoa.get(i).getEmail());
				System.out.println("--------------------------------");
			}
			
		}else {
		System.out.println("\nNão existem pessoas cadastradas\n");
		}
	}		
}
