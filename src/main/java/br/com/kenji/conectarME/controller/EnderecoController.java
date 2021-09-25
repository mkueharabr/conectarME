package br.com.kenji.conectarME.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.kenji.conectarME.dao.EnderecoRepository;
import br.com.kenji.conectarME.model.Endereco;

@RestController
public class EnderecoController {
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	
	@GetMapping("/enderecos")
	public ResponseEntity<List<Endereco>> getEnderecos(){
		List<Endereco> enderecos = enderecoRepository.findAll();
		if(enderecos.size() == 0) {
			return ResponseEntity.status(404).build();
		}
		
		return ResponseEntity.ok(enderecos);
		
	}
	
	
	@GetMapping("/endereco/{id}")
	public ResponseEntity<Endereco> getEnderecoId(@PathVariable int id){
		Endereco endereco = enderecoRepository.findById(id).orElse(null);
		if(endereco == null) {
			return ResponseEntity.status(404).build();
		}
		
		return ResponseEntity.ok(endereco);
		
	}
	
	
	@PostMapping("/novoEndereco")
	public ResponseEntity<Endereco> addEndereco(@RequestBody Endereco endereco){
		try {
			if(endereco.getId() != 0) {
				boolean exists = enderecoRepository.existsById(endereco.getId());   
				if(!exists) {
					return ResponseEntity.status(404).build();
				}
			}
			enderecoRepository.save(endereco);
			
			
			return ResponseEntity.ok(endereco);
			
		} catch(Exception ex) {
			ex.printStackTrace();
			return ResponseEntity.status(403).build();
		}
	}
}
