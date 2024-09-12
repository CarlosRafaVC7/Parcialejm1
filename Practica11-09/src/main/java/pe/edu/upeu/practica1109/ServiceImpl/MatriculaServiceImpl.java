package pe.edu.upeu.practica1109.ServiceImpl;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.practica1109.Service.MatriculaService;
import pe.edu.upeu.practica1109.dao.MatriculaDao;
import pe.edu.upeu.practica1109.entity.Matricula;

@Service
public class MatriculaServiceImpl implements MatriculaService {
    @Autowired
    private MatriculaDao matriculaDao;

    @Override
    public Matricula create(Matricula m) {
        return matriculaDao.create(m);
    }

    @Override
    public Matricula update(Matricula m) {
        return matriculaDao.update(m);
    }

    @Override
    public void delete(Long id) {
        matriculaDao.delete(id);
    }

    @Override
    public Optional<Matricula> read(Long id) {
        return matriculaDao.read(id);
    }

    @Override
    public List<Matricula> readAll() {
        return matriculaDao.readAll();
    }
}

