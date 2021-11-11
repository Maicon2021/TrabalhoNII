package util;

import java.util.Scanner;

import principal.ServicosFuncionario;
	

public class MenuFuncionario {
	
	Scanner entrada = new Scanner(System.in);
	
	ServicosFuncionario servicosFuncionario = new ServicosFuncionario();
	
	public void entrarMenuFuncionario() {
		
		int opcao = 0;
		// repete enquanto diferente ou igual a 0
		do {
			System.out.print(" --------- Cadastro Funcion�rio ---------\n"
					+ " 1 - Cadastrar\n 2 - Ler\n 0 - Sair\n Op�ao: \t");
			
			opcao = entrada.nextInt();
			
			switch (opcao) {
			case 1:
				servicosFuncionario.incluir();
				
				break;
			case 2:
				servicosFuncionario.ler();
				break;
			case 0:
				
				break;
				
			default:
				System.out.println("Op��o Invalida...");
				break;
						
			}
			// fim da repeti��o
		} while (opcao != 0);
	}
}
