package cl.duoc.examen.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.examen.clients.PersonaFeignClient;
import cl.duoc.examen.model.dto.Persona;

@Service
public class PersonaService {
    
    @Autowired
    PersonaFeignClient personaFeignClient;

    public List<Persona> getAll(){
        return personaFeignClient.getAll();
    }

    public Persona add(Persona persona){
        return personaFeignClient.add(persona);
    }

}