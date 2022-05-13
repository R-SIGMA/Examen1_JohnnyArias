package com.idat.examenc1.dto;

import java.util.ArrayList;
import java.util.List;

import com.idat.examenc1.model.Curso;
import com.idat.examenc1.model.Universidad;

public class MallaCurricularDTORequest {

	private Integer idMallaDTO;
	private Integer anioDTO;
	private Universidad universidadDTO;
	private List<Curso> itemsCursoDTO = new ArrayList<>();
	
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
	public Universidad getUniversidadDTO() {
		return universidadDTO;
	}
	public void setUniversidadDTO(Universidad universidadDTO) {
		this.universidadDTO = universidadDTO;
	}
	public List<Curso> getItemsCursoDTO() {
		return itemsCursoDTO;
	}
	public void setItemsCursoDTO(List<Curso> itemsCursoDTO) {
		this.itemsCursoDTO = itemsCursoDTO;
	}
}
