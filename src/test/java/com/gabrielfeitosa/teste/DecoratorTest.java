package com.gabrielfeitosa.teste;

import org.junit.Test;

import com.gabrielfeitosa.decorator.EmissorDecoratorComCompressao;
import com.gabrielfeitosa.decorator.EmissorDecoratorComCriptografia;
import com.gabrielfeitosa.interfaces.Emissor;
import com.gabrielfeitosa.negocio.EmissorBasico;

public class DecoratorTest {

	@Test
	public void test() {
		String mensagem = "Oi6456456456";
		Emissor emissorCript = new EmissorDecoratorComCriptografia(new EmissorBasico());
		emissorCript.enviar(mensagem);
		Emissor emissorCompr = new EmissorDecoratorComCompressao(new EmissorBasico());
		emissorCompr.enviar(mensagem);
		Emissor emissorCriptCompr = new EmissorDecoratorComCriptografia(new EmissorDecoratorComCompressao(new EmissorBasico()));
		emissorCriptCompr.enviar(mensagem);
	}
}
