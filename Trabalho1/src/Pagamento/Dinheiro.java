/*
 * Bruno Augusto Furquim
 * Giovanna Silva Custodio
 * Willian Yoshio Murayama
 */
package Pagamento;

public class Dinheiro extends Pagamento {

    public Dinheiro() {
        super("Dinheiro");
    }

    @Override
    public String toString() {
        return "\nTipo de Pagamento: " + getTipoPagamento();
    }
}
