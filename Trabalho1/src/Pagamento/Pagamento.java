/*
 * Bruno Augusto Furquim
 * Giovanna Silva Custodio
 * Willian Yoshio Murayama
 */
package Pagamento;

public abstract class Pagamento {

    private String tipoPagamento;

    public Pagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public abstract String toString();

}
