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

import com.idat.examenc1.dto.CursoDTORequest;
import com.idat.examenc1.dto.CursoDTOResponse;
import com.idat.examenc1.service.CursoService;

@RestController
@RequestMapping("/curso")
public class CursoController {

	@Autowired
	private CursoService serv;
	
	@GetMapping("/listar")
	public ResponseEntity<List<CursoDTOResponse>> listarCurso(){
		return new ResponseEntity<List<CursoDTOResponse>>(serv.listarCurso(), HttpStatus.OK);
	}
	
	@PostMapping("/guardar")
	public ResponseEntity<Void> guardarCurso(@RequestBody CursoDTORequest curso){
		serv.guardarCurso(curso);
		
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@GetMapping("/listar/{id}")
	public ResponseEntity<CursoDTOResponse> listarPorIdCurso(@PathVariable Integer id) {
		CursoDTOResponse c = serv.obtenerCursoId(id);
		
		if(c != null)
			return new ResponseEntity<CursoDTOResponse>(c, HttpStatus.OK);
		
		return new ResponseEntity<CursoDTOResponse>(HttpStatus.NOT_FOUND);
	}
	
	@PatchMapping("/editar")
	public ResponseEntity<Void> editarCurso(@RequestBody CursoDTORequest curso){
		CursoDTOResponse c = serv.obtenerCursoId(curso.getIdCurso());
		
		if(c != null) {
			serv.editarCurso(curso);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public ResponseEntity<Void> eliminarCurso(@PathVariable Integer id){
		CursoDTOResponse c = serv.obtenerCursoId(id);
		
		if(c != null) {
			serv.eliminarCurso(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
}
