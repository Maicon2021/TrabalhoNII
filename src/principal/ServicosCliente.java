package principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import interfaces.Repository;
import model.Cliente;

public class ServicosCliente implements Repository{
	Scanner entrada = new Scanner(System.in);
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	ServicoRelatorio servico = new ServicoRelatorio();
	
	static List<Cliente> clientes = new ArrayList<>();
	
	
	public static List<Cliente> getClientes() {
		return clientes;
	}

	public static void setClientes(List<Cliente> clientes) {
		ServicosCliente.clientes = clientes;
	}

	@Override
	public void incluir() {
		try {
			System.out.println("------------------------------------------\n"
					+ "           -- Cadastrando Cliente --\n");
			System.out.println("Informe Nome Cliente: \t");
			String nome = entrada.nextLine();		
			
			System.out.println("Informe CPF do Cliente: \t");
			String cpf = entrada.next();
						
			System.out.println("Informe Idade: \t");
			int idade = entrada.nextInt();
			
			System.out.println("Informe Data de Nascimento: \t");
			Date dataNascimento = sdf.parse(entrada.next());
			
			System.out.println("Informe Sexo: \t");
			char sexo = entrada.next().charAt(0);
			entrada.nextLine();	
			
			System.out.println("Informe Endereço: \t");
			String endereco = entrada.nextLine();
			
			System.out.println("Informe Numero: \t");
			int numero = entrada.nextInt();
			entrada.nextLine();
			
			System.out.println("Informe Bairro: \t");
			String bairro = entrada.nextLine();
		
			System.out.println("Informe Cidade: \t");
			String cidade = entrada.nextLine();
			
			System.out.println("Informe Estado: \t");
			String estado = entrada.next();
			
			System.out.println("Informe E-mail: \t");
			String email = entrada.next();
			
			System.out.println("Informe Valor Cupom: \t");
			Double valorCupom = entrada.nextDouble();
			entrada.nextLine();
			
			System.out.println("Informe Tipo Cliente: \t");
			String tipoCliente = entrada.nextLine();
			
			Cliente cliente = new Cliente(nome, cpf, idade, dataNascimento, sexo, endereco, numero, bairro, cidade, estado, email, valorCupom, tipoCliente);
			clientes.add(cliente);
			
			System.out.println("\nCliente Salvo...");
		}
		catch(ParseException e) {
			System.out.println("Formato Data Nascimento Invalida...");
		}
		
		
	}

	@Override
	public void ler() {
		
		servico.imprimirRelatorio();
		
		/*System.out.println("\n                          ----------- Lista de Clientes -----------\n");
		for (Cliente cliente : clientes ) {
			
			System.out.println(cliente);
			System.out.println("------------------------------------------------------------------------------------------------\n");
		}
		*/
	}

	
}
