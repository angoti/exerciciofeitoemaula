package br.edu.iftm.exerciciofeitoemaula.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.iftm.exerciciofeitoemaula.model.Telefone;

public interface TelefoneRepository extends CrudRepository<Telefone,Integer> {
    
}
