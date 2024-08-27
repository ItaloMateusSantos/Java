package JavaEnum;

public enum Sexo {
   MARCULINO('M', "MASCULINO"),
   FEMINIMO('F', "FEMININO");
   
   private char caracter;
   private String nome;

//Constructor===============================================
    private Sexo(char caracter, String nome) {
        this.caracter = caracter;
        this.nome = nome;
    }

//Getter====================================================
    public char getCaracter() {
        return caracter;
    }

    public String getNome() {
        return nome;
    }

 
   
}


