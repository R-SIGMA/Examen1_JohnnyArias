package com.idat.examenc1.dto;

import java.util.ArrayList;
import java.util.List;

import com.idat.examenc1.model.Curso;

public class ProfesorDTORequest {

	private Integer idProfesor;
	private String profesor;
	private List<Curso> itemsCurso = new ArrayList<>();
	public Integer getIdProfesor() {
		return idProfesor;
	}
	public void setIdProfesor(Integer idProfesor) {
		this.idProfesor = idProfesor;
	}
	public String getProfesor() {
		return profesor;
	}
	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}
	public List<Curso> getItemsCurso() {
		return itemsCurso;
	}
	public void setItemsCurso(List<Curso> itemsCurso) {
		this.itemsCurso = itemsCurso;
	}
}
