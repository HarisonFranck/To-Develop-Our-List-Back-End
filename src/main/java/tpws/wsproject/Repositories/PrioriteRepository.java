package tpws.wsproject.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tpws.wsproject.Entities.Priorite;


public interface PrioriteRepository extends JpaRepository<Priorite, Integer>{

	
	@Query(value="select*from priorite p where p.idpriorite= :idpriorite",nativeQuery=true)
	Priorite findByIdPriorite(@Param("idpriorite") String idpriorite);
	
	@Query(value="select nextval('prio_id_seq')",nativeQuery=true)
	int generateId();
	
	
	@Query(value="select*from priorite p where p.nompriorite= :nompriorite",nativeQuery=true)
	Priorite findByNomPriorite(@Param("nompriorite")String nompriorite);
	
}
