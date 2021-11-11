package model;

import java.util.Date;

public class Funcionario extends Pessoa{
	private Integer anoAdmissao;
	private String numeroCtps;
	private Double salario;
	private String cargo;
	
	
	
	public Funcionario(String nome, String cpf, Integer idade, Date dataNascimento, char sexo, String endereco,
			Integer numero, String bairro, String cidade, String estado, String email, Integer anoAdmissao,
			String numeroCtps, Double salario, String cargo) {
		super(nome, cpf, idade, dataNascimento, sexo, endereco, numero, bairro, cidade, estado, email);
		this.anoAdmissao = anoAdmissao;
		this.numeroCtps = numeroCtps;
		this.salario = salario;
		this.cargo = cargo;
	}


	public Funcionario() {
		
	}


	public Integer getAnoAdmissao() {
		return anoAdmissao;
	}


	public void setAnoAdmissao(Integer anoAdmissao) {
		this.anoAdmissao = anoAdmissao;
	}


	public String getNumeroCtps() {
		return numeroCtps;
	}


	public void setNumeroCtps(String numeroCtps) {
		this.numeroCtps = numeroCtps;
	}


	public Double getSalario() {
		return salario;
	}


	public void setSalario(Double salario) {
		this.salario = salario;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}



	@Override
	public String calcularIdade() {
		if (getIdade() >= 16 && getIdade() < 18) {
			return "Colaborador poderá ser vinculado a empresa como Menor Aprendiz...";
			
		}else if(getIdade() < 16) {
			return "Não poderá ter um vinculo à Empresa";
			
		}else {
			return "Colaborador poderá ser vinculado a empresa com Contrato Efetivo...";
		}
	}



	@Override
	public String toString() {
		return super.toString() + "\nAno de Admissão: " + anoAdmissao + " Numero da CTPS: " + numeroCtps + " \nSalário: " + salario
				+ " Cargo: " + cargo + "";
	}
	
	

}
