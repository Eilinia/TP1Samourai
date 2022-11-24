package personnages.principaux;

import personnages.Humain;

public class Yakuza  extends Humain{
	
	private String clan;
	private int reputation;

	public Yakuza(String nom, int argent, String boisson, String clan ) {
		super(nom, argent, boisson );
		this.clan = clan;
		this.reputation = 0;
	}
	

	public String getClan() {
		return clan;
	}

	public int getReputation() {
		return reputation;
	}


	public void extorquer(Commercant commercant) {
		int argent = commercant.seFaireExtorquer();
		gagnerArgent(argent);
		this.reputation += 1;
		parler("Je viens d'extorquer un commerçant ! Je suis riche !");
	}
	
	public void gagnerDuel() {
		this.reputation += 1;
		parler("J'ai gagné mon duel contre le ronin !");
	}

	public void perdreDuel() {
		int argent = getArgent();
		perdreArgent(argent);
		this.reputation -= 1;
		parler("J'ai perdu mon duel contre le ronin !");
	}
	
	public void direBonjour() {
		super.direBonjour();
		System.out.println("Je fais partie du clan " + this.clan + " !");
	}
}
