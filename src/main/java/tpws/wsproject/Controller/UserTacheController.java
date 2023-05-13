package tpws.wsproject.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import tpws.wsproject.Entities.UserTache;
import tpws.wsproject.Services.UserTacheService;

@CrossOrigin("*")
@RestController
public class UserTacheController {

	
	@Autowired
	private UserTacheService serv;
	
	public int generateId() {
		return serv.generateId();
	}
	
	@GetMapping("/usertache/getAll")
	public Map<String, Object> getAll(){
		Map<String, Object> uts = new HashMap<String, Object>();
		List<UserTache> list = serv.getAll();
		uts.put("usertaches", list);
		
		return uts;
	}
	
	@GetMapping("/usertache/saveus")
	public ResponseEntity<UserTache> saveus(@RequestBody UserTache ut){
	
		String id = "usertache"+generateId();
		ut.setIdusertache(id);
		serv.saveUT(ut);
		
		return ResponseEntity.ok(ut);
		
	}
	
	
	
}
