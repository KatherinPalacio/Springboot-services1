package co.edu.uceva.phoneservice.controller;

import co.edu.uceva.phoneservice.model.entities.Phone;
import co.edu.uceva.phoneservice.model.service.PhoneServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/api/v1/phone-service")

/*
¿Que es rest controller?
El @RestController es una anotacion de Spring Framework que me permite crear controladores de una aplicacion web
*/

public class PhoneRestController {

    @Autowired
    private PhoneServiceImpl phoneService;

    @GetMapping("/Phones")
    public List<Phone> listar() {
        return phoneService.listar();
    }



}
