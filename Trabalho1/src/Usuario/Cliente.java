/*
 * Trabalho de programacao orientado a objetos II
 */
package Usuario;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import Imovel.Imovel;

/*
 *
 * Bruno Augusto Furquim
 * Giovanna Silva Custodio
 * Willian Yoshio Murayama
 *
 */
public class Cliente extends Usuario implements Serializable {

    protected LocalDate dataCadastro;
    protected ArrayList<Imovel> imoveisComprados;

    public Cliente(LocalDate dataCadastro, int codigoUsuario, String nome, String cpf, String rg,
            LocalDate dataNascimento, String endereco, String cep, String telefone, String email) {
        super(codigoUsuario, nome, cpf, rg, dataNascimento, endereco, cep, telefone, email);
        this.dataCadastro = dataCadastro;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public void comprarImovel(Imovel i) {
        imoveisComprados.add(i);
    }

    public ArrayList<Imovel> getImoveisComprados() {
        return imoveisComprados;
    }

    @Override
    public String toString() {
        return super.toString() + "\nData de cadastro: "
                + this.dataCadastro.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
