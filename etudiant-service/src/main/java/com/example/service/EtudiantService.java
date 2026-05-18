package com.example.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.dto.EtudiantDTO;
import com.example.entity.Etudiant;

@Service
public class EtudiantService {
	
	
	
	private static Map<Long,Etudiant> liste = new HashMap<>();
	
	static Etudiant etudiant1 = new Etudiant(1,"KABRE","ISSA","issa@gmail.com",22,"informatique");
	static Etudiant etudiant2 = new Etudiant(2,"ODG","SOFI","sofi@gmail.com",54,"Comptabilite");
	static Etudiant etudiant3 = new Etudiant(3,"KY","MADI","madi@gmail.com",15,"SVT");
	static Etudiant etudiant4 = new Etudiant(4,"SOME","FATI","fati@gmail.com",89,"FINANCE");
	
	static {
		liste.put(1L, etudiant1);
		liste.put(2L, etudiant2);
		liste.put(3L, etudiant3);
		liste.put(4L, etudiant4);
	}
	
	Long compteur = 5L;
	
	// Récupérer la liste de tous les étudiants
	public List<EtudiantDTO> listerTous() {

	    List<EtudiantDTO> result = new ArrayList<>();

	    for (Etudiant e : liste.values()) {
	        EtudiantDTO dto = new EtudiantDTO();

	        dto.setId(e.getId());
	        dto.setPrenom(e.getPrenom());
	        dto.setNom(e.getNom());
	        dto.setEmail(e.getEmail());
	        dto.setAge(e.getAge());
	        dto.setFiliere(e.getFiliere());

	        result.add(dto);
	    }

	    return result;
	}

	public EtudiantDTO inscrire(EtudiantDTO dto) {
		
		
		Etudiant etudiant = new Etudiant();
		etudiant.setPrenom(dto.getPrenom());
		etudiant.setNom(dto.getNom());
		etudiant.setEmail(dto.getEmail());
		etudiant.setAge(dto.getAge());
		etudiant.setFiliere(dto.getFiliere());
		
		return versDTO(etudiant);
	}
	
	//
	
	private EtudiantDTO versDTO(Etudiant e) {
		
		EtudiantDTO dto = new EtudiantDTO ();
		dto.setId(e.getId());
		dto.setPrenom(e.getPrenom());
		dto.setNom(e.getNom());
		dto.setEmail(e.getEmail());
		dto.setAge(e.getAge());
		dto.setFiliere(e.getFiliere());
		return dto;
	}
}
