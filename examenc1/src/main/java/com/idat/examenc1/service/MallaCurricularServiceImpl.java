package com.idat.examenc1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.examenc1.dto.MallaCurricularDTORequest;
import com.idat.examenc1.dto.MallaCurricularDTOResponse;
import com.idat.examenc1.model.MallaCurricular;
import com.idat.examenc1.repository.MallaCurricularRepository;

@Service
public class MallaCurricularServiceImpl implements MallaCurricularService {

	@Autowired
	public MallaCurricularRepository rep;
	
	@Override
	public void guardarMalla(MallaCurricularDTORequest malla) {
		MallaCurricular mc = new MallaCurricular();
		
		mc.setIdMalla(malla.getIdMallaDTO());
		mc.setAnio(malla.getAnioDTO());
		mc.setUniversidad(malla.getUniversidadDTO());
		mc.setItemsCurso(malla.getItemsCursoDTO());
		
		rep.save(mc);
	}

	@Override
	public void editarMalla(MallaCurricularDTORequest malla) {
		MallaCurricular mc = new MallaCurricular();
		
		mc.setIdMalla(malla.getIdMallaDTO());
		mc.setAnio(malla.getAnioDTO());
		mc.setUniversidad(malla.getUniversidadDTO());
		mc.setItemsCurso(malla.getItemsCursoDTO());
		
		rep.saveAndFlush(mc);
	}

	@Override
	public void eliminarMalla(Integer id) {
		rep.deleteById(id);
	}

	@Override
	public List<MallaCurricularDTOResponse> listarMalla() {
		List<MallaCurricularDTOResponse> list = new ArrayList<MallaCurricularDTOResponse>();
		MallaCurricularDTOResponse mc = null;
		
		for (MallaCurricular malla : rep.findAll()) {
			mc.setIdMallaDTO(malla.getIdMalla());
			mc.setAnioDTO(malla.getAnio());
			mc.setUniversidadDTO(malla.getUniversidad());
			mc.setItemsCursoDTO(malla.getItemsCurso());
			list.add(mc);
		}
		
		return list;
	}

	@Override
	public MallaCurricularDTOResponse obtenerMallaId(Integer id) {
		MallaCurricular malla = rep.findById(id).orElse(null);
		
		MallaCurricularDTOResponse mc = new MallaCurricularDTOResponse();
		mc.setIdMallaDTO(malla.getIdMalla());
		mc.setAnioDTO(malla.getAnio());
		mc.setUniversidadDTO(malla.getUniversidad());
		mc.setItemsCursoDTO(malla.getItemsCurso());
		
		return mc;
	}

}
