/*
 * Trabalho de programacao orientado a objetos II
 */
package Unicos;

import Imovel.CasaResidencial;
import Imovel.Imovel;
import Usuario.Cliente;
import Usuario.Corretor;
import Usuario.Usuario;

import java.io.*;
import java.util.ArrayList;

/*
 *
 * Bruno Augusto Furquim
 * Giovanna Silva Custodio
 * Willian Yoshio Murayama
 *
 */
public class Imobiliaria {

    private String nome;
    private String endereco;
    private ArrayList<Aluguel> alugueis;
    private ArrayList<Venda> vendas;
    private ArrayList<Imovel> imoveis;
    private ArrayList<Usuario> corretores;
    private ArrayList<Usuario> clientes;
    private ArrayList<Seguro> seguros;
    private Configuracao configuracoes;

    public Imobiliaria() {
        ArrayList<Aluguel> alugueis = new ArrayList<>();
        ArrayList<Venda> vendas = new ArrayList<>();
        ArrayList<Imovel> imoveis = new ArrayList<>();
        ArrayList<Usuario> corretores = new ArrayList<>();
        ArrayList<Usuario> clientes = new ArrayList<>();
        ArrayList<Seguro> seguros = new ArrayList<>();
    }

    public void carregarArquivos() throws IOException {
        try {
            // carregando alugueis
            FileInputStream inn = new FileInputStream(configuracoes.getArquivoAlugueis());
            ObjectInputStream obj = new ObjectInputStream(inn);
            this.alugueis = (ArrayList<Aluguel>) obj.readObject();
            obj.close();
            inn.close();

            // carregando vendas
            inn = new FileInputStream(configuracoes.getArquivoVendas());
            obj = new ObjectInputStream(inn);
            this.vendas = (ArrayList<Venda>) obj.readObject();
            obj.close();
            inn.close();

            // carregando imoveis
            inn = new FileInputStream(configuracoes.getArquivoImoveis());
            obj = new ObjectInputStream(inn);
            this.imoveis = (ArrayList<Imovel>) obj.readObject();
            obj.close();
            inn.close();

            // carregando clientes
            inn = new FileInputStream(configuracoes.getArquivoClientes());
            obj = new ObjectInputStream(inn);
            this.clientes = (ArrayList<Usuario>) obj.readObject();
            obj.close();
            inn.close();

            // carregando corretores
            inn = new FileInputStream(configuracoes.getArquivoCorretores());
            obj = new ObjectInputStream(inn);
            this.corretores = (ArrayList<Usuario>) obj.readObject();
            obj.close();
            inn.close();

            // carregando seguros
            inn = new FileInputStream(configuracoes.getArquivoSeguros());
            obj = new ObjectInputStream(inn);
            this.seguros = (ArrayList<Seguro>) obj.readObject();
            obj.close();
            inn.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public boolean salvarAlugueis() {
        try {
            FileOutputStream out = new FileOutputStream(configuracoes.getArquivoAlugueis());
            ObjectOutputStream obj = new ObjectOutputStream(out);
            obj.writeObject(this.alugueis);
            obj.close();
            out.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean salvarVendas() {
        try {
            FileOutputStream out = new FileOutputStream(configuracoes.getArquivoVendas());
            ObjectOutputStream obj = new ObjectOutputStream(out);
            obj.writeObject(this.vendas);
            obj.close();
            out.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean salvarImoveis() {
        try {
            FileOutputStream out = new FileOutputStream(configuracoes.getArquivoImoveis());
            ObjectOutputStream obj = new ObjectOutputStream(out);
            obj.writeObject(this.imoveis);
            obj.close();
            out.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean salvarClientes() {
        try {
            FileOutputStream out = new FileOutputStream(configuracoes.getArquivoClientes());
            ObjectOutputStream obj = new ObjectOutputStream(out);
            obj.writeObject(this.clientes);
            obj.close();
            out.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean salvarCorretores() {
        try {
            FileOutputStream out = new FileOutputStream(configuracoes.getArquivoCorretores());
            ObjectOutputStream obj = new ObjectOutputStream(out);
            obj.writeObject(this.corretores);
            obj.close();
            out.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean salvarSeguros() {
        try {
            FileOutputStream out = new FileOutputStream(configuracoes.getArquivoSeguros());
            ObjectOutputStream obj = new ObjectOutputStream(out);
            obj.writeObject(this.seguros);
            obj.close();
            out.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
