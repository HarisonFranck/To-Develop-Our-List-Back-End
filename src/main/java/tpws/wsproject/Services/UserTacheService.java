package tpws.wsproject.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tpws.wsproject.Entities.Tache;
import tpws.wsproject.Entities.UserTache;
import tpws.wsproject.Repositories.UserTacheRepository;

@Service
public class UserTacheService {

	@Autowired
	private UserTacheRepository repo;
	
	public void saveUT(UserTache ut) {
		repo.save(ut);
	}
	
	public List<UserTache> getAll(){
		return repo.findAll();
	}

	public int generateId() {
		return repo.generateId();
	}

	
}
