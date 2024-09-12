package pe.edu.upeu.practica1109.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import pe.edu.upeu.practica1109.Service.GradoService;
import pe.edu.upeu.practica1109.entity.Grado;

@RestController
@RequestMapping("grados")
public class GradoController {
	@Autowired
    private GradoService gradoService;
    
    @GetMapping
    public ResponseEntity<List<Grado>> readAll(){
        try {
            List<Grado> grados = gradoService.readAll();
            if(grados.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(grados, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @PostMapping
    public ResponseEntity<Grado> crear(@Valid @RequestBody Grado g){
        try {
            Grado grado = gradoService.create(g);
            return new ResponseEntity<>(grado, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Grado> getGradoById(@PathVariable("id") Long id){
        try {
            Grado g = gradoService.read(id).orElse(null);
            if (g == null) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(g, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> delGrado(@PathVariable("id") Long id){
        try {
            gradoService.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Grado> updateGrado(@PathVariable("id") Long id, @Valid @RequestBody Grado g){
        Optional<Grado> existingGrado = gradoService.read(id);
        if(existingGrado.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(gradoService.update(g), HttpStatus.OK);
        }
    }
}

