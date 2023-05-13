package tpws.wsproject.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tpws.wsproject.Entities.Tache;
import tpws.wsproject.Services.TacheService;

@CrossOrigin("*")
@RestController
public class TacheController {

	
	@Autowired
	private TacheService serv; 
	
	
	public int generateID() {
		return serv.generatingId();
	}
	
	@GetMapping("/task/getall")
	Map<String,Object> getAll(){
		Map<String,Object> data = new HashMap<String, Object>();
		List<Tache> list = serv.getAll();
		
		data.put("taches", list); 
		return data;
	}
	
	public String[][] splitRepetition(List<Tache> list){
		
		 String[][] splitedlist = new String[list.size()][];
		 
		 for(int i=0;i<list.size();i++) {
			 splitedlist[i] = list.get(i).getRepetition().split("-");
			 System.out.println("Splited list["+i+"]: "+splitedlist[i][2]);
			 for(int a=0;a<splitedlist[i].length;a++) {
				 System.out.println("Split["+a+"]: "+splitedlist[i][a]);
			 }
		 }
		 return splitedlist;
		 
	}
	
	@GetMapping("/task/getallbyiduser/{iduser}")
	Map<String,Object> getAllByIduser(@PathVariable String iduser){
		Map<String,Object> data = new HashMap<String, Object>();
		List<Tache> list = serv.getAllByiduser(iduser);
		splitRepetition(list);
		data.put("taches", list); 
		return data;
	}
	
	@PostMapping("/task/addtask")
	void save(@RequestBody Tache task) {
		String id = "Tache"+generateID();
		task.setIdTache(id);
		serv.save(task);
	}
	
	@DeleteMapping("/task/deletebyid/{idtask}")
	void delete(@PathVariable int idtask) {
		serv.delete(idtask);
	}
	
	@PutMapping("/task/updatetask/{idtask}")
	ResponseEntity<Tache> update(@PathVariable int idtask,Tache task) {
		
		Tache oldertask = serv.get(idtask);
		oldertask.setNomTache(task.getNomTache());
		oldertask.setPriorite(task.getPriorite());
		oldertask.setCategorie(task.getCategorie());
		oldertask.setDecalage(task.getDecalage());
		oldertask.setDate(task.getDate());
		oldertask.setDuree(task.getDuree());
		oldertask.setDone(task.isDone());
		
		return ResponseEntity.ok(oldertask);
		
	}
}
