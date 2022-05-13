package com.idat.examenc1.service;

import java.util.List;

import com.idat.examenc1.dto.UniversidadDTORequest;
import com.idat.examenc1.dto.UniversidadDTOResponse;

public interface UniversidadService {

	public void guardarUniversidad(UniversidadDTORequest universidad);
	public void editarUniversidad(UniversidadDTORequest universidad);
	public void eliminarUniversidad(Integer id);
	public List<UniversidadDTOResponse> listarUniversidad();
	public UniversidadDTOResponse obtenerUniversidadId(Integer id);
	
}
