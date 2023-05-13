package tpws.wsproject.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tpws.wsproject.Entities.Priorite;
import tpws.wsproject.Services.PrioriteService;

@RestController
@CrossOrigin("*")
public class PrioriteController {

	@Autowired
	private PrioriteService serv;
	
	
	public int generateSequence() {
		return serv.generateprio();
	}
	
	
	@GetMapping("/priorite/getAll")
	public Map<String, Object> getAll(){
		
		Map<String, Object> priorites = new HashMap<String, Object>();
		List<Priorite> list = serv.getAll();
		priorites.put("priorites", list);
		
		return priorites;
		
	}
	
	@PostMapping("/priorite/savepriorite")
	public ResponseEntity<Priorite> saveprio(@RequestBody Priorite p){
		
		String idprio = "prio"+generateSequence();
		
		p.setIdpriorite(idprio);
		
		serv.savePriorite(p);
		
		return ResponseEntity.ok(p);
	}
	
	@GetMapping("/priorite/findpriobyid/{idpriorite}")
	public Priorite findByIdPrio(@PathVariable String idpriorite) {
		return serv.findprioByid(idpriorite);
	}
	
	
	@GetMapping("/priorite/findpriobynom/{nompriorite}")
	public Priorite findByNomPrio(@PathVariable String nompriorite) {
		return serv.findprioByname(nompriorite);
	}
}
