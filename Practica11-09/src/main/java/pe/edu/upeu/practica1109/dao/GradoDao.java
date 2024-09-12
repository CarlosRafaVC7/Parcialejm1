package pe.edu.upeu.practica1109.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.practica1109.entity.Grado;

public interface GradoDao {
	Grado create(Grado g);
	Grado update(Grado g);
	void delete(Long id);
	Optional<Grado> read(Long id);
	List<Grado> readAll();
}
