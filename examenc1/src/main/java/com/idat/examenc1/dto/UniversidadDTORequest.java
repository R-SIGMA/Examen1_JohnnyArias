package com.idat.examenc1.dto;

public class UniversidadDTORequest {

	private Integer idUniversidadDTO;
	private String universidadDTO;
	private MallaCurricularDTORequest mallacurricularDTO;
	
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
	public MallaCurricularDTORequest getMallacurricularDTO() {
		return mallacurricularDTO;
	}
	public void setMallacurricularDTO(MallaCurricularDTORequest mallacurricularDTO) {
		this.mallacurricularDTO = mallacurricularDTO;
	}
}
