package pe.edu.upeu.practica1109.ServiceImpl;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.practica1109.Service.GradoService;
import pe.edu.upeu.practica1109.dao.GradoDao;
import pe.edu.upeu.practica1109.entity.Grado;

@Service
public class GradoServiceImpl implements GradoService {
    @Autowired
    private GradoDao gradoDao;

    @Override
    public Grado create(Grado g) {
        return gradoDao.create(g);
    }

    @Override
    public Grado update(Grado g) {
        return gradoDao.update(g);
    }

    @Override
    public void delete(Long id) {
        gradoDao.delete(id);
    }

    @Override
    public Optional<Grado> read(Long id) {
        return gradoDao.read(id);
    }

    @Override
    public List<Grado> readAll() {
        return gradoDao.readAll();
    }
}

