/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author marlo
 */
public class Atleta {
    
    private int idAtleta;
    private String nome;
    private String equipe;
    private String cidade;
    private String estado;

    public Atleta() {
    }

    public Atleta(int idAtleta, String nome, String equipe, String cidade, String estado) {
        this.idAtleta = idAtleta;
        this.nome = nome;
        this.equipe = equipe;
        this.cidade = cidade;
        this.estado = estado;
    }

    public int getIdAtleta() {
        return idAtleta;
    }

    public void setIdAtleta(int idAtleta) {
        this.idAtleta = idAtleta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
