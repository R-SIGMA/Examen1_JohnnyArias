package com.idat.examenc1.dto;

import java.util.ArrayList;
import java.util.List;

public class MallaCurricularDTOResponse {

	private Integer idMallaDTO;
	private Integer anioDTO;
	private UniversidadDTOResponse universidadDTO;
	private List<CursoDTOResponse> itemsCursoDTO = new ArrayList<>();
	
	public Integer getIdMallaDTO() {
		return idMallaDTO;
	}
	public void setIdMallaDTO(Integer idMallaDTO) {
		this.idMallaDTO = idMallaDTO;
	}
	public Integer getAnioDTO() {
		return anioDTO;
	}
	public void setAnioDTO(Integer anioDTO) {
		this.anioDTO = anioDTO;
	}
	public UniversidadDTOResponse getUniversidadDTO() {
		return universidadDTO;
	}
	public void setUniversidadDTO(UniversidadDTOResponse universidadDTO) {
		this.universidadDTO = universidadDTO;
	}
	public List<CursoDTOResponse> getItemsCursoDTO() {
		return itemsCursoDTO;
	}
	public void setItemsCursoDTO(List<CursoDTOResponse> itemsCursoDTO) {
		this.itemsCursoDTO = itemsCursoDTO;
	}

}
