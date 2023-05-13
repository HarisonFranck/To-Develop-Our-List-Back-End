package tpws.wsproject.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tpws.wsproject.Entities.User;
import tpws.wsproject.Repositories.UserRepository;

@Service
public class UserService {

	

	@Autowired
	private UserRepository repo;
	
	
	public List<User> getAll(){
		return repo.findAll();
	}
	
	public User findUser(String nom,String passowrd) {
		return repo.findUserByNomAndPassowrd(nom, passowrd);
	}
	
	public void create(User user) {
		repo.save(user);
	}
	
	public int generatingId() {
		return repo.generateId();
	}
}
