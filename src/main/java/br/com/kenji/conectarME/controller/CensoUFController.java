package br.com.kenji.conectarME.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.kenji.conectarME.dao.CensoUFRepository;
import br.com.kenji.conectarME.model.CensoUF;

@RestController
@CrossOrigin("*")
public class CensoUFController {
	@Autowired
	private CensoUFRepository censoRepository;
	
	@GetMapping("/uf")
	public ResponseEntity<List<CensoUF>> getAll(){
		
		List<CensoUF> uf = censoRepository.findAll();
		
		if(uf.size() == 0) {
			return ResponseEntity.status(404).build();
		}
		
		return ResponseEntity.ok(uf);
		
	}
	
	
	@GetMapping("/uf/{id}")
	public ResponseEntity<CensoUF> getUF(@PathVariable String id){
		CensoUF uf =  censoRepository.findById(id).orElse(null);
		
		if(uf == null) {
			return ResponseEntity.status(404).build();
		}
		
		return ResponseEntity.ok(uf);
	}
	
	
}
