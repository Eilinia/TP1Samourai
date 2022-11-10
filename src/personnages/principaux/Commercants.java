package personnages.principaux;

import personnages.Humain;

public class Commercants extends Humain{

	public Commercants(String nom, int argent) {
		super(nom, argent, "thé");
		
	}
	
	public int seFaireExtorquer() {
		int n = this.getArgent();
		perdreArgent(n);
		parler("J'ai tout perdu ! Le monde est injuste !");
		return n;
	}
	
	public void recevoir (int n) {
		gagnerArgent(n);
		parler("Je te remercie, généreux donateur !");
	}

}
