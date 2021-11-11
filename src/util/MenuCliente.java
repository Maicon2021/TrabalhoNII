package util;

import java.util.Scanner;

import principal.ServicoRelatorio;
import principal.ServicosCliente;

public class MenuCliente {
	Scanner entrada = new Scanner(System.in);
	
	ServicosCliente servicosCliente = new ServicosCliente();
	
	ServicoRelatorio relatorio = new ServicoRelatorio();
		
	public void entrarMenuCliente() {
		
		int opcao = 0;
		// repete enquanto diferente ou igual a 0
		do {
			System.out.print(" --------- Cadastro Cliente ---------\n"
					+ " 1 - Cadastrar\n 2 - Ler\n 0 - Sair\n Opçao: \t");
			
			opcao = entrada.nextInt();
			
			switch (opcao) {
			case 1:
				servicosCliente.incluir();
				
				break;
			case 2:
				servicosCliente.ler();
				break;
			case 0:
				relatorio.geraRelatorio();
				
				break;
				
			default:
				System.out.println("Opção Invalida...");
				break;
						
			}
			// fim da repetição
		} while (opcao != 0);
	}
	
}

