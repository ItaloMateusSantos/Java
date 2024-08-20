/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio01;

/**
 *
 * @author aluno.den
 */
public abstract class Pessoa {
    private String nome;
    private String telefone;
    private String email;
    private Endereco endereco;

//A função do construtor seria denominar e classicar um tipo de "variável" ou classe.
    public Pessoa(String nome, String telefone, String email, Endereco endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

// A função do Gat e Set seria chamar os dados de uma determinada variável e apresenta-la.    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
//O toString serve para apresentar as informações no arquivo principal. 
    @Override
    public String toString() {
        return "\nDados pessoa física: " +
               "\nNome: " + nome + 
               "\nTelefone: " + telefone + 
               "\nEmail: " + email + 
               "\nEndereco: " + endereco + '}';
    }
       
}
