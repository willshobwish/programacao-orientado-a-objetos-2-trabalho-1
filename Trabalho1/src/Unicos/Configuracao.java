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
    private final String arquivoAlugueis = "src\\Arquivos\\alugueis.ser";
    private final String arquivoVendas = "src\\Arquivos\\vendas.ser";
    private final String arquivoImoveis = "src\\Arquivos\\imoveis.ser";
    private final String arquivoUsuarios = "src\\Arquivos\\usuarios.ser";
    private final String arquivoSeguros = "src\\Arquivos\\seguros.ser";

    public Configuracao() {
    }

    public String getArquivoAlugueis() {
        return arquivoAlugueis;
    }

    public String getArquivoVendas() {
        return arquivoVendas;
    }

    public String getArquivoImoveis() {
        return arquivoImoveis;
    }

    public String getArquivoUsuarios() {
        return arquivoUsuarios;
    }

    public String getArquivoSeguros() {
        return arquivoSeguros;
    }
}
