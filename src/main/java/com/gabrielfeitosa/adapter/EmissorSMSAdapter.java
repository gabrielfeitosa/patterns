package com.gabrielfeitosa.adapter;

import com.gabrielfeitosa.negocio.EmissorSMS;

public class EmissorSMSAdapter extends EmissorSMS{

	private EmissorSMSNovo emissor;
	
	public EmissorSMSAdapter() {
		emissor = new EmissorSMSNovo();
	}
	
	@Override
	public void enviar(String mensagem) {
		emissor.enviar(mensagem, false);
	}
}
