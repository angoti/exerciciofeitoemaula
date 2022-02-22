package br.edu.iftm.exerciciofeitoemaula.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.iftm.exerciciofeitoemaula.model.Pessoa;

public interface PessoaRepository extends CrudRepository<Pessoa,Integer> {
    
}
