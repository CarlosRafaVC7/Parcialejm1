package pe.edu.upeu.practica1109.ServiceImpl;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.practica1109.Service.EmpleadoService;
import pe.edu.upeu.practica1109.dao.EmpleadoDao;
import pe.edu.upeu.practica1109.entity.Empleado;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {
    @Autowired
    private EmpleadoDao empleadoDao;

    @Override
    public Empleado create(Empleado e) {
        return empleadoDao.create(e);
    }

    @Override
    public Empleado update(Empleado e) {
        return empleadoDao.update(e);
    }

    @Override
    public void delete(Long id) {
        empleadoDao.delete(id);
    }

    @Override
    public Optional<Empleado> read(Long id) {
        return empleadoDao.read(id);
    }

    @Override
    public List<Empleado> readAll() {
        return empleadoDao.readAll();
    }
}

