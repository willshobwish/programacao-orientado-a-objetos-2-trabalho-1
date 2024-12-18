/*
 * Trabalho de programacao orientado a objetos II
 */
package Imovel;

import java.io.Serializable;
import java.time.LocalDate;

/*
 *
 * Bruno Augusto Furquim
 * Giovanna Silva Custodio
 * Willian Yoshio Murayama
 *
 */
public class ApartamentoResidencial extends Imovel implements Serializable {

    protected int andar;
    protected float valorCondominio;

    public ApartamentoResidencial(int andar, float valorCondominio, int codigoImovel, String endereco,
            LocalDate dataConstrucao, float areaTotal, float areaConstruida, int qtdDormitorios, int qtdBanheiros,
            int qtdVagasGaragem, float valorIPTU, float valorVenda, float valorAluguel) {
        super(codigoImovel, endereco, dataConstrucao, areaTotal, areaConstruida, qtdDormitorios, qtdBanheiros,
                qtdVagasGaragem, valorIPTU, valorVenda, valorAluguel);
        this.andar = andar;
        this.valorCondominio = valorCondominio;
    }

    @Override
    public float getValorAluguel() {
        return valorAluguel += valorCondominio;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public float getValorCondominio() {
        return valorCondominio;
    }

    public void setValorCondominio(float valorCondominio) {
        this.valorCondominio = valorCondominio;
    }

    @Override
    public String toString() {
        return "Tipo do imovel: Apartamento residencial\n" + super.toString()
                + "\nAndar: " + andar + "\n"
                + "Valor do condominio: R$ " + valorCondominio
                + "\n-----------------------------------------------------------------\n";
    }
}
