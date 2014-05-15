package com.gabrielfeitosa.decorator;

import com.gabrielfeitosa.interfaces.Emissor;

public class EmissorDecoratorComCriptografia extends EmissorDecorator{

	public EmissorDecoratorComCriptografia(Emissor emissor) {
		super(emissor);
	}
	
	@Override
	public void enviar(String mensagem) {
		System.out.println("Enviando mensagem com criptografia");
		getEmissor().enviar(criptografa(mensagem));
		
	}

	private String criptografa(String mensagem) {
		return new StringBuilder(mensagem).reverse().toString();
	}

}
