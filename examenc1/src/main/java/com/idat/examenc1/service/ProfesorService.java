package com.idat.examenc1.service;

import java.util.List;

import com.idat.examenc1.dto.ProfesorDTORequest;
import com.idat.examenc1.dto.ProfesorDTOResponse;

public interface ProfesorService {

	public void guardarProfesor(ProfesorDTORequest profesor);
	public void editarProfesor(ProfesorDTORequest profesor);
	public void eliminarProfesor(Integer id);
	public List<ProfesorDTOResponse> listarProfesor();
	public ProfesorDTOResponse obtenerProfesorId(Integer id);
	
}
