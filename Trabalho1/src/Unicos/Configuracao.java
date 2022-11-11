/*
 * Trabalho de programacao orientado a objetos II
 */
package Unicos;

import java.io.Serializable;

/*
 *
 * Bruno Augusto Furquim
 * Giovanna Silva Custodio
 * Willian Yoshio Murayama
 *
 */
public final class Configuracao implements Serializable {
    private static Configuracao instanciaConfiguracao = null;
    private String arquivoAlugueis;
    private String arquivoVendas;
    private String arquivoImoveis;
    private String arquivoClientes;
    private String arquivoCorretores;
    private String arquivoSeguros;

    private Configuracao() {
        this.arquivoAlugueis = "src/Arquivos/alugueis.ser";
        this.arquivoVendas = "src/Arquivos/vendas.ser";
        this.arquivoImoveis = "src/Arquivos/imoveis.ser";
        this.arquivoClientes = "src/Arquivos/clientes.ser";
        this.arquivoCorretores = "src/Arquivos/corretores.ser";
        this.arquivoSeguros = "src/Arquivos/seguros.ser";
    }

    public static Configuracao getInstanciaConfiguracao() {
        if (instanciaConfiguracao == null) {
            instanciaConfiguracao = new Configuracao();
        }
        return instanciaConfiguracao;
    }

    public String getArquivoAlugueis() {
        return arquivoAlugueis;
    }

    public void setArquivoAlugueis(String arquivoAlugueis) {
        this.arquivoAlugueis = arquivoAlugueis;
    }

    public String getArquivoVendas() {
        return arquivoVendas;
    }

    public void setArquivoVendas(String arquivoVendas) {
        this.arquivoVendas = arquivoVendas;
    }

    public String getArquivoImoveis() {
        return arquivoImoveis;
    }

    public void setArquivoImoveis(String arquivoImoveis) {
        this.arquivoImoveis = arquivoImoveis;
    }

    public String getArquivoClientes() {
        return arquivoClientes;
    }

    public void setArquivoClientes(String arquivoClientes) {
        this.arquivoClientes = arquivoClientes;
    }

    public String getArquivoCorretores() {
        return arquivoCorretores;
    }

    public void setArquivoCorretores(String arquivoCorretores) {
        this.arquivoCorretores = arquivoCorretores;
    }

    public String getArquivoSeguros() {
        return arquivoSeguros;
    }

    public void setArquivoSeguros(String arquivoSeguros) {
        this.arquivoSeguros = arquivoSeguros;
    }

}
