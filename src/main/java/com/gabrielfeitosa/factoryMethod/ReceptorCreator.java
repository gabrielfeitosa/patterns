package com.gabrielfeitosa.factoryMethod;

import com.gabrielfeitosa.interfaces.Receptor;
import com.gabrielfeitosa.negocio.ReceptorEmail;
import com.gabrielfeitosa.negocio.ReceptorSMS;
import com.gabrielfeitosa.util.ReflexaoUtil;

public class ReceptorCreator {

	public static enum ReceptorEnum{
		
		SMS(ReceptorSMS.class),
		EMAIL(ReceptorEmail.class);
		
		private Class<?> clazz;

		private ReceptorEnum(Class<?> clazz){
			this.clazz = clazz;
		}

		public Receptor getReceptor(){
			return (Receptor) ReflexaoUtil.getNewInstance(clazz);
		}
	}
	
	public static Receptor create(ReceptorEnum tipo){
		if(tipo == null){
			throw new IllegalArgumentException("Tipo de receptor não suportado");
		}
		return tipo.getReceptor();
	}
}
