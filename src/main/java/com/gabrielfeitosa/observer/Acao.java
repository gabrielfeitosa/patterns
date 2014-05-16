package com.gabrielfeitosa.observer;

import java.util.HashSet;
import java.util.Set;

public class Acao {

	private String codigo;
	private double valor;
	private Set<AcaoObserver> interessados = new HashSet<AcaoObserver>();
	
	
	public Acao(String codigo, double valor) {
		this.codigo = codigo;
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
		for (AcaoObserver observer : interessados) {
			observer.notificaAlteracao(this);
		}
	}
	public String getCodigo() {
		return codigo;
	}
	
	public void registrarInteressado(AcaoObserver interessado){
		interessados.add(interessado);
	}
	
	public void cancelarInteressa(AcaoObserver interessado){
		interessados.remove(interessado);
	}
	
}
