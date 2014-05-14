package com.gabrielfeitosa.pool;

import java.util.ArrayList;
import java.util.List;

import com.gabrielfeitosa.negocio.SMSMensagem;

public class SMSPool implements Pool<SMSMensagem>{

	private List<SMSMensagem> mensagens;
	
	public SMSPool() {
		this.mensagens = new ArrayList<SMSMensagem>();
		for (int i = 0; i < 10; i++) {
			this.mensagens.add(new SMSMensagem("Mensagem "+i, String.valueOf(i)));
		}
	}
	
	@Override
	public SMSMensagem remover() {
		if(!mensagens.isEmpty()){
			return mensagens.remove(0);
		}
		return null;
	}

	@Override
	public void adicionar(SMSMensagem t) {
		mensagens.add(t);
	}

}
