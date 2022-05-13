package com.idat.examenc1.dto;

import java.util.ArrayList;
import java.util.List;

import com.idat.examenc1.model.Curso;

public class ProfesorDTORequest {

	private Integer idProfesorDTO;
	private String profesorDTO;
	private List<Curso> itemsCursoDTO = new ArrayList<>();
	
	public Integer getIdProfesorDTO() {
		return idProfesorDTO;
	}
	public void setIdProfesorDTO(Integer idProfesorDTO) {
		this.idProfesorDTO = idProfesorDTO;
	}
	public String getProfesorDTO() {
		return profesorDTO;
	}
	public void setProfesorDTO(String profesorDTO) {
		this.profesorDTO = profesorDTO;
	}
	public List<Curso> getItemsCursoDTO() {
		return itemsCursoDTO;
	}
	public void setItemsCursoDTO(List<Curso> itemsCursoDTO) {
		this.itemsCursoDTO = itemsCursoDTO;
	}
}
