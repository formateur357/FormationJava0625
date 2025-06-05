package exercices.ex07_Professeur;

public class Specialite {
	
	/*------------- Attributs -------------*/ 
	private static int nextId = 0;
	
	private int code;
	private final int id;
	private String libelle;
	
	/*------------- Constructeurs -------------*/ 
	public Specialite(String libelle, int code) {
		this.libelle = libelle;
		this.code = (code >= 0) ? code : 0;
		this.id = Specialite.nextId++;
	}
	
	/*------------- Accesseurs -------------*/ 
	public int getId() { return this.id; }
	public int getCode() { return this.code; }
	public String getLibelle() { return this.libelle; }
	
	/*------------- Mutateurs -------------*/ 
	public void setLibelle(String libelle) { this.libelle = libelle; }
	public void setCode(int code) { this.code = (code >= 0) ? code : this.code; }
	
	/*------------- toString -------------*/
	@Override
	public String toString() {
		return String.format("Specialite #%d - Code : %d - Libelle : %s", id, code, libelle);
	}
}
