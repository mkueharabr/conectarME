package br.com.kenji.conectarME.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.kenji.conectarME.dao.UsuarioRepository;
import br.com.kenji.conectarME.model.Usuario;



@RestController
@CrossOrigin("*")
public class UsuarioController {
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	@PostMapping("/novoUsuario")
	public ResponseEntity<Usuario> addUsuario(@RequestBody Usuario usuario){
		try {
			if(usuario.getId() != 0) {
				boolean exists = usuarioRepository.existsById(usuario.getId());   
				if(!exists) {
					return ResponseEntity.status(404).build();
				}
			}
			usuarioRepository.save(usuario);
			
			
			return ResponseEntity.ok(usuario);
			
		} catch(Exception ex) {
			ex.printStackTrace();
			return ResponseEntity.status(403).build();
		}
	}
	

	@GetMapping("/Usuarios")
	public ResponseEntity<List<Usuario>> getAll(){
		
		List<Usuario> usuarios = usuarioRepository.findAll();
		
		if(usuarios.size() == 0) {
			return ResponseEntity.status(404).build();
		}
		
		return ResponseEntity.ok(usuarios);
		
	}
	
	
	@GetMapping("/Usuario/{id}")
	public ResponseEntity<Usuario> getUsuario(@PathVariable int id){
		Usuario usuario =  usuarioRepository.findById(id).orElse(null);
		
		if(usuario == null) {
			return ResponseEntity.status(404).build();
		}
		
		return ResponseEntity.ok(usuario);
	}
	
	
	@PostMapping("/autenticar")
	public ResponseEntity<Usuario> logar(@RequestBody Usuario objeto){
		Usuario usuario = usuarioRepository.findByEmailAndSenha(objeto.getEmail(), objeto.getSenha());
		
		if(usuario == null) {
			return ResponseEntity.status(404).build();
		}
		
		
		return ResponseEntity.ok(usuario);
		
	}
	

}
