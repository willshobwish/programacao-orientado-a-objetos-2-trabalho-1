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
public class CasaResidencial extends Imovel implements Serializable {

    public CasaResidencial(int codigoImovel, String endereco, LocalDate dataConstrucao, float areaTotal, float areaConstruida, int qtdDormitorios, int qtdBanheiros, int qtdVagasGaragem, float valorIPTU, float valorVenda, float valorAluguel) {
        super(codigoImovel, endereco, dataConstrucao, areaTotal, areaConstruida, qtdDormitorios, qtdBanheiros, qtdVagasGaragem, valorIPTU, valorVenda, valorAluguel);
    }

    @Override
    public String toString() {
        return "Tipo do imovel: Casa residencial\n" + super.toString();
    }
}
