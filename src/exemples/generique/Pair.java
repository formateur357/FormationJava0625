package exemples.generique;

public record Pair<K, V> (
	K key,
	V value
) {}

// Pair<String, Integer> p = new Pair<>("Alice", 30);