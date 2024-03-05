package fr.ecole3il.tdma2.exo22;

import java.util.Iterator;

public class Fibonacci implements Iterable<Integer> {

	int borne;
	
	public Fibonacci(int borne) {
		super();
		this.borne = borne;
	}

	@Override
	public Iterator<Integer> iterator() {
		return new FiboIterator(borne);
	}

	public static void main(String[] args) {
		for(Integer i : new Fibonacci(20))
			System.out.println(i);
	}
	
}
