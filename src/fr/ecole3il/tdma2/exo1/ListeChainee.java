package fr.ecole3il.tdma2.exo1;

public class ListeChainee<S> {

	class Noeud<W> {
		private W element;
		private Noeud<W> suivant;

		public Noeud(W element, Noeud<W> suivant) {
			super();
			this.element = element;
			this.suivant = suivant;
		}

		public W getElement() {
			return element;
		}

		public Noeud<W> getSuivant() {
			return suivant;
		}

		public void setSuivant(Noeud<W> suivant) {
			this.suivant = suivant;
		}
		
		
	}

	Noeud<S> tete;
	
	public ListeChainee(){
		tete = new Noeud<S>(null, null);
	}

	int taille = 0;
	
	public int taille() {
		return taille;
	}
	
	public void ajouter(S element) {
		Noeud<S> courant = tete;
		while( courant.getSuivant() != null) {
			courant = courant.getSuivant();
		}
		courant.setSuivant(new Noeud<S>(element, null));
		taille ++;
	}
	
	public S get(int index) {
		int indexCourant = 0;
		Noeud<S> courant = tete;
		while( indexCourant++ != index)
			courant = courant.getSuivant();
		return courant.getElement();
	}

}
