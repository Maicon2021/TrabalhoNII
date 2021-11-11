package principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import interfaces.Repository;
import model.Funcionario;

public class ServicosFuncionario implements Repository {
	
	Scanner entrada = new Scanner(System.in);
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	static List<Funcionario> funcionarios = new ArrayList<>();
	
	@Override
	public void incluir() {
		try {
			System.out.println("------------------------------------------\n"
					+ "           -- Cadastrando Funcion�rio --\n");
			System.out.println("Informe Nome Funcion�rio: \t");
			String nome = entrada.nextLine();		
			
			System.out.println("Informe CPF do Funcion�rio: \t");
			String cpf = entrada.next();
						
			System.out.println("Informe Idade: \t");
			int idade = entrada.nextInt();
			
			System.out.println("Informe Data de Nascimento: \t");
			Date dataNascimento = sdf.parse(entrada.next());
			
			System.out.println("Informe Sexo: \t");
			char sexo = entrada.next().charAt(0);
			entrada.nextLine();	
			
			System.out.println("Informe Endere�o: \t");
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
			
			System.out.println("Informe o Ano Admiss�o: \t");
			int anoAdmissao = entrada.nextInt();
			entrada.nextLine();
			
			System.out.println("Informe N�mero CTPS: \t");
			String numeroCtps = entrada.nextLine();
			
			System.out.println("Informe Sal�rio: \t");
			Double salario = entrada.nextDouble();
			entrada.nextLine();
			
			System.out.println("Informe Cargo: \t");
			String cargo = entrada.nextLine();
			
			Funcionario funcionario = new Funcionario(nome, cpf, idade, dataNascimento, sexo, endereco, numero, 
					bairro, cidade, estado, email, anoAdmissao, numeroCtps, salario, cargo);
			funcionarios.add(funcionario);
			
			
			System.out.println("\nFuncion�rio Salvo...");
		}
		catch(ParseException e) {
			System.out.println("Formato Data Nascimento Invalida...");
		}
		
		
	}

	@Override
	public void ler() {
		System.out.println("\n                          ----------- Lista de Funcion�rios -----------\n");
		
		for (Funcionario funcionario : funcionarios) {
			
			System.out.println(funcionario);
			System.out.println("----------------------------------------------------------------------------------");
			
		}
		
	}

}
