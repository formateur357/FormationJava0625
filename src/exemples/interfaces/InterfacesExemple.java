package exemples.interfaces;

import java.util.List;

public class InterfacesExemple {
	
	public static void main(String[] args) {
		
		Notification email = new EmailNotification();
//		Notification slack = new SlackNotification();

		OrderService service = new OrderService(email);
		service.placeOrder("A123");
		
		service = new OrderService(new SmsNotification());
		service.placeOrder("B456");
		
		List<Notification> canalMulti = List.of(new SmsNotification(), new EmailNotification(), new SlackNotification());
		
		for (Notification n : canalMulti) {
			n.send("Promo -20%");
		}
		
		Notification[] tableau = new Notification[2];
		tableau[0] = new SmsNotification();
		tableau[1] = service.getNotifier();
		
		Object brut = new EmailNotification();
//		brut.a = 2;  // erreur
//		brut.send("Message via cast"); // -> erreur
		Notification cast = (Notification) brut;
		cast.send("Message via cast");
	}

}
