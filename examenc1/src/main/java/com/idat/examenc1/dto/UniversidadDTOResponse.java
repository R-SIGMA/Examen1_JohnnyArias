package com.idat.examenc1.dto;

import com.idat.examenc1.model.MallaCurricular;

public class UniversidadDTOResponse {

	private Integer idUniversidadDTO;
	private String universidadDTO;
	private MallaCurricular mallacurricularDTO;
	
	public Integer getIdUniversidadDTO() {
		return idUniversidadDTO;
	}
	public void setIdUniversidadDTO(Integer idUniversidadDTO) {
		this.idUniversidadDTO = idUniversidadDTO;
	}
	public String getUniversidadDTO() {
		return universidadDTO;
	}
	public void setUniversidadDTO(String universidadDTO) {
		this.universidadDTO = universidadDTO;
	}
	public MallaCurricular getMallacurricularDTO() {
		return mallacurricularDTO;
	}
	public void setMallacurricularDTO(MallaCurricular mallacurricularDTO) {
		this.mallacurricularDTO = mallacurricularDTO;
	}
}
