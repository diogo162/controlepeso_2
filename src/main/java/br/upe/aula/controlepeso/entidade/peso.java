package br.upe.aula.controlepeso.entidade;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Gen;
import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;eratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data

public class Peso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double peso;
    @NotNull(message = "Informe o seu peso atual")
    private Double pesoInicial;
    @NotNull(message = ("Insira um peso desejado"))
    private Double pesoDesejado;

    private double pesoAtual;
    private String pesoClassificação;
    private double pesoComparativo;
    private double pesoHistórico;
    private LocalDate dataInicial;

    @ManyToOne
    @JsonIgnore
    private Usuario usuario;
}
