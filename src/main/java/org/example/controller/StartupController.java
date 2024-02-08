package org.example.controller;

import org.example.model.Startup;
import org.example.service.StartupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class StartupController {

    @Autowired
    private StartupService startupService;

    @PostMapping("/gerar-ideias")
    public List<Startup> gerarIdeias(@RequestBody Startup startup) {
        return startupService.gerarIdeias(startup);
    }
}