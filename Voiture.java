
public class Voiture {
	private int roue = 0;
	private int moteur = 0;
	public Voiture(int roue , int moteur) {
		this.roue = roue;
		this.moteur = moteur;
		}
	Voiture(){}
	public static void main(String[] args) {
	Voiture audi = new Voiture();
	Voiture benzz = new Voiture(5,42);
	audi.moteur=6;
	
	System.out.println(audi.moteur);
	System.out.println(benzz.moteur);
	
	}

}
