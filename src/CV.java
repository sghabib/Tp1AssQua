
public class CV {
	
	private String nom;
	private String prenom;
	private String formation;
	private int expTravail;
	private String[] competences;
	private String attentes;
	
	public CV ( String nom, String prenom, String formation, int expTravail, String[] competences, String attentes ) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.formation = formation;
		this.expTravail = expTravail;
		this.competences = competences;
		this.attentes = attentes;
		
	}
	
	public void affiche() {
		
		System.out.println("Nom : " + nom);
		System.out.println("Prenom : " + prenom);
		System.out.println("Formation : " + formation);
		System.out.println("Expériences de travail : " + expTravail);
		System.out.println("Compétences : ");
		
		for (String string : competences) {
			System.out.println("	" + string);
		}
		
		System.out.println("Attentes vis à vis le cours 4B4 : " + attentes);
		
	}
	
}
