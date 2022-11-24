package personnages.principaux;

public class main {

	public static void main(String[] args) {
		Ronin musaichi = new Samourai("Akimoto" , "the" , 20, "Miyamoto");
		musaichi.direBonjour();
		Samourai musaihi = (Samourai) musaichi;
		musaihi.boire("Saké");
		musaihi.boire();
	}

}
