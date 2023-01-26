package cl.duoc.examen.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import cl.duoc.examen.model.dto.Persona;

@FeignClient(name = "svc-personas", url = "http://localhost:8181/personas")
public interface PersonaFeignClient {
    
    @GetMapping(path = "/persona", produces = { "application/json" })
    public List<Persona> getAll();

    @PostMapping(path = "/persona", consumes = {"application/json"},  produces = {"application/json"})
    public Persona add(@RequestBody Persona Personas);

}