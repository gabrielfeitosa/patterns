package com.gabrielfeitosa.singleton;

import java.util.HashMap;
import java.util.Map;

public class Configuracao {

	private static Configuracao instancia;
	
	private Map<String,String> propriedades = new HashMap<String, String>();
	
	private Configuracao() {
		init();
	}
	
	private void init() {
		propriedades.put("smtp", "smtp.mail.com");
		propriedades.put("antena", "bla.cla.bla");
	}

	public static Configuracao getInstance(){
		if(Configuracao.instancia == null){
			Configuracao.instancia = new Configuracao();
		}
		return Configuracao.instancia;
	}
	
	
	
	public String getPropriedade(String chave){
		return this.propriedades.get(chave);
	}
}
