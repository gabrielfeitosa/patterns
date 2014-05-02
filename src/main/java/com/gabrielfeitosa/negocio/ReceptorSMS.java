package com.gabrielfeitosa.negocio;

import com.gabrielfeitosa.interfaces.Receptor;

public class ReceptorSMS implements Receptor{

	@Override
	public String recebe() {
		System.out.println("Recebendo mensagem do SMS.");
		return "Mensagem de retorno do SMS.";
	}

}
