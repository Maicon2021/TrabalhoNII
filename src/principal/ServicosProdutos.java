package principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import interfaces.Repository;
import model.Produto;

public class ServicosProdutos implements Repository {
	
	static List<Produto> produtos = new ArrayList<>();
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	Scanner entrada = new Scanner(System.in);
	
	
	@Override
	public void incluir() {
		try {
			System.out.println("------------------------------------------\n"
					+ "           -- Cadastro de Produto --\n");
			System.out.println("Descrição do Produto: ");
			String descricao = entrada.nextLine();
			
			System.out.println("Unidade de Medida: ");
			String unidadeMedida = entrada.nextLine();
			
			
			System.out.println("Categoria do Produto: ");
			String categoria = entrada.nextLine();
			
			System.out.println("Quantidade: ");
			int quantidade = entrada.nextInt();
			
			System.out.println("Preço: ");
			Double preco = entrada.nextDouble();
			
			System.out.println("Data de Validade: ");
			Date validade = sdf.parse(entrada.next());
			
			Produto produto = new Produto(descricao, unidadeMedida, categoria, quantidade, preco, validade);
			produtos.add(produto);			
			
		}
		catch(ParseException e) {
			System.out.println("Formato Data Invalida...");
		}
		
		
	}

	@Override
	public void ler() {
		
		
	}

}
