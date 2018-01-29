
public class Main {

	public static void main(String[] args) {
		
		String[] competences = new String[2];
		competences[0] = "Programmation Java";
		competences[1] = "Programmation VB.Net";
		CV fred = new CV("England", "Frédéric", "DEC en informatique de Gestion", 2, competences, "Aucunes");
		
		String[] comp = new String[1];
		comp[0] = "Programmation Java";
		CV arthur = new CV ("Lebel", "Arthur", "DEC en Informatique de Gestion", 1, comp, "Apprendre");
		
		System.out.println("Bienvenue chez Barette !");
		fred.affiche();

	}

}
