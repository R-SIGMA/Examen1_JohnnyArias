package com.idat.examenc1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.examenc1.dto.CursoDTORequest;
import com.idat.examenc1.dto.CursoDTOResponse;
import com.idat.examenc1.model.Curso;
import com.idat.examenc1.repository.CursoRepository;

@Service
public class CursoServiceImpl implements CursoService {

	@Autowired
	public CursoRepository rep;
	
	@Override
	public void guardarCurso(CursoDTORequest curso) {
		Curso c = new Curso();
		
		c.setIdCurso(curso.getIdCurso());
		c.setCurso(curso.getCurso());
		c.setDescripcion(curso.getDescripcion());
		c.setMallacurricular(curso.getMallacurricular());
		c.setItemsProfesor(curso.getItemsProfesor());
		
		rep.save(c);
	}

	@Override
	public void editarCurso(CursoDTORequest curso) {
		Curso c = new Curso();
		
		c.setIdCurso(curso.getIdCurso());
		c.setCurso(curso.getCurso());
		c.setDescripcion(curso.getDescripcion());
		c.setMallacurricular(curso.getMallacurricular());
		c.setItemsProfesor(curso.getItemsProfesor());
		
		rep.saveAndFlush(c);
	}

	@Override
	public void eliminarCurso(Integer id) {
		rep.deleteById(id);
	}

	@Override
	public List<CursoDTOResponse> listarCurso() {
		List<CursoDTOResponse> list = new ArrayList<CursoDTOResponse>();
		
		for (Curso curso : rep.findAll()) {
			CursoDTOResponse c = new CursoDTOResponse();
			c.setIdCurso(curso.getIdCurso());
			c.setCurso(curso.getCurso());
			c.setDescripcion(curso.getDescripcion());
			c.setMallacurricular(curso.getMallacurricular());
			c.setItemsProfesor(curso.getItemsProfesor());
			list.add(c);
		}
		
		return list;
	}

	@Override
	public CursoDTOResponse obtenerCursoId(Integer id) {
		Curso curso = rep.findById(id).orElse(null);
		
		CursoDTOResponse c = new CursoDTOResponse();
		c.setIdCurso(curso.getIdCurso());
		c.setCurso(curso.getCurso());
		c.setDescripcion(curso.getDescripcion());
		c.setMallacurricular(curso.getMallacurricular());
		c.setItemsProfesor(curso.getItemsProfesor());
		
		return c;
	}

}
