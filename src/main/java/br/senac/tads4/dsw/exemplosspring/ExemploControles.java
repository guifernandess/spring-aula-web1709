/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads4.dsw.exemplosspring;

import java.time.LocalDateTime;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author guilherme.frocha6
 */
@Controller
@RequestMapping("/exemplo")

public class ExemploControles {
    
    @GetMapping
    public String exemplo01(Model modelo) {
        modelo.addAttribute("info1","Fulano da Silva");
        modelo.addAttribute("info2", LocalDateTime.now());
        return "view-exemplo01";
    }

}
