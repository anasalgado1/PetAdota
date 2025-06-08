package br.com.petadota.controller;

import br.com.petadota.entity.Animal;
import br.com.petadota.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/animais") 
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @PostMapping
    public ResponseEntity<Animal> criarAnimal(@RequestBody Animal animal) {
        Animal novoAnimal = animalService.criarAnimal(animal);
        return new ResponseEntity<>(novoAnimal, HttpStatus.CREATED); 
    }

    @GetMapping
    public ResponseEntity<List<Animal>> listarAnimais() {
        return ResponseEntity.ok(animalService.listarTodos()); 
    }

    @GetMapping("/{id}")
    public ResponseEntity<Animal> buscarAnimalPorId(@PathVariable Long id) {
        return ResponseEntity.ok(animalService.buscarPorId(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Animal> atualizarAnimal(@PathVariable Long id, @RequestBody Animal animalDetalhes) {
        return ResponseEntity.ok(animalService.atualizarAnimal(id, animalDetalhes));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarAnimal(@PathVariable Long id) {
        animalService.deletarAnimal(id);
        return ResponseEntity.noContent().build(); 
    }
}