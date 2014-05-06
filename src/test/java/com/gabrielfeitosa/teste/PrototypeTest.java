package com.gabrielfeitosa.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Calendar;

import org.junit.Test;

import com.gabrielfeitosa.prototype.Produto;

public class PrototypeTest {


	@Test
	public void criandoCopiaDoProduto() {
		String nome = "Arroz";
		Calendar validade =  Calendar.getInstance();
		validade.set(2014, Calendar.JANUARY, 1);
		Produto p = new Produto(nome, validade);
		Produto clone = p.criarCopia();
		assertTrue(p.getDataValidade().compareTo(clone.getDataValidade()) ==0);
		assertEquals(p.getDataValidade(), clone.getDataValidade());
		p.setDataValidade(Calendar.getInstance());
		assertTrue(p.getDataValidade().compareTo(clone.getDataValidade()) > 0);
	}

}
