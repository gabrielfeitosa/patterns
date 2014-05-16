package com.gabrielfeitosa.teste;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.gabrielfeitosa.strategy.InsertionSorter;
import com.gabrielfeitosa.strategy.SelecitionSorter;
import com.gabrielfeitosa.strategy.Sorter;

public class SorterTest {

	@Test
	public void test() {
		Sorter sorter = new InsertionSorter();
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(20);
		list.add(1);
		list.add(3);
		List<Integer> listInsertionSorter = sorter.sort(list);
		for (Integer i : listInsertionSorter) {
			System.out.println(i);
		}
		System.out.println("\n");
		sorter = new SelecitionSorter();
		List<Integer> listSelectionSorter = sorter.sort(list);
		for (Integer i : listSelectionSorter) {
			System.out.println(i);
		}
	}
}
