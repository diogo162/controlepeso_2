package br.upe.aula.controlepeso.repositorio;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.upe.aula.controlepeso.entidade.peso;


@Repository
public interface PesoRepositorio extends JpaRepository<peso, Long>{
    
    public Optional<peso> findFirstByUsuarioEmailOrderbyDataDesc(String email);
}
