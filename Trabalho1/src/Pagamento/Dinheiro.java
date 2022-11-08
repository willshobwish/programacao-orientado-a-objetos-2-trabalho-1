/*
 * Giovanna Silva Custodio
 * Willian Yoshio Murayama
 */
package Pagamento;

/**
 *
 * @author Willian
 */

public class Dinheiro extends Pagamento {
    
    public Dinheiro(){
        super("Dinheiro");
    }
    
    @Override
    public String toString(){
        return "\nTipo de Pagamento: " + getTipoPagamento();
    }
}
