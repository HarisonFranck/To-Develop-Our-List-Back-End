package tpws.wsproject.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import tpws.wsproject.Entities.Tache;
import tpws.wsproject.Entities.UserTache;

public interface UserTacheRepository extends JpaRepository<UserTache, Integer>{

	@Query(value="select nextval('usertache_id_seq')",nativeQuery=true)
	int generateId();

	

}
