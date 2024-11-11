package br.insper.provafinal.conhecimento;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
public class Conhecimento {

    @Id
    private String id;

    private String titulo;

    private String areaConhecimento;

    private String descricao;

    private String autor;
}
