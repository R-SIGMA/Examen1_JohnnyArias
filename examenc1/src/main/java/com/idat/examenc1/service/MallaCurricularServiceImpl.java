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
		
		mc.setIdMalla(malla.getIdMalla());
		mc.setAnio(malla.getAnio());
		mc.setUniversidad(malla.getUniversidad());
		mc.setItemsCurso(malla.getItemsCurso());
		
		rep.save(mc);
	}

	@Override
	public void editarMalla(MallaCurricularDTORequest malla) {
		MallaCurricular mc = new MallaCurricular();
		
		mc.setIdMalla(malla.getIdMalla());
		mc.setAnio(malla.getAnio());
		mc.setUniversidad(malla.getUniversidad());
		mc.setItemsCurso(malla.getItemsCurso());
		
		rep.saveAndFlush(mc);
	}

	@Override
	public void eliminarMalla(Integer id) {
		rep.deleteById(id);
	}

	@Override
	public List<MallaCurricularDTOResponse> listarMalla() {
		List<MallaCurricularDTOResponse> list = new ArrayList<MallaCurricularDTOResponse>();
		
		for (MallaCurricular malla : rep.findAll()) {
			MallaCurricularDTOResponse mc = new MallaCurricularDTOResponse();
			mc.setIdMalla(malla.getIdMalla());
			mc.setAnio(malla.getAnio());
			mc.setUniversidad(malla.getUniversidad());
			mc.setItemsCurso(malla.getItemsCurso());
			list.add(mc);
		}
		
		return list;
	}

	@Override
	public MallaCurricularDTOResponse obtenerMallaId(Integer id) {
		MallaCurricular malla = rep.findById(id).orElse(null);
		
		MallaCurricularDTOResponse mc = new MallaCurricularDTOResponse();
		mc.setIdMalla(malla.getIdMalla());
		mc.setAnio(malla.getAnio());
		mc.setUniversidad(malla.getUniversidad());
		mc.setItemsCurso(malla.getItemsCurso());
		
		return mc;
	}

}
