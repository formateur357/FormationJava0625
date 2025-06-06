package exemples.generique;

import java.util.List;

public interface DAO<T, ID> {
	T findByID(ID id);
	List<T> findAll();
	void save(T entity);
}   

// class PersonneDAO implements DAO<Personne, Long> { ... }
// class ProduitDAO implements DAO<Produit, String> { ... }