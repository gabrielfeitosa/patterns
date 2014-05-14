package com.gabrielfeitosa.pool;

public interface Pool<T> {

	T remover();
	void adicionar(T t);
}
