package tpws.wsproject.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tpws.wsproject.Entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	@Query(value="select * from users u where u.nom= :nom and u.password= :password",nativeQuery = true)
	User findUserByNomAndPassowrd(@Param("nom")String nom,@Param("password") String password);
	
	@Query(value="select nextval('user_id_seq')",nativeQuery=true)
	int generateId();
}
