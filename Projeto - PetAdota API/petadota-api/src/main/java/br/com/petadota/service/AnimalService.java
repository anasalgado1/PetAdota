package br.com.petadota.service;

import br.com.petadota.entity.Animal;
import br.com.petadota.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    public Animal criarAnimal(Animal animal) {
        return animalRepository.save(animal);
    }

    public List<Animal> listarTodos() {
        return animalRepository.findAll();
    }

    public Animal buscarPorId(Long id) {
        return animalRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Animal não encontrado!"));
    }

    public Animal atualizarAnimal(Long id, Animal animalDetalhes) {
        Animal animalExistente = buscarPorId(id); 

        animalExistente.setNome(animalDetalhes.getNome());
        animalExistente.setTipo(animalDetalhes.getTipo());
        animalExistente.setIdade(animalDetalhes.getIdade());
        animalExistente.setRaca(animalDetalhes.getRaca());
        animalExistente.setStatus(animalDetalhes.getStatus());
        animalExistente.setDescricao(animalDetalhes.getDescricao());
        animalExistente.setImagemUrl(animalDetalhes.getImagemUrl());

        return animalRepository.save(animalExistente);
    }

    public void deletarAnimal(Long id) {
        buscarPorId(id); 
        animalRepository.deleteById(id);
    }

    public Animal salvar(Animal animal) {
        return animalRepository.save(animal);
    }
}