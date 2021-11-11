package model;

import java.util.Date;

public abstract class Pessoa {
	private String nome;
	private String cpf;
	private Integer idade;
	private Date dataNascimento;
	private char sexo;
	private String endereco;
	private Integer numero;
	private String bairro;
	private String cidade;
	private String estado;
	private String email;
	
	public Pessoa() {
	
	}
	public Pessoa(String nome, String cpf, Integer idade, Date dataNascimento, char sexo, String endereco,
			Integer numero, String bairro, String cidade, String estado, String email) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.endereco = endereco;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public abstract String calcularIdade();

	@Override
	public String toString() {
		return "Nome: " + nome + ", CPF: " + cpf + ", Idade: " + idade + ", Data Nascimento: " + dataNascimento
				+ "\nSexo: " + sexo + ", Endereço: " + endereco + ", Numero: " + numero + ", Bairro: " + bairro
				+ "\nCidade: " + cidade + ", Estado: " + estado + ", E-mail: " + email + "";
	}
	
	
	
}
	
