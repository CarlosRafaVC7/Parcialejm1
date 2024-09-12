package pe.edu.upeu.practica1109.Service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.practica1109.entity.Matricula;

public interface MatriculaService {
	Matricula create(Matricula m);
	Matricula update(Matricula m);
	void delete(Long id);
	Optional<Matricula> read(Long id);
	List<Matricula> readAll();
}
