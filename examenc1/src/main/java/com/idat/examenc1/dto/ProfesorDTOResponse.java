package com.idat.examenc1.dto;

import java.util.ArrayList;
import java.util.List;

public class ProfesorDTOResponse {

	private Integer idProfesorDTO;
	private String profesorDTO;
	private List<CursoDTORequest> itemsCursoDTO = new ArrayList<>();
	
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
	public List<CursoDTORequest> getItemsCursoDTO() {
		return itemsCursoDTO;
	}
	public void setItemsCursoDTO(List<CursoDTORequest> itemsCursoDTO) {
		this.itemsCursoDTO = itemsCursoDTO;
	}
}
