package com.exemplo.curso1.recurso;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemplo.curso1.entidades.Usuario;

@RestController
@RequestMapping(value = "/Usuarios")
public class UsuarioRecurso {
	
	@GetMapping
	public ResponseEntity<Usuario> findAll(){
		Usuario u = new Usuario(1L, "maria", "maria@", "99", "1234");
		return ResponseEntity.ok().body(u);
	}
	
}
