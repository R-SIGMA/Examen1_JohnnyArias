package com.idat.examenc1.dto;

public class UniversidadDTOResponse {

	private Integer idUniversidadDTO;
	private String universidadDTO;
	private MallaCurricularDTOResponse mallacurricularDTO;
	
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
	public MallaCurricularDTOResponse getMallacurricularDTO() {
		return mallacurricularDTO;
	}
	public void setMallacurricularDTO(MallaCurricularDTOResponse mallacurricularDTO) {
		this.mallacurricularDTO = mallacurricularDTO;
	}
}
