package com.idat.examenc1.dto;

import com.idat.examenc1.model.MallaCurricular;

public class UniversidadDTOResponse {

	private Integer idUniversidad;
	private String universidad;
	private MallaCurricular mallacurricular;
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
