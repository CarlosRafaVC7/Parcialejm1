package pe.edu.upeu.practica1109.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.practica1109.entity.Empleado;


@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {

}
