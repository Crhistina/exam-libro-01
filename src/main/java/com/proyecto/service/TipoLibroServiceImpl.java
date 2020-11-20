package com.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.entity.TipoLibro;
import com.proyecto.repository.TipoLibroRepository;

@Service
public class TipoLibroServiceImpl implements TipoLibroService{

	@Autowired
	private TipoLibroRepository repository;
	
	@Override
	public List<TipoLibro> listaTipoLibro() {
		return repository.findAll();
	}

}
