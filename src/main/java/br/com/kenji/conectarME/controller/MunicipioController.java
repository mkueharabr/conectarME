package br.com.kenji.conectarME.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.kenji.conectarME.dao.MunicipioRepository;
import br.com.kenji.conectarME.model.Municipio;

@RestController
@CrossOrigin("*")
public class MunicipioController {
	@Autowired
	private MunicipioRepository municipioRepository;
	
	
	@GetMapping("/municipios")
	public ResponseEntity<List<Municipio>> getAll(){
		
		List<Municipio> municipios = municipioRepository.findAll();
		if(municipios.size() == 0) {
			return ResponseEntity.status(404).build();
		}
		
		return ResponseEntity.ok(municipios);
		
	}
	
	@GetMapping("/municipio/{uf}")
	public ResponseEntity<List<Municipio>> getMunicipioByUF(@PathVariable String uf){
		List<Municipio> municipios = municipioRepository.findAllByUf(uf);
		
		if(municipios.size() == 0) {
			return ResponseEntity.status(404).build();
		}
		
		return ResponseEntity.ok(municipios);
		
		
		
	}
	
	
	
	
}
