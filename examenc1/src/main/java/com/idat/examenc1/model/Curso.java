package com.idat.examenc1.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name="curso")
@Entity
public class Curso implements Serializable {
	
	private static final long serialVersionUID = -3152329103396757153L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCurso;
	
	private String curso;
	private String descripcion;
	
	@ManyToOne
	@JoinColumn(name="id_malla", nullable=false,
	foreignKey = @ForeignKey(foreignKeyDefinition="foreign key(id_malla) references mallacurricular(id_malla)"))
	private MallaCurricular mallacurricular;

	@ManyToMany
	@JoinTable(name = "curso_profesor",
			joinColumns = @JoinColumn(name="id_curso",nullable=false,
					foreignKey = @ForeignKey(foreignKeyDefinition="foreign key(id_curso) references curso(id_curso)")),
			inverseJoinColumns = @JoinColumn(name="id_profesor",nullable=false,
					foreignKey = @ForeignKey(foreignKeyDefinition="foreign key(id_profesor) references profesor(id_profesor)")))
	private List<Profesor> itemsProfesor = new ArrayList<>();
	
	public Curso() {}

	public Curso(Integer idCurso, String curso, String descripcion, MallaCurricular mallacurricular,
			List<Profesor> itemsProfesor) {
		this.idCurso = idCurso;
		this.curso = curso;
		this.descripcion = descripcion;
		this.mallacurricular = mallacurricular;
		this.itemsProfesor = itemsProfesor;
	}

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
