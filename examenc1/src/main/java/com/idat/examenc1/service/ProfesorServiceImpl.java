package com.idat.examenc1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.examenc1.dto.ProfesorDTORequest;
import com.idat.examenc1.dto.ProfesorDTOResponse;
import com.idat.examenc1.model.Profesor;
import com.idat.examenc1.repository.ProfesorRepository;

@Service
public class ProfesorServiceImpl implements ProfesorService {

	@Autowired
	public ProfesorRepository rep;
	
	@Override
	public void guardarProfesor(ProfesorDTORequest profesor) {
		Profesor p = new Profesor();
		
		p.setIdProfesor(profesor.getIdProfesor());
		p.setProfesor(profesor.getProfesor());
		p.setItemsCurso(profesor.getItemsCurso());
		
		rep.save(p);
	}

	@Override
	public void editarProfesor(ProfesorDTORequest profesor) {
		Profesor p = new Profesor();
		
		p.setIdProfesor(profesor.getIdProfesor());
		p.setProfesor(profesor.getProfesor());
		p.setItemsCurso(profesor.getItemsCurso());
		
		rep.saveAndFlush(p);
	}

	@Override
	public void eliminarProfesor(Integer id) {
		rep.deleteById(id);
	}

	@Override
	public List<ProfesorDTOResponse> listarProfesor() {
		List<ProfesorDTOResponse> list = new ArrayList<ProfesorDTOResponse>();
		
		for (Profesor profesor : rep.findAll()) {
			ProfesorDTOResponse p = new ProfesorDTOResponse();
			p.setIdProfesor(profesor.getIdProfesor());
			p.setProfesor(profesor.getProfesor());
			p.setItemsCurso(profesor.getItemsCurso());
			
			list.add(p);
		}
		
		return list;
	}

	@Override
	public ProfesorDTOResponse obtenerProfesorId(Integer id) {
		Profesor profesor = rep.findById(id).orElse(null);
		
		ProfesorDTOResponse p = new ProfesorDTOResponse();
		p.setIdProfesor(profesor.getIdProfesor());
		p.setProfesor(profesor.getProfesor());
		p.setItemsCurso(profesor.getItemsCurso());
		
		return p;
	}

}
