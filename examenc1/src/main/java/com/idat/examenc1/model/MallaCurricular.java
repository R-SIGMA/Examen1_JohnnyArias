package com.idat.examenc1.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name="mallacurricular")
@Entity
public class MallaCurricular implements Serializable {
	
	private static final long serialVersionUID = -5045213401614907139L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idMalla;

	private Integer anio;

	@OneToOne(mappedBy = "mallacurricular")
	private Universidad universidad;
	
	@OneToMany(mappedBy = "mallacurricular")
	private List<Curso> itemsCurso = new ArrayList<>();
	
	public MallaCurricular() {}

	public MallaCurricular(Integer idMalla, Integer anio, Universidad universidad, List<Curso> itemsCurso) {
		this.idMalla = idMalla;
		this.anio = anio;
		this.universidad = universidad;
		this.itemsCurso = itemsCurso;
	}

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
