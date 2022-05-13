package com.idat.examenc1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.examenc1.dto.UniversidadDTORequest;
import com.idat.examenc1.dto.UniversidadDTOResponse;
import com.idat.examenc1.model.MallaCurricular;
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
		
		rep.save(u);
	}

	@Override
	public void editarUniversidad(UniversidadDTORequest universidad) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarUniversidad(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<UniversidadDTOResponse> listarUniversidad() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UniversidadDTOResponse obtenerUniversidadId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
