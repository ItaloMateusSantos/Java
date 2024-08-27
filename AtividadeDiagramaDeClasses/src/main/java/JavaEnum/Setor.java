package JavaEnum;

public enum Setor {
    ENGENHARIA("Engenharia"),
    JURIDICO("Juridico"),
    RECURSOS_HUMANOS("Recurso Humanos"),
    MARKETING("Marketing"),
    OPERACOES("Operações");
    
    private final String nome;

//Constructor============================================
    private Setor(String nome) {
        this.nome = nome;
    }
    
//Getter==================================================
    public String getNome() {
        return nome;
    }
    
    
}
