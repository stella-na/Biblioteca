package gestao_acervos;

import java.util.ArrayList;
import java.util.List;

public class RepositorioAcervo {
		
	public List<Acervo> acervos;
	
	public RepositorioAcervo() {
		acervos = new ArrayList<Acervo>();
	}
		
	public void inserir (Acervo a) {
		acervos.add(a);
	}
			
	public boolean procurar (String codigo) {
		boolean encontrado = false;
		int i = 0;
		while(encontrado == false && i < acervos.size()) {
			if (acervos.get(i).getCodigo().compareToIgnoreCase(codigo) == 0) {
				encontrado = true;
			}else {
				i++;
			}
		}
		if(encontrado) {
			int tipo = acervos.get(i).tipo;
			
			if(tipo == 1) {
				//livro
				System.out.println("--------------------------------");
				System.out.println("Livro: " + acervos.get(i).nome + "\nCódigo: " + acervos.get(i).codigo +
						           "\nAno de Publicação: " + acervos.get(i).anoPublicacao + 
						           "\nVolume: " + acervos.get(i).volume + "\nNúmero de Páginas: " 
						           + acervos.get(i).numeroPaginas + "\nNome do Autor: " + acervos.get(i).livro.nomeAutor
						           + "\nEditora: " + acervos.get(i).livro.editora + "\nEdição: " + acervos.get(i).livro.edicao);
				System.out.println("--------------------------------");
				return false;
			}
			else if(tipo == 2) {
				// revista
				System.out.println("--------------------------------");
				System.out.println("Revista: " + acervos.get(i).nome + "\nCódigo: " + acervos.get(i).codigo +
						           "\nAno de Publicação: " + acervos.get(i).anoPublicacao + 
						           "\nVolume: " + acervos.get(i).volume + "\nNúmero de Páginas: " 
						           + acervos.get(i).numeroPaginas + "\nNome do Autor: " + acervos.get(i).revista.edicao);
				System.out.println("--------------------------------");
				return false;
			}
			else if(tipo == 3) {
				//jornal
				System.out.println("--------------------------------");
				System.out.println("Jornal: " + acervos.get(i).nome + "\nCódigo: " + acervos.get(i).codigo +
						           "\nAno de Publicação: " + acervos.get(i).anoPublicacao + 
						           "\nVolume: " + acervos.get(i).volume + "\nNúmero de Páginas: " 
						           + acervos.get(i).numeroPaginas);
				System.out.println("--------------------------------");
				return false;
					}
		} else {
			System.out.println("\n   Código Inexistente\n");
			return true;
		}
		return encontrado;
		
	}
	
	public void remover(String codigo) {
		int posicao = -1;
		for(Acervo acervo : acervos) {
			if (acervo.getCodigo().contentEquals(codigo)) {
				posicao = acervos.indexOf(acervo);
				break;
			}
		}
		if (posicao != -1) {
			acervos.remove(posicao);
		}			
	}
	
	public void listar() {
		
		if(acervos != null && acervos.size() >= 1) {
		for (int i = 0; i < acervos.size(); i++) {
			
			int tipo = acervos.get(i).tipo;
			
			if(tipo == 1) {
				//livro
				System.out.println("Livro: " + acervos.get(i).nome + "\nCódigo: " + acervos.get(i).codigo +
						           "\nAno de Publicação: " + acervos.get(i).anoPublicacao + 
						           "\nVolume: " + acervos.get(i).volume + "\nNúmero de Páginas: " 
						           + acervos.get(i).numeroPaginas + "\nNome do Autor: " + acervos.get(i).livro.nomeAutor
						           + "\nEditora: " + acervos.get(i).livro.editora + "\nEdição: " + acervos.get(i).livro.edicao);
				System.out.println("--------------------------------");
			
			}
			else if(tipo == 2) {
				// revista
				System.out.println("Revista: " + acervos.get(i).nome + "\nCódigo: " + acervos.get(i).codigo +
						           "\nAno de Publicação: " + acervos.get(i).anoPublicacao + 
						           "\nVolume: " + acervos.get(i).volume + "\nNúmero de Páginas: " 
						           + acervos.get(i).numeroPaginas + "\nNome do Autor: " + acervos.get(i).revista.edicao);
				System.out.println("--------------------------------");
		
			}
			else if(tipo == 3) {
				//jornal
				System.out.println("Jornal: " + acervos.get(i).nome + "\nCódigo: " + acervos.get(i).codigo +
						           "\nAno de Publicação: " + acervos.get(i).anoPublicacao + 
						           "\nVolume: " + acervos.get(i).volume + "\nNúmero de Páginas: " 
						           + acervos.get(i).numeroPaginas);
				System.out.println("--------------------------------");
					}
					
			
		}
			
		}
		else {
			System.out.println("\nNão existem produtos cadastrados\n");
		}
	
	}
		
}



