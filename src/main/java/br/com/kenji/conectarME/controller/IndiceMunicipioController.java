package br.com.kenji.conectarME.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.kenji.conectarME.dao.IndiceMunicipioRepository;
import br.com.kenji.conectarME.model.IndiceMunicipio;

@RestController
@CrossOrigin("*")
public class IndiceMunicipioController {

	@Autowired
	private IndiceMunicipioRepository indiceRepository;
	
	@GetMapping("/indiceMunicipio")
	public ResponseEntity<List<IndiceMunicipio>> getAll(){
		
		List<IndiceMunicipio> indices = indiceRepository.findAll();
		
		if(indices.size() == 0) {
			return ResponseEntity.status(404).build();
		}
		
		return ResponseEntity.ok(indices);
		
	}
	
	
	@GetMapping("/indiceMunicipio/{id}")
	public ResponseEntity<IndiceMunicipio> getUsuario(@PathVariable int id){
		IndiceMunicipio municipio =  indiceRepository.findById(id).orElse(null);
		
		if(municipio == null) {
			return ResponseEntity.status(404).build();
		}
		
		return ResponseEntity.ok(municipio);
	}
	
	
	
	
	
}
