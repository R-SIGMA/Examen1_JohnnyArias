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

import com.idat.examenc1.dto.UniversidadDTORequest;
import com.idat.examenc1.dto.UniversidadDTOResponse;
import com.idat.examenc1.service.UniversidadService;

@RestController
@RequestMapping("/universidad")
public class UniversidadController {

	@Autowired
	private UniversidadService serv;

	@GetMapping("/listar")
	public ResponseEntity<List<UniversidadDTOResponse>> listarUniversidad(){
		return new ResponseEntity<List<UniversidadDTOResponse>>(serv.listarUniversidad(), HttpStatus.OK);
	}
	
	@PostMapping("/guardar")
	public ResponseEntity<Void> guardar(@RequestBody UniversidadDTORequest universidad){
		serv.guardarUniversidad(universidad);
		
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@GetMapping("/listar/{id}")
	public ResponseEntity<UniversidadDTOResponse> listarPorId(@PathVariable Integer id) {
		UniversidadDTOResponse u = serv.obtenerUniversidadId(id);
		
		if(u != null)
			return new ResponseEntity<UniversidadDTOResponse>(u, HttpStatus.OK);
		
		return new ResponseEntity<UniversidadDTOResponse>(HttpStatus.NOT_FOUND);
	}
	
	@PatchMapping("/editar")
	public ResponseEntity<Void> editar(@RequestBody UniversidadDTORequest universidad){
		UniversidadDTOResponse u = serv.obtenerUniversidadId(universidad.getIdUniversidadDTO());
		
		if(u != null) {
			serv.editarUniversidad(universidad);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable Integer id){
		UniversidadDTOResponse u = serv.obtenerUniversidadId(id);
		
		if(u != null) {
			serv.eliminarUniversidad(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
}
