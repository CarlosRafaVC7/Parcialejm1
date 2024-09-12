package pe.edu.upeu.practica1109.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.practica1109.Service.AlumnoService;
import pe.edu.upeu.practica1109.dao.AlumnoDao;
import pe.edu.upeu.practica1109.entity.Alumno;

@Service
public class AlumnoServiceImpl implements AlumnoService {
    @Autowired
    private AlumnoDao alumnoDao;

    @Override
    public Alumno create(Alumno a) {
        return alumnoDao.create(a);
    }

    @Override
    public Alumno update(Alumno a) {
        return alumnoDao.update(a);
    }

    @Override
    public void delete(Long id) {
        alumnoDao.delete(id);
    }

    @Override
    public Optional<Alumno> read(Long id) {
        return alumnoDao.read(id);
    }

    @Override
    public List<Alumno> readAll() {
        return alumnoDao.readAll();
    }
}

