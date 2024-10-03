package com.grazi.bet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grazi.bet.dto.UsuarioDTO;
import com.grazi.bet.model.UsuarioModel;
import com.grazi.bet.repository.UsuarioRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("gra")

public class UsuarioController {
	
	@Autowired
	UsuarioRepository repository;
	
	@PostMapping("/cadastrar")
	public ResponseEntity<?> salvarUsuario(@Valid @RequestBody UsuarioDTO user) {		
		UsuarioModel usuario = new UsuarioModel(user);
		repository.save(usuario);
		return ResponseEntity.ok("usuario cadastrado");
	}

}
