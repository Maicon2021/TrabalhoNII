package model;

import java.util.Date;


public class Cliente extends Pessoa {


	private Double valorCupom;
	private String tipoCliente;
	
	public Cliente() {
		
	}
	public Cliente(String nome, String cpf, Integer idade, Date dataNascimento, char sexo, String endereco,
			Integer numero, String bairro, String cidade, String estado, String email, Double valorCupom,
			String tipoCliente) {
		super(nome, cpf, idade, dataNascimento, sexo, endereco, numero, bairro, cidade, estado, email);
		this.valorCupom = valorCupom;
		this.tipoCliente = tipoCliente;
	}


	public Double getValorCupom() {
		return valorCupom;
	}


	public void setValorCupom(Double valorCupom) {
		this.valorCupom = valorCupom;
	}


	public String getTipoCliente() {
		return tipoCliente;
	}


	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}


	@Override
	public String calcularIdade() {
		if (getIdade() >= 16 && getIdade() < 18) {
			return "Cliente poderá ter um cadastro desde que tenha Aprovação de um Responsavel...";
			
		}else if(getIdade() < 16) {
			return "Não poderá ter um ter um Cadastro devido a idade ser menor 16 anos...";
			
		}else {
			return "Cliente poderá ter um Cadastro sejeito a Consulta SPC...";
		}
	}


	@Override
	public String toString() {
		return super.toString() + "\nValor Cupom : " + valorCupom + ", Tipo Cliente: " + tipoCliente + "";
	}
	
	

}
