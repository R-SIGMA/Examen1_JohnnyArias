package com.idat.examenc1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idat.examenc1.dto.ProfesorDTORequest;
import com.idat.examenc1.dto.ProfesorDTOResponse;
import com.idat.examenc1.service.ProfesorService;

@RestController
@RequestMapping("/malla")
public class ProfesorController {

	@Autowired
	private ProfesorService serv;
	
	@GetMapping("/listar")
	public ResponseEntity<List<ProfesorDTOResponse>> listarProfesor(){
		return new ResponseEntity<List<ProfesorDTOResponse>>(serv.listarProfesor(), HttpStatus.OK);
	}
	
	@PostMapping("/guardar")
	public ResponseEntity<Void> guardar(@RequestBody ProfesorDTORequest profesor){
		serv.guardarProfesor(profesor);
		
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@GetMapping("/listar/{id}")
	public ResponseEntity<ProfesorDTOResponse> listarPorId(@PathVariable Integer id) {
		ProfesorDTOResponse p = serv.obtenerProfesorId(id);
		
		if(p != null)
			return new ResponseEntity<ProfesorDTOResponse>(p, HttpStatus.OK);
		
		return new ResponseEntity<ProfesorDTOResponse>(HttpStatus.NOT_FOUND);
	}
	
	@PatchMapping("/editar")
	public ResponseEntity<Void> editar(@RequestBody ProfesorDTORequest profesor){
		ProfesorDTOResponse p = serv.obtenerProfesorId(profesor.getIdProfesorDTO());
		
		if(p != null) {
			serv.editarProfesor(profesor);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable Integer id){
		ProfesorDTOResponse p = serv.obtenerProfesorId(id);
		
		if(p != null) {
			serv.eliminarProfesor(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
}
