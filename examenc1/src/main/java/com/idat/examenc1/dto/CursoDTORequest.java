package com.idat.examenc1.dto;

import java.util.ArrayList;
import java.util.List;

import com.idat.examenc1.model.MallaCurricular;
import com.idat.examenc1.model.Profesor;

public class CursoDTORequest {

	private Integer idCurso;
	private String curso;
	private String descripcion;
	private MallaCurricular mallacurricular;
	private List<Profesor> itemsProfesor = new ArrayList<>();
	public Integer getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public MallaCurricular getMallacurricular() {
		return mallacurricular;
	}
	public void setMallacurricular(MallaCurricular mallacurricular) {
		this.mallacurricular = mallacurricular;
	}
	public List<Profesor> getItemsProfesor() {
		return itemsProfesor;
	}
	public void setItemsProfesor(List<Profesor> itemsProfesor) {
		this.itemsProfesor = itemsProfesor;
	}
}
