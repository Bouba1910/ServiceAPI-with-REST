package com.example.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.EtudiantDTO;
import com.example.service.EtudiantService;

@RestController
@RequestMapping("/api/etudiants")
public class EtudiantController {

	private final EtudiantService service;
	
	public EtudiantController(EtudiantService service) {
		this.service=service;
	}
	
	@PostMapping
	public ResponseEntity<EtudiantDTO> inscrire (@RequestBody EtudiantDTO dto){
		
		EtudiantDTO resultat = service.inscrire(dto);
		return ResponseEntity.status(201).body(resultat);
	}
	
	// GET /api/etudiants va retourner la liste complete
	@GetMapping
	public ResponseEntity<List<EtudiantDTO>> listerTous(){
		return ResponseEntity.ok(service.listerTous());
	}
}
