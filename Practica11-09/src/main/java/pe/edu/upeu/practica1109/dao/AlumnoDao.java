package pe.edu.upeu.practica1109.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.practica1109.entity.Alumno;

public interface AlumnoDao {
	Alumno create(Alumno a);
	Alumno update(Alumno a);
	void delete(Long id);
	Optional<Alumno> read(Long id);
	List<Alumno> readAll();
}
