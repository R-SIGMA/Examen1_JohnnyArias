package com.idat.examenc1.service;

import java.util.List;

import com.idat.examenc1.dto.CursoDTORequest;
import com.idat.examenc1.dto.CursoDTOResponse;

public interface CursoService {

	public void guardarCurso(CursoDTORequest curso);
	public void editarCurso(CursoDTORequest curso);
	public void eliminarCurso(Integer id);
	public List<CursoDTOResponse> listarCurso();
	public CursoDTOResponse obtenerCursoId(Integer id);
	
}
