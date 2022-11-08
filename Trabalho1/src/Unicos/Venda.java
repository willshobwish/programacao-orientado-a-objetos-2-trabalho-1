/*
 * Trabalho de programacao orientado a objetos II
 */
package Unicos;

import Imovel.Imovel;
import Pagamento.Pagamento;
import Usuario.Cliente;
import Usuario.Corretor;
import java.time.LocalDate;

/*
 *
 * Bruno Augusto Furquim
 * Giovanna Silva Custodio
 * Willian Yoshio Murayama
 *
 */
public class Venda {

    private int codigoVenda;
    private Cliente cliente;
    private Corretor corretor;
    private Imovel imovel;
    private LocalDate dataVenda;
    private float valorTotalVenda;
    private Pagamento formaPagamento;

    public Venda(int codigoVenda, Cliente cliente, Corretor corretor, Imovel imovel, LocalDate dataVenda,
            float valorTotalVenda, Pagamento formaPagamento) {
        this.codigoVenda = codigoVenda;
        this.cliente = cliente;
        this.corretor = corretor;
        this.imovel = imovel;
        this.dataVenda = dataVenda;
        this.valorTotalVenda = valorTotalVenda;
        this.formaPagamento = formaPagamento;
    }

    public int getCodigoVenda() {
        return codigoVenda;
    }

    public void setCodigoVenda(int codigoVenda) {
        this.codigoVenda = codigoVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Corretor getCorretor() {
        return corretor;
    }

    public void setCorretor(Corretor corretor) {
        this.corretor = corretor;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    public float getValorTotalVenda() {
        return valorTotalVenda;
    }

    public void setValorTotalVenda(float valorTotalVenda) {
        if (valorTotalVenda > 0) {
            this.valorTotalVenda = valorTotalVenda;
        }
    }

    public Pagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(Pagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    @Override
    public String toString() {
        return "\nCodigo da venda: " + this.codigoVenda + "\nCliente: " + this.cliente.getNome() + " \nCorretor: "
                + this.corretor.getNome() + "\nImovel: " + this.imovel.toString() + "\nData da venda: "
                + this.dataVenda + "\nValor total da venda: " + this.valorTotalVenda + "\nForma de pagamento: "
                + this.formaPagamento.getTipoPagamento();
    }

}
