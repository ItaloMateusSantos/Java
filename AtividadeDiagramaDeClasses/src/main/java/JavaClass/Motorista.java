package JavaClass;
//@Auto - Italo Mateus

import JavaEnum.Setor;
import JavaEnum.Sexo;

//A classe "Motorista" extende as informações da classe "Funcionário"==

public class Motorista extends Funcionario {
   private String carteiraDeHabilitacao; 

//Constructor==========================================================
    public Motorista(String carteiraDeHabilitacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, Double salario, String dataNasccimento) {
        super(nome, cpf, rg, endereco, setor, sexo, salario, dataNasccimento);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }
//Getter and Setter(Com as informações da classe "Funcionário")========
    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

//toString===============================================================
    @Override
    public String toString() {
        return "Motorista{" + "carteiraDeHabilitacao=" + carteiraDeHabilitacao + '}';
    }   


        
}
