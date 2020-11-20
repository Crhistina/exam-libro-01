package com.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.entity.Libro;
import com.proyecto.repository.LibroRepository;

@Service
public class LibroServiceImpl implements LibroService{

	@Autowired
	private LibroRepository repository;
	

	@Override
	public Libro inserta(Libro obj) {
		return repository.save(obj);
	}


	@Override
	public List<Libro> listaLibro() {
		return repository.findAll();
	}


}
