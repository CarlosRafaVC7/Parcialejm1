package pe.edu.upeu.practica1109.daoImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.practica1109.dao.GradoDao;
import pe.edu.upeu.practica1109.entity.Grado;
import pe.edu.upeu.practica1109.repository.GradoRepository;

@Component
public class GradoDaoImpl implements GradoDao {
	@Autowired
	private GradoRepository gradoRepository;

	@Override
	public Grado create(Grado g) {
	    return gradoRepository.save(g);
	}

	@Override
	public Grado update(Grado g) {
	    return gradoRepository.save(g);
	}

	@Override
	public void delete(Long id) {
	    gradoRepository.deleteById(id);
	}

	@Override
	public Optional<Grado> read(Long id) {
	    return gradoRepository.findById(id);
	}

	@Override
	public List<Grado> readAll() {
	    return gradoRepository.findAll();
	}

}
