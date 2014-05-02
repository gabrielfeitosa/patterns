package com.gabrielfeitosa.abstractFactory;

import com.gabrielfeitosa.factoryMethod.EmissorCreator;
import com.gabrielfeitosa.factoryMethod.ReceptorCreator;
import com.gabrielfeitosa.interfaces.ComunidadorFactory;
import com.gabrielfeitosa.interfaces.Emissor;
import com.gabrielfeitosa.interfaces.Receptor;

public class EMAILComunicadorFactory implements ComunidadorFactory{

	@Override
	public Emissor createEmissor() {
		return EmissorCreator.create(EmissorCreator.EmissorEnum.EMAIL);
	}

	@Override
	public Receptor createReceptor() {
		return ReceptorCreator.create(ReceptorCreator.ReceptorEnum.EMAIL);
	}

}
