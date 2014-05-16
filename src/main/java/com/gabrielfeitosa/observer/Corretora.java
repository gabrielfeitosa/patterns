package com.gabrielfeitosa.observer;

public class Corretora implements AcaoObserver{

	private String nome;
	
	
	public Corretora(String nome) {
		this.nome = nome;
	}

	@Override
	public void notificaAlteracao(Acao acao) {
		System.out.format("%s sendo notificada \n",nome);
		System.out.format("A ação %s teve o seu valor alterado para %s \n",acao.getCodigo(), acao.getValor());
	}

}
