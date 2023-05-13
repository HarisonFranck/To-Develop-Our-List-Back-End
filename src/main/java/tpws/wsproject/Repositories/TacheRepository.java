package tpws.wsproject.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tpws.wsproject.Entities.Tache;

@Repository
public interface TacheRepository extends JpaRepository<Tache, Integer>{
	
	@Query(value="SELECT*FROM vtache",nativeQuery = true)
	List<Tache> listTache();
	
	@Query(value="SELECT*FROM vusertache vs where vs.iduser= :iduser",nativeQuery = true)
	List<Tache> FindTacheByIduser(@Param("iduser")String iduser);

	@Query(value="select nextval('tache_id_seq')",nativeQuery=true)
	int generateId();

}
