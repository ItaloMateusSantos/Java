package JavaClass;

import JavaEnum.Setor;
import JavaEnum.Sexo;

public abstract class  Funcionario {
   private String nome;
   private String cpf;
   private String rg;
   private Endereco endereco;
   private Setor setor;
   private Sexo sexo;
   private Double salario;
   private String dataNasccimento; 

//Constructor==================================================
    public Funcionario(String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, Double salario, String dataNasccimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.setor = setor;
        this.sexo = sexo;
        this.salario = salario;
        this.dataNasccimento = dataNasccimento;
    }

// Getter and Sette==================================================
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getDataNasccimento() {
        return dataNasccimento;
    }

    public void setDataNasccimento(String dataNasccimento) {
        this.dataNasccimento = dataNasccimento;
    }

//toString======================================================
    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", endereco=" + endereco + ", setor=" + setor + ", sexo=" + sexo + ", salario=" + salario + ", dataNasccimento=" + dataNasccimento + '}';
    }
     
}
