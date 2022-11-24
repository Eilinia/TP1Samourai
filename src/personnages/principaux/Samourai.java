package personnages.principaux;

public class Samourai extends Ronin {

	protected String seigneur;
	
	public Samourai(String nom, String boisson, int argent, String seigneur) {
		super(nom, argent, boisson);
		this.seigneur = seigneur;
	}
	
	public void direBonjour() {
		super.direBonjour();
		System.out.println("Je sers le seigneur " + this.seigneur);
	}
	
	public void boire(String boisson) {
		parler("Mmm, un bon verre de " + boisson + " ! GLOUPS !");
	}

}
