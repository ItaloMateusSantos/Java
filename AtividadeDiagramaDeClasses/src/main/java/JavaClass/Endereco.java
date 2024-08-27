package JavaClass;

public class Endereco {
    private String logradouro;
    private String numero;
    private String complemento;
    private String cep;
    private String cidade;
    private UnidadeFederativa uf;
//Constructor============================================================================
    public Endereco(String logradouro, String numero, String complemento, String cep, String cidade, UnidadeFederativa uf) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
    }
//Getter and Setter===========================================================================
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public UnidadeFederativa getUf() {
        return uf;
    }

    public void setUf(UnidadeFederativa uf) {
        this.uf = uf;
    }
//toString()==============================================================================
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Endereco{");
        sb.append("logradouro=").append(logradouro);
        sb.append(", numero=").append(numero);
        sb.append(", complemento=").append(complemento);
        sb.append(", cep=").append(cep);
        sb.append(", cidade=").append(cidade);
        sb.append(", uf=").append(uf);
        sb.append('}');
        return sb.toString();
    }
   
}
