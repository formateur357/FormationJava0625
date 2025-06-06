package exemples.interfaces;

public class OrderService {
	private final Notification notifier; // variable de type interface
	
	public OrderService(Notification notifier) { // parametre interface
		this.notifier = notifier;
	}
	
	public Notification getNotifier() { //  valeur de retour interface
		return notifier;
	}
	
	public void placeOrder(String msg) {
		notifier.send("Commande" + msg + " Confirmee !");
	}
	
}
