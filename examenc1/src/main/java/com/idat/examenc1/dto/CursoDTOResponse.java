package com.idat.examenc1.dto;

import java.util.ArrayList;
import java.util.List;

public class CursoDTOResponse {

	private Integer idCursoDTO;
	private String cursoDTO;
	private String descripcionDTO;
	private MallaCurricularDTOResponse mallacurricularDTO;
	private List<ProfesorDTORequest> itemsProfesorDTO = new ArrayList<>();
	
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
	public MallaCurricularDTOResponse getMallacurricularDTO() {
		return mallacurricularDTO;
	}
	public void setMallacurricularDTO(MallaCurricularDTOResponse mallacurricularDTO) {
		this.mallacurricularDTO = mallacurricularDTO;
	}
	public List<ProfesorDTORequest> getItemsProfesorDTO() {
		return itemsProfesorDTO;
	}
	public void setItemsProfesorDTO(List<ProfesorDTORequest> itemsProfesorDTO) {
		this.itemsProfesorDTO = itemsProfesorDTO;
	}
}
