package fr.ecole3il.tdma2.exo32;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Exercice {

	public static void main(String[] args) {
		List<Cercle> liste = new ArrayList<>();
		liste.add(new Cercle(5, 0, 4));
		liste.add(new Cercle(2, 0, 1));
		liste.add(new Cercle(2, 0, 3));
		liste.add(new Cercle(6, 0, 2));
		liste.sort(new Comparator<Cercle>() {
			@Override
			public int compare(Cercle o1, Cercle o2) {
				return Double.compare(o1.getRayon(), o2.getRayon());
			}
		});
		liste.sort(new Comparator<Cercle>() {

			@Override
			public int compare(Cercle o1, Cercle o2) {
				if (o1.getX() < o2.getX())
					return -1;
				else if (o1.getX() > o2.getX())
					return 1;
				return 0;
			}
		});
		for (Cercle c : liste)
			c.affiche();
	}

}
