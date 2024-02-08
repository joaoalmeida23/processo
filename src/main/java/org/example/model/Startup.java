package org.example.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;


@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Startup {

    private String nome;
    private String problemaASerSolucionado;
    private String publicoAlvo;
    private String tecnologiasRelevantes;

}