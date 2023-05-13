package tpws.wsproject.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tpws.wsproject.Entities.Priorite;
import tpws.wsproject.Repositories.PrioriteRepository;

@Service
public class PrioriteService {

	@Autowired
	private PrioriteRepository repo;
	
	public List<Priorite> getAll() {
		
		return repo.findAll();
	}
	
	public void savePriorite(Priorite prio) {
		repo.save(prio);
	}
	
	public Priorite findprioByid(String idprio) {
		return repo.findByIdPriorite(idprio);
	}
	
	public Priorite findprioByname(String name) {
		return repo.findByNomPriorite(name);
	}
	
	public int generateprio() {
		return repo.generateId();
	}
	
	
}
