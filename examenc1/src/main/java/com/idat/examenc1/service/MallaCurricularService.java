package com.idat.examenc1.service;

import java.util.List;

import com.idat.examenc1.dto.MallaCurricularDTORequest;
import com.idat.examenc1.dto.MallaCurricularDTOResponse;

public interface MallaCurricularService {

	public void guardarMalla(MallaCurricularDTORequest malla);
	public void editarMalla(MallaCurricularDTORequest malla);
	public void eliminarMalla(Integer id);
	public List<MallaCurricularDTOResponse> listarMalla();
	public MallaCurricularDTOResponse obtenerMallaId(Integer id);
	
}
