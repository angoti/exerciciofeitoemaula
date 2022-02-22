package br.edu.iftm.exerciciofeitoemaula.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Telefone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String tipo;
    private Integer numero;

    @ManyToOne
    private Pessoa pessoa;

    public Telefone() {
    }

    public Telefone(Integer id, String tipo, Integer numero, Pessoa pessoa) {
        this.id = id;
        this.tipo = tipo;
        this.numero = numero;
        this.pessoa = pessoa;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getNumero() {
        return this.numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Pessoa getPessoa() {
        return this.pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", tipo='" + getTipo() + "'" +
            ", numero='" + getNumero() + "'" +
            ", pessoa='" + getPessoa() + "'" +
            "}";
    }

}
