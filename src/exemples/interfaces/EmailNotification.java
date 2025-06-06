package exemples.interfaces;

public class EmailNotification implements Notification {
	public int a;
	
	public EmailNotification() {
		this.a = 1;
	}
	
	@Override  public void send(String message) {
		System.out.println("Mail Envoye : " + message);
	}
}
