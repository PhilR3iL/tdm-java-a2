package fr.ecole3il.tdma2.exo33;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Cercle implements Comparable<Cercle>{
	private int x, y;
	double rayon;

	public Cercle(int x, int y, double rayon) {
		this.x = x;
		this.y = y;
		this.rayon = rayon;
	}

	public void affiche() {
		System.out.println("Coordonnées : " + x + ", " + y + " ;rayon : " + rayon);
	}

	public double getRayon() {
		return rayon;
	}

	public int getX() {
		return x;
	}
	
	/**********/
	public static void main(String[] args) {
		List<Cercle> liste = new ArrayList<>();
		liste.add(new Cercle(5, 0, 4));
		liste.add(new Cercle(2, 0, 1));
		liste.add(new Cercle(2, 0, 3));
		liste.add(new Cercle(6, 0, 2));
		liste.sort (null) ;

		for (Cercle c : liste)
			c.affiche();
	}

	@Override
	public int compareTo(Cercle o) {
		return Double.compare(rayon, o.rayon);
	}
}