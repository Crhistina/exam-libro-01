package com.proyecto.service;

import java.util.List;

import com.proyecto.entity.Libro;

public interface LibroService {

	public abstract Libro inserta(Libro obj);
	public abstract List<Libro> listaLibro();
}
