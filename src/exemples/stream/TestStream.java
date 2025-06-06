package exemples.stream;

import java.util.List;

public class TestStream {

	public static void main(String[] args) {
		List<String> mots = List.of("avion", "bateau", "auto", "velo");

		List<String> motsCourts = mots.stream()
				.filter(m -> m.length() <= 4)
				.toList();
		
		System.out.println(motsCourts);
	}

}
