package br.com.petadota.controller;

import br.com.petadota.entity.Animal;
import br.com.petadota.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/web/animais")
public class AnimalWebController {

    @Autowired
    private AnimalService animalService;
    
    @GetMapping
    public String listarAnimais(Model model) {
        model.addAttribute("listaDeAnimais", animalService.listarTodos());
        return "lista-animais";
    }

    @GetMapping("/deletar/{id}")
    public String deletarAnimal(@PathVariable("id") Long id) {
        animalService.deletarAnimal(id);
        return "redirect:/web/animais";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioDeEdicao(@PathVariable Long id, Model model) {
        model.addAttribute("animal", animalService.buscarPorId(id));
        return "form-animal";
    }

    @GetMapping("/novo")
    public String mostrarFormularioDeCriacao(Model model) {
        model.addAttribute("animal", new Animal());
        return "form-animal";
    }

    @PostMapping("/salvar")
    public String salvarAnimal(@ModelAttribute("animal") Animal animal) {
        animalService.salvar(animal);
        return "redirect:/web/animais";
    }
}