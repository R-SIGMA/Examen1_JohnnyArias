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

import com.idat.examenc1.dto.MallaCurricularDTORequest;
import com.idat.examenc1.dto.MallaCurricularDTOResponse;
import com.idat.examenc1.service.MallaCurricularService;

@RestController
@RequestMapping("/malla")
public class MallaCurricularController {

	@Autowired
	private MallaCurricularService serv;
	
	@GetMapping("/listar")
	public ResponseEntity<List<MallaCurricularDTOResponse>> listarMalla(){
		return new ResponseEntity<List<MallaCurricularDTOResponse>>(serv.listarMalla(), HttpStatus.OK);
	}
	
	@PostMapping("/guardar")
	public ResponseEntity<Void> guardarMalla(@RequestBody MallaCurricularDTORequest malla){
		serv.guardarMalla(malla);
		
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@GetMapping("/listar/{id}")
	public ResponseEntity<MallaCurricularDTOResponse> listarPorIdMalla(@PathVariable Integer id) {
		MallaCurricularDTOResponse mc = serv.obtenerMallaId(id);
		
		if(mc != null)
			return new ResponseEntity<MallaCurricularDTOResponse>(mc, HttpStatus.OK);
		
		return new ResponseEntity<MallaCurricularDTOResponse>(HttpStatus.NOT_FOUND);
	}
	
	@PatchMapping("/editar")
	public ResponseEntity<Void> editarMalla(@RequestBody MallaCurricularDTORequest malla){
		MallaCurricularDTOResponse mc = serv.obtenerMallaId(malla.getIdMalla());
		
		if(mc != null) {
			serv.editarMalla(malla);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public ResponseEntity<Void> eliminarMalla(@PathVariable Integer id){
		MallaCurricularDTOResponse mc = serv.obtenerMallaId(id);
		
		if(mc != null) {
			serv.eliminarMalla(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
}
