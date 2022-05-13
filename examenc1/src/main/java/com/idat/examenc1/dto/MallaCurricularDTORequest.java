package com.idat.examenc1.dto;

import java.util.ArrayList;
import java.util.List;

import com.idat.examenc1.model.Curso;
import com.idat.examenc1.model.Universidad;

public class MallaCurricularDTORequest {

	private Integer idMalla;
	private Integer anio;
	private Universidad universidad;
	private List<Curso> itemsCurso = new ArrayList<>();
	public Integer getIdMalla() {
		return idMalla;
	}
	public void setIdMalla(Integer idMalla) {
		this.idMalla = idMalla;
	}
	public Integer getAnio() {
		return anio;
	}
	public void setAnio(Integer anio) {
		this.anio = anio;
	}
	public Universidad getUniversidad() {
		return universidad;
	}
	public void setUniversidad(Universidad universidad) {
		this.universidad = universidad;
	}
	public List<Curso> getItemsCurso() {
		return itemsCurso;
	}
	public void setItemsCurso(List<Curso> itemsCurso) {
		this.itemsCurso = itemsCurso;
	}
}
