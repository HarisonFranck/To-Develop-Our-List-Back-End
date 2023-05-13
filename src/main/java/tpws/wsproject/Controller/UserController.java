package tpws.wsproject.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tpws.wsproject.Entities.User;
import tpws.wsproject.Services.UserService;

@CrossOrigin
@RestController
public class UserController {

	
	@Autowired
	private UserService serv;
	
	
	public int generateId() {
		System.out.println("GENERATE");
		
		return serv.generatingId();
		
	}
	
	@GetMapping("/user/getAll")
	public Map<String,Object> getAllUser(){
		Map<String,Object> users = new HashMap<String,Object>();
		
		
		
		List<User> list = serv.getAll();
		
		users.put("users", list);
		return users;
	}
	
	
	@PostMapping("/user/createuser")
	public ResponseEntity<User> CreateUser(@RequestBody User user) {
		System.out.println("CREATION");
		String cnt = "User"+generateId();
		System.out.println("CNT: "+cnt);
		user.setIduser(cnt);
		System.out.println("user id: "+user.getIduser());
		serv.create(user);
		return ResponseEntity.ok(user);
	}
	
	@PostMapping("/user/finduser")
	public ResponseEntity<User> findUser(@RequestBody User user) {
		if((!user.getNom().isEmpty())||(!user.getPassword().isEmpty())) {
			User usr = serv.findUser(user.getNom(), user.getPassword());
			return ResponseEntity.ok(usr);
		}else {
			return null;
		}
	
	}
}
