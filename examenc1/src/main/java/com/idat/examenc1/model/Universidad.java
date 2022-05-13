package com.idat.examenc1.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name="universidad")
@Entity
public class Universidad implements Serializable {

	private static final long serialVersionUID = 2519167038944464832L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idUniversidad;
	
	private String universidad;
	
	@OneToOne
	@JoinColumn(name = "id_malla", nullable = false, unique = true,
	foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(id_malla) references mallacurricular(id_malla)"))
	private MallaCurricular mallacurricular;
	
	public Universidad() {}

	public Universidad(Integer idUniversidad, String universidad, MallaCurricular mallacurricular) {
		this.idUniversidad = idUniversidad;
		this.universidad = universidad;
		this.mallacurricular = mallacurricular;
	}

	public Integer getIdUniversidad() {
		return idUniversidad;
	}

	public void setIdUniversidad(Integer idUniversidad) {
		this.idUniversidad = idUniversidad;
	}

	public String getUniversidad() {
		return universidad;
	}

	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}

	public MallaCurricular getMallacurricular() {
		return mallacurricular;
	}

	public void setMallacurricular(MallaCurricular mallacurricular) {
		this.mallacurricular = mallacurricular;
	}
}
