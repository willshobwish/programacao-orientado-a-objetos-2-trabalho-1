/*
 * Trabalho de programacao orientado a objetos II
 */
package Usuario;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
 *
 * Bruno Augusto Furquim
 * Giovanna Silva Custodio
 * Willian Yoshio Murayama
 *
 */
public class Corretor extends Usuario implements Serializable {

    protected String creci;
    protected float salario;
    protected String pis;
    protected LocalDate dataAdmissao;
    protected int numeroVendas = 0;
    protected int numeroAlugueis = 0;

    public Corretor(String creci, float salario, String pis, LocalDate dataAdmissao, int codigoUsuario, String nome,
            String cpf, String rg, LocalDate dataNascimento, String endereco, String cep, String telefone,
            String email) {
        super(codigoUsuario, nome, cpf, rg, dataNascimento, endereco, cep, telefone, email);
        this.creci = creci;
        this.salario = salario;
        this.pis = pis;
        this.dataAdmissao = dataAdmissao;
    }

    public String getCreci() {
        return creci;
    }

    public void setCreci(String creci) {
        this.creci = creci;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getPis() {
        return pis;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public void addVenda() {
        this.numeroVendas++;
    }

    public int getVendas() {
        return numeroVendas;
    }

    public void addAluguel() {
        this.numeroAlugueis++;
    }

    public int getAlugueis() {
        return numeroAlugueis;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCreci: " + this.creci
                + "\nSalario: " + this.salario
                + "\nPis: " + this.pis
                + "\nData de admissao: " + this.dataAdmissao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
