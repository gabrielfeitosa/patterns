package com.gabrielfeitosa.prototype;

import java.util.Calendar;

public class Produto implements Prototype<Produto> {

	private String nome;
	private Calendar dataValidade;
	
	public Produto(String nome, Calendar dataValidade) {
		this.nome = nome;
		this.dataValidade = dataValidade;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Calendar getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(Calendar dataValidade) {
		this.dataValidade = dataValidade;
	}

	@Override
	public Produto criarCopia() {
		return new Produto("Cópia "+this.nome, (Calendar)this.dataValidade.clone());
	}
}
