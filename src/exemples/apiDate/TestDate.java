package exemples.apiDate;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestDate {

	public static void main(String[] args) {
		LocalDate naissance = LocalDate.of(1994, 1, 23);
		LocalDate aujourdhui = LocalDate.now();
		
		Period age = Period.between(naissance, aujourdhui);
		System.out.printf("Age : %d ans %d mois%n", age.getYears(), age.getMonths());
		
		LocalDate dans100j = aujourdhui.plusDays(100);
		System.out.println("Dans 100 jours : " + dans100j);
		
		ZonedDateTime paris = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		ZonedDateTime tokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
		
		System.out.println("Heure a Paris : " + paris.getHour());
		System.out.println("Heure a Tokyo : " + tokyo.getHour());

		Instant depart = Instant.now();
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}                 // 2,5 s
		Instant fin = Instant.now();

		Duration ecoule = Duration.between(depart, fin);
		System.out.println("Écoulé : " + ecoule.toMillis() + " ms");

	}

}
