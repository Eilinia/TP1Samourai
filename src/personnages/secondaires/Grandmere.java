package personnages.secondaires;

import java.util.Random;

import personnages.Humain;
import personnages.principaux.*;

public class Grandmere extends Humain {

	private Humain[] memoire = new Humain[30];
	
	public Grandmere(String nom, int argent) {
		super(nom, argent, "tisane");
		
	}
	
	public String humainHasard() {
		Random random = new Random();
		int nb;
		nb = random.nextInt(5);
		switch(nb) {
			case 1 :
				return "Ronin";
			case 2 :
				return "Commercant";
			case 3 :
				return "Yakuza";
			case 4 :
				return "Samourai";
			default :
				return "null";
		}
	}
	
	public void faireConnaissanceAvec(Humain humain) {
		int j = 0;
		for(int i = 0; i < memoire.length; i++) {
			
		}
	}

}
