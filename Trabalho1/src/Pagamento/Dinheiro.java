/*
 * Bruno Augusto Furquim
 * Giovanna Silva Custodio
 * Willian Yoshio Murayama
 */
package Pagamento;

import java.io.Serializable;

public class Dinheiro extends Pagamento implements Serializable {

    public Dinheiro() {
        super("Dinheiro");
    }

    @Override
    public String toString() {
        return "\nTipo de Pagamento: " + getTipoPagamento();
    }
}
