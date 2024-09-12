package pe.edu.upeu.practica1109.Service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.practica1109.entity.Grado;

public interface GradoService {
	Grado create(Grado g);
	Grado update(Grado g);
	void delete(Long id);
	Optional<Grado> read(Long id);
	List<Grado> readAll();
}
