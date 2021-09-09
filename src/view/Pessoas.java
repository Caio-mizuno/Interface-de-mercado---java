package view;
import java.util.Calendar;
public abstract class  Pessoas implements InterfacePessoa {
//ATRIBUTOS ---------------------------------------------------------------
    private String nome;
    private String cpf;
    private int altura, idade;
    private String sexo;
    private String telefone;
    private String endereco;
    
//------------------------------------------------------------------------------

    
//-------------------------------------------------------------------------
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public int getAltura() {
        return altura;
    }

    public String getSexo() {
        return sexo;
    }


    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }
//------------------------------------------------------------------------------
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

      public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
//------------------------------------------------------------------------------

}

