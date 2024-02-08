package org.example.service;

import org.example.model.Startup;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StartupService {



    public List<Startup> gerarIdeias(Startup startup) {
        // Use o ChatGPT para gerar ideias de startups
        List<String> ideias = ChatGPT.gerarIdeias(startup.getProblemaASerSolucionado(),
                startup.getPublicoAlvo(), startup.getTecnologiasRelevantes());

        // Converta as ideias em objetos Startup
        List<Startup> startups = new ArrayList<>();
        for (String ideia : ideias) {
            Startup startupGerada = new Startup();
            startupGerada.setNome(ideia);
            startups.add(startupGerada);
        }

        return startups;
    }
}