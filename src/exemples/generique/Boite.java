package exemples.generique;

public class Boite<T> { // T = type parametrique
	
	private T contenu;
	
	public void set(T valeur) { contenu = valeur; }
	public T get() { return contenu; } // plus besoin de cast
}
