/*
 * Trabalho de programacao orientado a objetos II
 */
package Usuario;

import java.time.LocalDate;

/*
 *
 * Bruno Augusto Furquim
 * Giovanna Silva Custodio
 * Willian Yoshio Murayama
 *
 */
abstract public class Usuario {

    protected int codigoUsuario;
    protected String nome;
    protected String cpf;
    protected String rg;
    protected LocalDate dataNascimento;
    protected String endereco;
    protected String cep;
    protected String telefone;
    protected String email;

    public Usuario(int codigoUsuario, String nome, String cpf, String rg, LocalDate dataNascimento, String endereco,
            String cep, String telefone, String email) {
        this.codigoUsuario = codigoUsuario;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.cep = cep;
        this.telefone = telefone;
        this.email = email;
    }

    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

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
        if (cpf.length() == 11) {
            this.cpf = cpf;
        } else {
            System.out.println("CPF invalido");
        }
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        if (rg.length() == 9) {
            this.rg = rg;
        } else {
            System.out.println("RG invalido");
        }
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        if (cep.length() == 8) {
            this.cep = cep;
        } else {
            System.out.println("CEP invalido");
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (telefone.length() == 11) {
            this.telefone = telefone;
        } else {
            System.out.println("Telefone invalido");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Codigo: " + this.codigoUsuario +
                "\nNome: " + this.nome +
                "\nCPF: " + this.cpf +
                "\nRG: " + this.rg +
                "\nData de Nascimento: " + this.dataNascimento +
                "\nEndereco: " + this.endereco +
                "\nCEP: " + this.cep +
                "\nTelefone: " + this.telefone +
                "\nEmail: " + this.email;
    }

}
