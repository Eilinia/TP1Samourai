package personnages.principaux;

import personnages.Humain;

public class Ronin extends Humain{

	private int honneur;
	
	public Ronin(String nom, int argent, String boisson) {
		super(nom, argent, boisson);
		this.honneur = 1;
	}

	public void donner(int n, Commercant commercant) {
		parler("Tiens marchand ! Voilà " + n + " sous.");
		commercant.recevoir(n);
		
	}
	
	public void provoquer(Yakuza yakuza) {
		if(this.honneur * 2 > yakuza.getReputation()) {
			yakuza.perdreDuel();
			int argent = yakuza.getArgent();
			gagnerArgent(argent);
			this.honneur += 1;
			parler("J'ai gagné contre le yakuza ! ");
		} else {
			yakuza.gagnerDuel();
			this.honneur -= 1;
			parler("J'ai perdu contre le yakuza... ");
		}
	}
	
}
