package laboratorios.laboratorio2.funcionarios;

import java.text.DecimalFormat;
import java.util.Locale;

public class Funcionario {
    // Atributos
    private String idFuncionario;
    private String nome;
    private String sobrenome;
    private String cpf;
    private int idade;
    private char sexo;
    private String email;
    private String telefone;

    // Construtor
    public Funcionario(String idFuncionario, String nome, String sobrenome, String cpf, int idade, char sexo, String email, String telefone) {
        this.idFuncionario = idFuncionario;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
        this.email = email;
        this.telefone = telefone;
    }

    // Métodos
    public Double getRendimentos() {
        Locale.setDefault(Locale.US);
        DecimalFormat df = new DecimalFormat("#,###.00");
        return Double.parseDouble(df.format(0.00));
    }

    // Get e Set
    public String getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(String idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
