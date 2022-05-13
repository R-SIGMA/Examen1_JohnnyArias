package com.idat.examenc1.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Table(name="profesor")
@Entity
public class Profesor implements Serializable {
	
	private static final long serialVersionUID = 1526231405194260495L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProfesor;
	
	private String profesor;

	@ManyToMany(mappedBy = "itemsProfesor")
	private List<Curso> itemsCurso = new ArrayList<>();
	
	public Profesor() {}

	public Profesor(Integer idProfesor, String profesor, List<Curso> itemsCurso) {
		this.idProfesor = idProfesor;
		this.profesor = profesor;
		this.itemsCurso = itemsCurso;
	}

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
