package pe.edu.upeu.practica1109.daoImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.practica1109.dao.EmpleadoDao;
import pe.edu.upeu.practica1109.entity.Empleado;
import pe.edu.upeu.practica1109.repository.EmpleadoRepository;

@Component
public class EmpleadoDaoImpl implements EmpleadoDao {
	@Autowired
	private EmpleadoRepository empleadoRepository;

	@Override
	public Empleado create(Empleado e) {
	    return empleadoRepository.save(e);
	}

	@Override
	public Empleado update(Empleado e) {
	    return empleadoRepository.save(e);
	}

	@Override
	public void delete(Long id) {
	    empleadoRepository.deleteById(id);
	}

	@Override
	public Optional<Empleado> read(Long id) {
	    return empleadoRepository.findById(id);
	}

	@Override
	public List<Empleado> readAll() {
	    return empleadoRepository.findAll();
	}

}
