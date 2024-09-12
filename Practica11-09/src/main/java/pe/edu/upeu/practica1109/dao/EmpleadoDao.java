package pe.edu.upeu.practica1109.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.practica1109.entity.Empleado;


public interface EmpleadoDao {
	Empleado create(Empleado e);
	Empleado update(Empleado e);
	void delete(Long id);
	Optional<Empleado> read(Long id);
	List<Empleado> readAll();
}
