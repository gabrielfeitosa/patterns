package com.gabrielfeitosa.decorator;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

import com.gabrielfeitosa.interfaces.Emissor;

public class EmissorDecoratorComCompressao extends EmissorDecorator {

	public EmissorDecoratorComCompressao(Emissor emissor) {
		super(emissor);
	}

	@Override
	public void enviar(String mensagem) {
		System.out.println("Enviando mensagem comprimida");
		String mensagemComprimida;
		try {
			mensagemComprimida = comprime(mensagem);
		} catch (IOException e) {
			mensagemComprimida = mensagem;
		}
		getEmissor().enviar(mensagemComprimida);

	}

	private String comprime(String mensagem) throws IOException {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		DeflaterOutputStream dout = new DeflaterOutputStream(out,new Deflater());
		dout.write(mensagem.getBytes());
		dout.close();
		return new String(out.toByteArray());

	}

}
