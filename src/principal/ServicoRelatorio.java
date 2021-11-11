package principal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.Cliente;

public class ServicoRelatorio {
	
	List<String> listatxt = new ArrayList<>();
	
	public void geraRelatorio () {
		
		//add em .txt
		try(BufferedWriter clientetxt = new BufferedWriter(new FileWriter("C:\\Users\\Maicon\\Desktop\\Clientes.txt", true))) {
			for (Cliente cliente : ServicosCliente.getClientes()) {
				clientetxt.append(cliente.toString() + "\n");				
			}
		}
		catch(IOException e) {
			System.out.println("Não foi possivel inserir Clientes no Arquivo...");
		}
				
	}
	
	public void imprimirRelatorio() {
		try(BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\Maicon\\Desktop\\Clientes.txt"))){
			
			String imprimir = bf.readLine();
			
			while(imprimir != null) {
				 listatxt.add(imprimir);
				 imprimir = bf.readLine();
				 
			}
			
			for(String ler : listatxt) {
				System.out.println(ler);
			}
			
		}
		catch(IOException e) {
			System.out.println("Não foi encontrado Dados....");
		}
		
	}

}
