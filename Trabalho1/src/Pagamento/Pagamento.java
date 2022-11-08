/*
 * Giovanna Silva Custodio
 * Willian Yoshio Murayama
 */
package Pagamento;

/**
 *
 * @author Willian
 */

public abstract class Pagamento implements Serializable {
    private String tipoPagamento;
    
    public Pagamento(String tipoPagamento){
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
