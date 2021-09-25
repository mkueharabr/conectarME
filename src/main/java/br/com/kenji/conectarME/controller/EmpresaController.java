package br.com.kenji.conectarME.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.kenji.conectarME.dao.EmpresaRepository;
import br.com.kenji.conectarME.model.Empresa;

@RestController
public class EmpresaController {
	@Autowired
	private EmpresaRepository empresaRepository;

	
	@GetMapping("/empresas")
	public ResponseEntity<List<Empresa>> getAllEmpresas(){
		List<Empresa> empresas = empresaRepository.findAll();
		if(empresas.size()==0) {
			return ResponseEntity.status(404).build();
		}
		
		return ResponseEntity.ok(empresas);
	}
	
	@GetMapping("/empresa/{id}")
	public ResponseEntity<Empresa> getEmpresaId(@PathVariable int id){
		Empresa empresa = empresaRepository.findById(id).orElse(null);
		if(empresa == null) {
			return ResponseEntity.status(404).build();
		}
		
		return ResponseEntity.ok(empresa);
	}
	
	
	@PostMapping("/novaEmpresa")
	public ResponseEntity<Empresa> addEmpresa(@RequestBody Empresa empresa){
		try {
			if(empresa.getId() != 0) {
				boolean exists = empresaRepository.existsById(empresa.getId());   
				if(!exists) {
					return ResponseEntity.status(404).build();
				}
			}
			empresaRepository.save(empresa);
			
			
			return ResponseEntity.ok(empresa);
			
		} catch(Exception ex) {
			ex.printStackTrace();
			return ResponseEntity.status(403).build();
		}
	}
}
