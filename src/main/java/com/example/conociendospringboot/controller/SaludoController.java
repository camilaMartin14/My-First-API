 package com.example.conociendospringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Camila
 */
 @RestController
 @RequestMapping("/apisaludos")
public class SaludoController {
     
     @GetMapping("/hola")
     public String holaMundo(){
         return "Bienvenid@ c:";
    }
     
     @GetMapping("/holanombreyedad/{nombre}/{edad}")
     public String holaMundoNombre(@PathVariable String nombre, 
             @PathVariable int edad){
         return "¡Hola "+ nombre + " ! "+ "Tu edad es: " + edad +" años.";
     }
}
