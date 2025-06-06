package exemples.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		Map<String, Integer> stocks = Map.of("Poire", 12, "Pomme", 5, "Kiwi", 0);
		List<String> enRupture = new ArrayList<>();
		
		stocks.get("Poire");
		
		for (Map.Entry<String, Integer> e : stocks.entrySet()) {
			if (e.getValue() == 0) {
				enRupture.add(e.getKey());
			}
		}
		
		// equivalent au for du dessus
		enRupture = stocks.entrySet().stream()
				.filter(e -> e.getValue() == 0)
				.map(Map.Entry::getKey)
				.toList();
		
		System.out.println(enRupture);

	}

}
