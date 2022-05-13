package com.idat.examenc1.dto;

import java.util.ArrayList;
import java.util.List;

import com.idat.examenc1.model.MallaCurricular;
import com.idat.examenc1.model.Profesor;

public class CursoDTOResponse {

	private Integer idCursoDTO;
	private String cursoDTO;
	private String descripcionDTO;
	private MallaCurricular mallacurricularDTO;
	private List<Profesor> itemsProfesorDTO = new ArrayList<>();
	
	public Integer getIdCursoDTO() {
		return idCursoDTO;
	}
	public void setIdCursoDTO(Integer idCursoDTO) {
		this.idCursoDTO = idCursoDTO;
	}
	public String getCursoDTO() {
		return cursoDTO;
	}
	public void setCursoDTO(String cursoDTO) {
		this.cursoDTO = cursoDTO;
	}
	public String getDescripcionDTO() {
		return descripcionDTO;
	}
	public void setDescripcionDTO(String descripcionDTO) {
		this.descripcionDTO = descripcionDTO;
	}
	public MallaCurricular getMallacurricularDTO() {
		return mallacurricularDTO;
	}
	public void setMallacurricularDTO(MallaCurricular mallacurricularDTO) {
		this.mallacurricularDTO = mallacurricularDTO;
	}
	public List<Profesor> getItemsProfesorDTO() {
		return itemsProfesorDTO;
	}
	public void setItemsProfesorDTO(List<Profesor> itemsProfesorDTO) {
		this.itemsProfesorDTO = itemsProfesorDTO;
	}
}
