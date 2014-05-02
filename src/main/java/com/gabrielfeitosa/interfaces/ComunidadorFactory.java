package com.gabrielfeitosa.interfaces;

public interface ComunidadorFactory {

	Emissor createEmissor();
	Receptor createReceptor();
}
