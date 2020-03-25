package gestao_emprestimos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import gestao_acervos.Acervo;
import gestao_acervos.Jornal;
import gestao_acervos.Livro;
import gestao_acervos.RepositorioAcervo;
import gestao_acervos.Revista;
import gestao_pessoas.Atendente;
import gestao_pessoas.ColecaoPessoas;
import gestao_pessoas.Pessoa;

public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		
		RepositorioAcervo repAcervo = new RepositorioAcervo();
		ColecaoPessoas colecao = new ColecaoPessoas();
		RepositorioEmprestimo repEmprestimo = new RepositorioEmprestimo();
		Atendente at = new Atendente(null, null, null, null, null, null);
		Emprestimo e = null;
		
		boolean loopLogin = true;
		while(loopLogin) {
		
		System.out.println("Como deseja logar?\n[1] - Atendente\n"
											 + "[2] - Usuário\n"
											 + "[3] - Sair do sistema");
		int login = scan.nextInt();
		//Atendente
		if(login == 1) {
			System.out.println("Digite sua senha");
			String senha = scan.next();
			//Atendente
			if(senha.equals(at.getSenha())) {
				//SENHA = "1"
				boolean loop = true;
				while (loop) {
				
				System.out.println("[1] - Gerir Pessoas\n"
								 + "[2] - Gerir Produtos\n"
								 + "[3] - Gerir Empréstimos\n"
								 + "[4] - Deslogar");
				int opcao = scan.nextInt();
				
				//Gerir Pessoas
				if(opcao == 1) {
					
					boolean opcao1 = true;
					while(opcao1) {
					
					System.out.println("[1] - Adicionar\n"
									 + "[2] - Listar\n"
									 + "[3] - Procurar\n"
									 + "[4] - Remover\n"
									 + "[5] - Voltar");
					int escolha = scan.nextInt();
					//Adicionar pessoas
					if(escolha == 1) {
						System.out.println("Digite o nome");
						String nome = scan.next();
						
						System.out.println("Digite o cpf");
						String cpf = scan.next();
						
						System.out.println("Digite o fone");
						String fone = scan.next();
						
						System.out.println("Digite o endereço");
						String endereco = scan.next();
						
						System.out.println("Digite o cep");
						String cep = scan.next();
						
						System.out.println("Digite o email");
						String email = scan.next();			
						
						Pessoa p = new Pessoa(nome, cpf, fone, endereco, cep, email);
						colecao.inserir(p);
						
						System.out.println("\nUsuário Registrado\n");
					
					}//listar pessoas
					else if(escolha == 2) {		
						colecao.listar();						
						
					}//procurar pessoas
					else if(escolha ==3) {
						System.out.println("Digite o CPF da pessoa procurada");
						String cpf = scan.next();
						
						colecao.procurar(cpf);
						
					}//remover pessoas
					else if(escolha == 4) {
						System.out.println("Digite o CPF da pessoa que deseja remover");
						String cpf = scan.next();
						colecao.remover(cpf);
						System.out.println("\nPessoa Removida\n");
					}
					else if(escolha == 5) {
						opcao1 = false;
					}
					else { System.out.println("\nOpção Inválida\n"); }
					
				}	
				}//Gerir Produtos
				else if(opcao == 2) {
					
					boolean opcao2 = true;
					while(opcao2) {
					
					Acervo a = new Acervo(null, null, null, null, null);
					System.out.println("[1] - Adicionar\n"
									 + "[2] - Listar\n"
									 + "[3] - Procurar\n"
									 + "[4] - Remover\n"
									 + "[5] - Voltar");
					int escolha = scan.nextInt();
					// adicionar produtos
					if(escolha == 1) {
						System.out.println("[1] - Livro\n"
										 + "[2] - Revista\n"
										 + "[3] - Jornal");
						a.tipo = scan.nextInt();
						if(a.tipo == 1 || a.tipo == 2 || a.tipo == 3) {
							System.out.println("Nome do produto ");
							a.nome = scan.next();
							System.out.println("Código");
							a.codigo = scan.next();
							System.out.println("Ano de publicação");
							a.anoPublicacao = scan.next();
							System.out.println("Volume");
							a.volume = scan.next();
							System.out.println("Numero de páginas");
							a.numeroPaginas = scan.next();
							
							Livro livro = new Livro(null, null, null, null, null);
							Jornal jornal = new Jornal(null, null, null, null, null);
							Revista revista = new Revista(null, null, null, null, null);
							a.livro = livro;
							a.jornal = jornal;
							a.revista = revista;
						
						}else { System.out.println("\n-----------Opção Inválida----------\n"); }
						
						if(a.tipo == 1) {
							//livro
							System.out.println("Nome do autor");
							a.livro.nomeAutor = scan.next();
							System.out.println("Editora");
							a.livro.editora = scan.next();
							System.out.println("Edição");
							a.livro.edicao = scan.next();
							
							repAcervo.inserir(a);
						}
						else if(a.tipo == 2) {
							//revista
							System.out.println("Edição");
							a.revista.edicao = scan.next();
							
							repAcervo.inserir(a);	
						}
						else if(a.tipo == 3) {
							//jornal
							repAcervo.inserir(a);
						}
						
					}// listar produtos
					else if(escolha == 2) {
						repAcervo.listar();
					
					}//procurar produtos
					else if(escolha == 3) {
						System.out.println("Digite o codigo do produto");
						String codigo = scan.next();
						repAcervo.procurar(codigo);
						
						
					}//remover produtos
					else if(escolha == 4) {
						System.out.println("Digite o código do produto que deseja remover");
						String codigo = scan.next();
						repAcervo.remover(codigo);
						System.out.println("\nProduto Removido\n");
					}
					else if(escolha == 5) {
						opcao2 = false;
					}
					else { System.out.println("\nOpção Inválida\n"); }
				}	
				}//Gerir Empréstimos
				else if (opcao == 3) {
					
					boolean opcao3 = true;
					while(opcao3) {
					
					System.out.println("[1] - Registrar\n"
									 + "[2] - Listar\n"
									 + "[3] - Remover\n"
									 + "[4] - Voltar");
					int escolha = scan.nextInt();
					
					//Registrar Emprestimos
					if(escolha == 1) {
						System.out.println("Digite o nome do usuário");
						String nome = scan.next();
						
						System.out.println("Digite o nome do livro/jornal/revista");
						String nomeProduto = scan.next();
							
						try {
						System.out.println("Digite a data do empréstimo (dd/mm/aaaa)");
						String data = scan.next();
						
						Date dataEmprestimo = formato.parse(data);
//						System.out.println(formato.format(dataEmprestimo));
						
						Date data1 = formato.parse(data);
						
						data1.setDate(data1.getDate() + 10);
						String devolucao = formato.format(data1);
						Date dataDevolucao = formato.parse(devolucao);
						
						System.out.println("Data de Devolução é : " + formato.format(dataDevolucao) + "\n");
							
						e = new Emprestimo(nome, nomeProduto, dataEmprestimo, dataDevolucao);
							
						repEmprestimo.registrar(e);
						}
						catch(ParseException ex) {
							System.out.println("\nInforme uma data no formato dd/mm/aaaa\n");
						}				
					}//listar emprestimos
					else if(escolha == 2) {
						repEmprestimo.listar();
					
					}//remover emprestimos
					else if(escolha == 3) {
						
//						e = new Emprestimo(e.nome, e.nomeProduto, e.dataEmprestimo, e.dataDevolucao);
						
						System.out.println("Digite o nome do produto a ser devolvido");
						String nomeProduto = scan.next();
				
						try {
						System.out.println("Digite a data de devolução (dd/mm/aaaa)");
						String data = scan.next();
						
						Date dataDevolvida = formato.parse(data);
						
						Calendar calendario1 = Calendar.getInstance();
						Calendar calendario2 = Calendar.getInstance();
						
						
						System.out.println(e.dataEmprestimo);
						
						calendario1.setTime(e.getDataEmprestimo());	
						calendario2.setTime(dataDevolvida);
						Long dias = (calendario2.getTimeInMillis() - calendario1.getTimeInMillis()) / (24*60*60*1000);
						Double multa = 0.0;
						
						if(dias < 0) {
							System.out.println("Data de devolução Incorreta.\n"
												+ "    Tente Novamente\n");
						
						}else if(dias > 0 && dias < 10) {
							repEmprestimo.remover(nomeProduto);
							System.out.println("\nEmprestimo Removido\n");
						
						} else {
							multa = (dias - 10) * 1.00;
							System.out.println("Pague a multa de: R$ " + multa
												+ " reais\nreferente a " + (dias - 10)
												+ " dias de atraso\n");
							
							System.out.println("1- pago.\n2- Não pago.");
							int pg = scan.nextInt();
							
							if (pg == 1) {
								repEmprestimo.remover(nomeProduto);
								System.out.println("\nEmprestimo Removido\n");
							
							} else {
								System.out.println("Volte quando a multa for paga\n");
							}
							
						}
						}
						catch (ParseException ex) {
							System.out.println("\nInforme uma data no formato dd/mm/aaaa\n");
						}
										
					}
					else if(escolha == 4) {
						opcao3 = false;
					}
					
					else { System.out.println("\nOpção Inválida\n"); }
					
				}
				}	
				else if(opcao == 4) {
					System.out.println("------Atendente deslogado------\n");
			   		loop = false;
				}
				
				else { System.out.println("\nOpção Inválida\n"); }
			}	
			}
			else { System.out.println("Login ou Senha Incorretos\n    Tente Novamente\n"); }
			
		
		}//usuário
		else if (login == 2) {
			
			boolean login2 = true;
			while(login2) {
			
			System.out.println("[1] - Procurar\n"
							 + "[2] - Listar\n"
							 + "[3] - Deslogar");
			int opcao = scan.nextInt();
			
			//procurar produtos
			if(opcao == 1) {
				System.out.println("Digite o codigo do produto");
				String codigo = scan.next();
				repAcervo.procurar(codigo);
				
			}//listar produtos
			else if(opcao == 2) {
				repAcervo.listar();				
			
			}//deslogar usuário
			else if(opcao == 3) {
				System.out.println("------Usuário deslogado------\n");
				login2 = false;
			}
			else { System.out.println("\nOpção Inválida\n"); }
			
			}
		}//sair do sistema
		else if(login == 3) {
			System.out.println("\n------Saindo do Sistema------\n");
	   		loopLogin = false;
		}
		
		else { System.out.println("\nOpção Inválida\n"); }
			
		}	
		
	}

}
