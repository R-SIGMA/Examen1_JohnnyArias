package com.idat.examenc1.dto;

import java.util.ArrayList;
import java.util.List;

public class MallaCurricularDTORequest {

	private Integer idMallaDTO;
	private Integer anioDTO;
	private UniversidadDTORequest universidadDTO;
	private List<CursoDTORequest> itemsCursoDTO = new ArrayList<>();
	
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
	public UniversidadDTORequest getUniversidadDTO() {
		return universidadDTO;
	}
	public void setUniversidadDTO(UniversidadDTORequest universidadDTO) {
		this.universidadDTO = universidadDTO;
	}
	public List<CursoDTORequest> getItemsCursoDTO() {
		return itemsCursoDTO;
	}
	public void setItemsCursoDTO(List<CursoDTORequest> itemsCursoDTO) {
		this.itemsCursoDTO = itemsCursoDTO;
	}
}
