package br.com.projetoaula.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetoaula.entities.User;

@RestController/*Recurso web que é implementado por um controlador*/
@RequestMapping(value="/users")
public class UserResource {
	
	@GetMapping/*Responde a requisição do tipo Get do HTTP*/
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria@gmail.com","912345678","12345");
		return ResponseEntity.ok().body(u);
	}
	
}
