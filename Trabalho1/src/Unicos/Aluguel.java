/*
 * Trabalho de programacao orientado a objetos II
 */
package Unicos;

import Imovel.Imovel;
import Pagamento.Pagamento;
import Usuario.Cliente;
import Usuario.Corretor;
import java.time.LocalDate;
import java.util.ArrayList;

/*
 *
 * Bruno Augusto Furquim
 * Giovanna Silva Custodio
 * Willian Yoshio Murayama
 *
 */
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

    public Aluguel(int codigoAluguel, Cliente cliente, Corretor corretor, Imovel imovel, LocalDate dataAluguel,
            LocalDate dataDevolucao, LocalDate dataPagamentoMensal, float valorTotalAluguel, Pagamento formaPagamento,
            ArrayList<Seguro> segurosContratados, boolean pago) {
        this.codigoAluguel = codigoAluguel;
        this.cliente = cliente;
        this.corretor = corretor;
        this.imovel = imovel;
        this.dataAluguel = dataAluguel;
        this.dataDevolucao = dataDevolucao;
        this.dataPagamentoMensal = dataPagamentoMensal;
        this.valorTotalAluguel = valorTotalAluguel;
        this.formaPagamento = formaPagamento;
        this.segurosContratados = segurosContratados;
        this.pago = pago;
    }

    public int getCodigoAluguel() {
        return codigoAluguel;
    }

    public void setCodigoAluguel(int codigoAluguel) {
        this.codigoAluguel = codigoAluguel;
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

    public LocalDate getDataAluguel() {
        return dataAluguel;
    }

    public void setDataAluguel(LocalDate dataAluguel) {
        this.dataAluguel = dataAluguel;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public LocalDate getDataPagamentoMensal() {
        return dataPagamentoMensal;
    }

    public void setDataPagamentoMensal(LocalDate dataPagamentoMensal) {
        this.dataPagamentoMensal = dataPagamentoMensal;
    }

    public float getValorTotalAluguel() {
        return valorTotalAluguel;
    }

    public void setValorTotalAluguel(float valorTotalAluguel) {
        if (valorTotalAluguel > 0) {
            this.valorTotalAluguel = valorTotalAluguel;
        } else {
            System.out.println("Valor total do aluguel não pode ser negativo");
        }
    }

    public Pagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(Pagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public ArrayList<Seguro> getSegurosContratados() {
        return segurosContratados;
    }

    public void setSegurosContratados(ArrayList<Seguro> segurosContratados) {
        this.segurosContratados = segurosContratados;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public float calcularValorTotal() {
        float valorTotal = 0;

        for (Seguro seguro : segurosContratados) {
            valorTotal += seguro.getValor();
        }
        valorTotal += imovel.getValorAluguel();
        return valorTotal;
    }

    public boolean possuiSeguro() {
        return !segurosContratados.isEmpty(); // retorna verdadeiro se houver seguros e falso caso contrario
    }

    public boolean verificarAtraso() {
        return dataPagamentoMensal.isBefore(dataAluguel); // retorna verdadeiro se a data de pagamento mensal for
                                                          // anterior a data do aluguel
    }

    @Override
    public String toString() {
        return "Aluguel [codigoAluguel = " + this.codigoAluguel + ", cliente = " + this.cliente + ", corretor = "
                + this.corretor
                + ", dataAluguel = "
                + this.dataAluguel + ", dataDevolucao = " + this.dataDevolucao + ", dataPagamentoMensal = "
                + this.dataPagamentoMensal
                + ", formaPagamento = " + this.formaPagamento + ", imovel = " + this.imovel + ", pago = " + this.pago
                + ", segurosContratados = "
                + this.segurosContratados + ", valorTotalAluguel = " + this.valorTotalAluguel + "]";
    }
}
