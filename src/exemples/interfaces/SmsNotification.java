package exemples.interfaces;

public class SmsNotification implements Notification {
	@Override  public void send(String message) {
		System.out.println("SMS Envoye : " + message);
	}
}
