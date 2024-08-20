/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio01;

/**
 *
 * @author aluno.den
 */
public abstract class Fisica {
    protected String sexo;
    protected EstadoCivil estadoCivil;
    protected String dataNascimento;

// A função do Gat e Set seria chamar os dados de uma determinada variável e apresenta-la.
    public Fisica(String sexo, EstadoCivil estadoCivil, String dataNascimento) {
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.dataNascimento = dataNascimento;
    }

//O toString serve para apresentar as informações no arquivo principal.
    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
// O toString ele apresenta as informações ordeandas no arquivo principal.
    @Override
    public String toString() {
        return "Fisica{" + "sexo=" + sexo + ", estadoCivil=" + estadoCivil + ", dataNascimento=" + dataNascimento + '}';
    }
    
}
