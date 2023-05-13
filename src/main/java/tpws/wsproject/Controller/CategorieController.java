package tpws.wsproject.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tpws.wsproject.Entities.Categorie;
import tpws.wsproject.Services.CategorieService;

@CrossOrigin("*")
@RestController
public class CategorieController {

	@Autowired
	private CategorieService serv;
	
	
	public int generateID() {
		return serv.generatingId();
	}
	
	@GetMapping("/categorie/getAllcategorie")
	public Map<String, Object> getAll() {
		List<Categorie> list = serv.getAllCategorie();
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("categories", list);
		return data;
		
		
	}
	@PostMapping("/categorie/savecategorie")
	public ResponseEntity<Categorie> saveCategorie(@RequestBody Categorie cat) {
		String idcat = "Cat"+generateID();
		cat.setIdcategorie(idcat);
		serv.saveCategorie(cat);
		
		return ResponseEntity.ok(cat);
	}
	
	@GetMapping("/categorie/findbyid/{idcat}")
	public ResponseEntity<Categorie> findCat(@PathVariable String idcat){
		Categorie cat = serv.findbyId(idcat);
		return ResponseEntity.ok(cat);
	}
	
	@GetMapping("/categorie/findbynom/{nomcat}")
	public ResponseEntity<Categorie> findCatBynom(@PathVariable String nomcat){
		Categorie cat = serv.findbyName(nomcat);
		return ResponseEntity.ok(cat);
	}
}
