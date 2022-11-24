package personnages.secondaires;

import personnages.Humain;
import personnages.principaux.*;

public class Traitre extends Samourai {

	private int niveauTraitrise;
	
	public Traitre(String nom, String boisson, int argent, String seigneur) {
		super(nom, boisson, argent, seigneur);
	}
	
	public void extorquer(Commercant commercant) {
		if (this.niveauTraitrise == 3) {
			parler("Je ne peux pas extorquer ce commercant... Il faut que je me fasse oublier");
		} else {
			int argent = commercant.seFaireExtorquer();
			gagnerArgent(argent);
			this.niveauTraitrise += 1;
			parler("Je viens d'extorquer un commerçant ! Je suis riche !");
		}
	}
	
	public void direBonjour() {
		super.direBonjour();
		System.out.println("Je sers le seigneur " + this.seigneur + ". Mon niveau de traitise est de " + this.niveauTraitrise);
	}

	public void faireLeGentil(Humain humain, int argent) {
		humain.gagnerArgent(argent);
		parler("Tenez humain ! Je suis ici en tant qu'ami !");
		int i = argent / 10;
		if (i > this.niveauTraitrise) {
			this.niveauTraitrise = 0;
		} else {
			this.niveauTraitrise -= i;
		}
	}
	
}
