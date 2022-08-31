package util;

import java.util.Scanner;

public class MenuGeral {
	Scanner entrada = new Scanner(System.in);
	
	MenuCliente menuCliente = new MenuCliente();
	
	MenuFuncionario menuFuncionario = new MenuFuncionario();
	
	public void opcaoMenu() {
		int opcao = 0;
		// repete enquanto diferente ou igual a 0
		do {
			System.out.print("                  --------- Menu ---------\n"
					+ " 1 - CLiente\n 2 - Funcionário\n 3 - Produto\n 4 - Venda\n 0 - Sair\nOpçao: \t");
			
			opcao = entrada.nextInt();
			
			switch (opcao) {
			case 1:				
				menuCliente.entrarMenuCliente();
								
				break;
				
			case 2:				
				menuFuncionario.entrarMenuFuncionario();
				
				break;
				
			case 3:
				
				break;
				
			case 4:
				
				break;
				
			case 0:
				System.out.println("Finalizando Processo....");
				break;
				
			default:
				System.out.println("Opção Invalida...");
				break;
						
			}
			// fim da repetição
		} while (opcao != 0);
	}
}
