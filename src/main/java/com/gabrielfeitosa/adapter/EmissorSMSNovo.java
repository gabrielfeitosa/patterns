package com.gabrielfeitosa.adapter;

public class EmissorSMSNovo {

	public void enviar(String mensagem,boolean avisoEnvio){
		System.out.format("Enviando: %s \n",mensagem);
		System.out.format("Avisar quando enviado? %s", avisoEnvio?"Sim":"Não");
	}
}
