package tpws.wsproject.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tpws.wsproject.Entities.Tache;
import tpws.wsproject.Repositories.TacheRepository;

@Service
public class TacheService {

	@Autowired
	private TacheRepository repo;
	
	public List<Tache> getAll(){
		return repo.listTache();
	}
	
	public int generatingId() {
		return repo.generateId();
	}
	
	public List<Tache> getAllByiduser(String iduser){
		return repo.FindTacheByIduser(iduser);
	}
	
	
	public void save(Tache task) {
		repo.save(task);
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}
	
	public Tache get(int id) {
		return repo.findById(id).get();
	}
	
}
