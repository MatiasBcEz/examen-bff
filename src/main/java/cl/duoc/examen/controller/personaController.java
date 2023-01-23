package cl.duoc.examen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.examen.model.dto.Persona;
import cl.duoc.examen.services.PersonaService;

@RestController
@RequestMapping("/persona-bff")
public class PersonaController {
    
    @Autowired
    PersonaService personaService;

    @GetMapping(path = "/persona", produces = { "application/json" })
    public List<Persona> getAll(){
        return personaService.getAll();
    }

    @PostMapping(path = "/persona", consumes = {"application/json"},  produces = {"application/json"})
    public Persona add(@RequestBody Persona persona){
        return personaService.add(persona);
    }
}