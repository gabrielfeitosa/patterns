package com.gabrielfeitosa.util;

public final class ReflexaoUtil {

	private ReflexaoUtil(){}
	
	public static Object getNewInstance(Class<?> clazz){
		try {
			return clazz.newInstance();
		} catch (Exception e) {
			throw new IllegalArgumentException("Não foi possível realizar a instância da classe: "+clazz);
		}
		
	}
}