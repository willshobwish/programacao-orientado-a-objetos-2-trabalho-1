/*
 * Trabalho de programacao orientado a objetos II
 */
package Unicos;

/*
 *
 * Bruno Augusto Furquim
 * Giovanna Silva Custodio
 * Willian Yoshio Murayama
 *
 */
public final class Configuracao {

//    private static Configuracao instanciaConfiguracao = null;
    private String arquivoAlugueis = "src\\Arquivos\\alugueis.ser";
    private String arquivoVendas = "src\\Arquivos\\vendas.ser";
    private String arquivoImoveis = "src\\Arquivos\\imoveis.ser";
    private String arquivoUsuarios = "src\\Arquivos\\usuarios.ser";
    private String arquivoSeguros = "src\\Arquivos\\seguros.ser";

    public Configuracao() {
    }

//    public static Configuracao getInstanciaConfiguracao() {
//        if (instanciaConfiguracao == null) {
//            instanciaConfiguracao = new Configuracao();
//        }
//        return instanciaConfiguracao;
//    }
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

    public String getArquivoUsuarios() {
        return arquivoUsuarios;
    }

    public void setArquivoUsuarios(String arquivoUsuarios) {
        this.arquivoUsuarios = arquivoUsuarios;
    }

//    }
    public String getArquivoSeguros() {
        return arquivoSeguros;
    }

    public void setArquivoSeguros(String arquivoSeguros) {
        this.arquivoSeguros = arquivoSeguros;
    }
}
