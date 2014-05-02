package com.gabrielfeitosa.factoryMethod;

import com.gabrielfeitosa.interfaces.Emissor;
import com.gabrielfeitosa.negocio.EmissorEmail;
import com.gabrielfeitosa.negocio.EmissorSMS;
import com.gabrielfeitosa.util.ReflexaoUtil;

public class EmissorCreator {

	public static enum EmissorEnum{
		
		SMS(EmissorSMS.class),
		EMAIL(EmissorEmail.class);
		
		private Class<?> clazz;

		private EmissorEnum(Class<?> clazz){
			this.clazz = clazz;
		}

		public Emissor getEmissor(){
			return (Emissor) ReflexaoUtil.getNewInstance(clazz);
		}
	}
	
	public static Emissor create(EmissorEnum tipo){
		if(tipo == null){
			throw new IllegalArgumentException("Tipo de emissor não suportado");
		}
		return tipo.getEmissor();
	}
}
