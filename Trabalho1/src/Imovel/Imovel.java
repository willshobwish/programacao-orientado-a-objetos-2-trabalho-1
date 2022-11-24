/*
 * Trabalho de programacao orientado a objetos II
 */
package Imovel;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
 *
 * Bruno Augusto Furquim
 * Giovanna Silva Custodio
 * Willian Yoshio Murayama
 *
 */
abstract public class Imovel implements Serializable {

    protected int codigoImovel;
    protected String endereco;
    protected LocalDate dataConstrucao;
    protected float areaTotal;
    protected float areaConstruida;
    protected int qtdDormitorios;
    protected int qtdBanheiros;
    protected int qtdVagasGaragem;
    protected float valorIPTU;
    protected float valorVenda;
    protected float valorAluguel;
    protected boolean disponivel = true;

    public Imovel(int codigoImovel, String endereco, LocalDate dataConstrucao, float areaTotal, float areaConstruida,
            int qtdDormitorios, int qtdBanheiros, int qtdVagasGaragem, float valorIPTU, float valorVenda,
            float valorAluguel) {
        this.codigoImovel = codigoImovel;
        this.endereco = endereco;
        this.dataConstrucao = dataConstrucao;
        this.areaTotal = areaTotal;
        this.areaConstruida = areaConstruida;
        this.qtdDormitorios = qtdDormitorios;
        this.qtdBanheiros = qtdBanheiros;
        this.qtdVagasGaragem = qtdVagasGaragem;
        this.valorIPTU = valorIPTU;
        this.valorVenda = valorVenda;
        this.valorAluguel = valorAluguel;
    }

    public int getCodigoImovel() {
        return codigoImovel;
    }

    public void setCodigoImovel(int codigoImovel) {
        this.codigoImovel = codigoImovel;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public LocalDate getDataConstrucao() {
        return dataConstrucao;
    }

    public void setDataConstrucao(LocalDate dataConstrucao) {
        this.dataConstrucao = dataConstrucao;
    }

    public float getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(float areaTotal) {
        this.areaTotal = areaTotal;
    }

    public float getAreaConstruida() {
        return areaConstruida;
    }

    public void setAreaConstruida(float areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    public int getQtdDormitorios() {
        return qtdDormitorios;
    }

    public void setQtdDormitorios(int qtdDormitorios) {
        this.qtdDormitorios = qtdDormitorios;
    }

    public int getQtdBanheiros() {
        return qtdBanheiros;
    }

    public void setQtdBanheiros(int qtdBanheiros) {
        this.qtdBanheiros = qtdBanheiros;
    }

    public int getQtdVagasGaragem() {
        return qtdVagasGaragem;
    }

    public void setQtdVagasGaragem(int qtdVagasGaragem) {
        this.qtdVagasGaragem = qtdVagasGaragem;
    }

    public float getValorIPTU() {
        return valorIPTU;
    }

    public void setValorIPTU(float valorIPTU) {
        this.valorIPTU = valorIPTU;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }

    public float getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(float valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public void setDisponibilidade() {
        if (disponivel) {
            disponivel = false;
        } else {
            disponivel = true;
        }
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public String toString() {
        return "Codigo do imovel: " + this.codigoImovel
                + "\nEndereco: " + this.endereco
                + "\nData de construcao: " + this.dataConstrucao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                + "\nArea total: " + this.areaTotal
                + "\nArea construida: " + this.areaConstruida
                + "\nQuantidade de dormitorios: " + this.qtdDormitorios
                + "\nQuantidade de banheiros: " + this.qtdBanheiros
                + "\nQuantidade de vagas na garagem: " + this.qtdVagasGaragem
                + "\nValor do IPTU: " + this.valorIPTU
                + "\nValor de venda: " + this.valorVenda
                + "\nValor de aluguel: " + this.valorAluguel;
    }
}
