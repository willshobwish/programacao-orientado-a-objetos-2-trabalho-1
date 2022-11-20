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
public class Comercial extends Imovel implements Serializable {

    protected float taxaImpostoFederal;

    public Comercial(float taxaImpostoFederal, int codigoImovel, String endereco, LocalDate dataConstrucao,
            float areaTotal, float areaConstruida, int qtdDormitorios, int qtdBanheiros, int qtdVagasGaragem,
            float valorIPTU, float valorVenda, float valorAluguel) {
        super(codigoImovel, endereco, dataConstrucao, areaTotal, areaConstruida, qtdDormitorios, qtdBanheiros,
                qtdVagasGaragem, valorIPTU, valorVenda, valorAluguel);
        this.taxaImpostoFederal = taxaImpostoFederal;
    }

    @Override
    public float getValorAluguel() {
        return valorAluguel += valorAluguel * taxaImpostoFederal;
    }

    public float getTaxaImpostoFederal() {
        return taxaImpostoFederal;
    }

    public void setTaxaImpostoFederal(float taxaImpostoFederal) {
        this.taxaImpostoFederal = taxaImpostoFederal;
    }

    @Override
    public String toString() {
        return "Tipo do imovel: Comercial\n" + super.toString()
                + "\nTaxa de imposto federal: " + this.taxaImpostoFederal
                + "\n-----------------------------------------------------------------\n";
    }
}
