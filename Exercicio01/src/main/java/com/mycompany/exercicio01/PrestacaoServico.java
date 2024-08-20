/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio01;

/**
 *
 * @author aluno.den
 */
public class PrestacaoServico {
    private String contratoInicio;
    private String contratoFim;

    public PrestacaoServico() {
    }

    public PrestacaoServico(String contratoInicio, String contratoFim) {
        this.contratoInicio = contratoInicio;
        this.contratoFim = contratoFim;
    }


    public String getContratoInicio() {
        return contratoInicio;
    }

    public void setContratoInicio(String contratoInicio) {
        this.contratoInicio = contratoInicio;
    }

    public String getContratoFim() {
        return contratoFim;
    }

    public void setContratoFim(String contratoFim) {
        this.contratoFim = contratoFim;
    }
    
     @Override
    public String toString() {
        return "\nPrestação de Servico" + 
               "\nInicio de contrato: " + contratoInicio + 
               "\nFim de contrato: " + contratoFim + '}';
    }
      
}
