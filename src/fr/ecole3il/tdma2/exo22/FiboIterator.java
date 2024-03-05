package fr.ecole3il.tdma2.exo22;

import java.util.Iterator;

public class FiboIterator implements Iterator<Integer> {
	int n;
	int n1;
	int rangActuel;
	int borne;
	
	public FiboIterator(int borne) {
		super();
		this.borne = borne;
		n = 0;
		n1 = 1;
		rangActuel = 0;
	}

	@Override
	public boolean hasNext() {
		return rangActuel < borne;
	}

	@Override
	public Integer next() {
		int n2 = n1 + n;
		int ret = n;
		n = n1;
		n1 = n2;
		rangActuel ++;
		return ret;
	}
	
	public static void main(String[] args) {
		FiboIterator fibo = new FiboIterator(10);
		while(fibo.hasNext())
			System.out.println(fibo.next());
	}

}
