package br.com.kenji.conectarME.controller;

import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import javax.crypto.SecretKey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.kenji.conectarME.dao.UsuarioRepository;
import br.com.kenji.conectarME.model.Usuario;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
@CrossOrigin("*")
public class LoginController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	private final String SECRET = "H0l@Wor1d!";
	
	static final long EXPIRATION_TIME = 860_000_000;
	static final String TOKEN_PREFIX = "Bearer";
	static final String HEADER_STRING = "Authorization";


	@PostMapping("/login")
    public ResponseEntity<String> post(@RequestBody Usuario usuario){
    
		Usuario usuarioBusca = usuarioRepository.findByEmailAndSenha(usuario.getEmail(), usuario.getSenha());
		
		if(usuarioBusca == null) {
			return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Usuário ou senha inválido(s)!");
		} else {
			String JWT = Jwts.builder()
					.setSubject(usuario.getEmail())
					.setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
					.signWith(SignatureAlgorithm.HS512, SECRET)
					.compact();
	
	                
	                return ResponseEntity.status(HttpStatus.CREATED).body(JWT);
		}
		
        
    }

}
