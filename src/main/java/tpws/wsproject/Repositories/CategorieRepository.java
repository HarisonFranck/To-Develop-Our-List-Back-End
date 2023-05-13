package tpws.wsproject.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tpws.wsproject.Entities.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Integer>{

	
	@Query(value="select*from categorie c where idcategorie= :idcategorie",nativeQuery=true)
	Categorie findByIdCategorie(@Param("idcategorie") String idcategorie);
	
	
	@Query(value="select*from categorie c where nomcategorie= :nomcategorie",nativeQuery=true)
	Categorie findByNomCategorie(@Param("nomcategorie") String nomcategorie);
	
	
	@Query(value="select nextval('cat_id_seq')",nativeQuery=true)
	int generateId();
}
