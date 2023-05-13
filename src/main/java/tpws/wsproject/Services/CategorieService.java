package tpws.wsproject.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tpws.wsproject.Entities.Categorie;
import tpws.wsproject.Repositories.CategorieRepository;

@Service
public class CategorieService {

	@Autowired
	private CategorieRepository repo;
	
	public List<Categorie> getAllCategorie() {
		return repo.findAll();
	}
	
	public void saveCategorie(Categorie cat) {
		repo.save(cat);
	}
	
	public Categorie findbyId(String id) {
		return repo.findByIdCategorie(id);
	}
	
	
	public Categorie findbyName(String name) {
		return repo.findByNomCategorie(name);
	}
	
	public int generatingId() {
		return repo.generateId();
	}
	
	
}
