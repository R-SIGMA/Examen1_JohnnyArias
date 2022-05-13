package com.idat.examenc1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.examenc1.dto.UniversidadDTORequest;
import com.idat.examenc1.dto.UniversidadDTOResponse;
import com.idat.examenc1.model.Universidad;
import com.idat.examenc1.repository.UniversidadRepository;

@Service
public class UniversidadServiceImpl implements UniversidadService {

	@Autowired
	public UniversidadRepository rep;
	
	@Override
	public void guardarUniversidad(UniversidadDTORequest universidad) {
		Universidad u = new Universidad();
		
		u.setIdUniversidad(universidad.getIdUniversidadDTO());
		u.setUniversidad(universidad.getUniversidadDTO());
		u.setMallacurricular(universidad.getMallacurricularDTO());
		
		rep.save(u);
	}

	@Override
	public void editarUniversidad(UniversidadDTORequest universidad) {
		Universidad u = new Universidad();
		
		u.setIdUniversidad(universidad.getIdUniversidadDTO());
		u.setUniversidad(universidad.getUniversidadDTO());
		u.setMallacurricular(universidad.getMallacurricularDTO());
		
		rep.saveAndFlush(u);
	}

	@Override
	public void eliminarUniversidad(Integer id) {
		rep.deleteById(id);
	}

	@Override
	public List<UniversidadDTOResponse> listarUniversidad() {
		List<UniversidadDTOResponse> list = new ArrayList<UniversidadDTOResponse>();
		UniversidadDTOResponse u = null;
		
		for (Universidad uniersidad : rep.findAll()) {
			u.setIdUniversidadDTO(uniersidad.getIdUniversidad());
			u.setUniversidadDTO(uniersidad.getUniversidad());
			u.setMallacurricularDTO(uniersidad.getMallacurricular());
			list.add(u);
		}
		
		return list;
	}

	@Override
	public UniversidadDTOResponse obtenerUniversidadId(Integer id) {
		Universidad universidad = rep.findById(id).orElse(null);
		
		UniversidadDTOResponse u = new UniversidadDTOResponse();
		u.setIdUniversidadDTO(universidad.getIdUniversidad());
		u.setUniversidadDTO(universidad.getUniversidad());
		u.setMallacurricularDTO(universidad.getMallacurricular());
		
		return u;
	}

}
