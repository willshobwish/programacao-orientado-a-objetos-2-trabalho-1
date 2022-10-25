/*
 * Giovanna Silva Custodio
 * Willian Yoshio Murayama
 */
package Unicos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Aluguel {

    private int codigoAluguel;
    private Cliente cliente;
    private Corretor corretor;
    private Imovel imovel;
    private LocalDate dataAluguel;
    private LocalDate dataDevolucao;
    private LocalDate dataPagamentoMensal;
    private float valorTotalAluguel;
    private Pagamento formaPagamento;
    private ArrayList<Seguro> segurosContratados;
    private boolean pago;

}
