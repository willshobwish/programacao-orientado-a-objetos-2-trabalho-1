/*
 * Trabalho de programacao orientado a objetos II
 */
package Unicos;

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

    public Imobiliaria(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        ArrayList<Aluguel> alugueis = new ArrayList<>();
        ArrayList<Venda> vendas = new ArrayList<>();
        ArrayList<Imovel> imoveis = new ArrayList<>();
        ArrayList<Usuario> corretores = new ArrayList<>();
        ArrayList<Usuario> clientes = new ArrayList<>();
        ArrayList<Seguro> seguros = new ArrayList<>();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public ArrayList<Imovel> getImoveis() {
        return this.imoveis;
    }

    public ArrayList<Usuario> getUsuarios() {
        ArrayList<Usuario> usuarios = new ArrayList<>();

        for (Usuario cli : this.clientes) {
            usuarios.add(cli);
        }

        for (Usuario cor : this.corretores) {
            usuarios.add(cor);
        }

        return usuarios;
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

    public boolean salvarArquivos() {
        if (salvarAlugueis() && salvarVendas() && salvarImoveis() && salvarClientes() && salvarCorretores()
                && salvarSeguros()) {
            return true;
        } else {
            return false;
        }
    }

    public Usuario buscarCorretor(int codigo) {
        try {
            for (Usuario corretor : corretores) {
                if (corretor.getCodigoUsuario() == codigo) {
                    return (Corretor) corretor;
                }
            }
            System.out.println("Corretor não encontrado");
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    public Usuario buscarCliente(int codigo) {
        try {
            for (Usuario cliente : clientes) {
                if (cliente.getCodigoUsuario() == codigo) {
                    return (Cliente) cliente;
                }
            }
            System.out.println("Cliente não encontrado");
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    public Venda buscarVenda(int codigo) {
        try {
            for (Venda venda : vendas) {
                if (venda.getCodigoVenda() == codigo) {
                    return venda;
                }
            }
            System.out.println("Venda não encontrada");
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    public Aluguel buscarAluguel(int codigo) {
        try {
            for (Aluguel aluguel : alugueis) {
                if (aluguel.getCodigoAluguel() == codigo) {
                    return aluguel;
                }
            }
            System.out.println("Aluguel não encontrado");
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    public Imovel buscarImovel(int codigo) {
        try {
            for (Imovel imovel : imoveis) {
                if (imovel.getCodigoImovel() == codigo) {
                    return imovel;
                }
            }
            System.out.println("Imóvel não encontrado");
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    public Seguro buscarSeguro(int codigo) {
        try {
            for (Seguro seguro : seguros) {
                if (seguro.getCodigoSeguro() == codigo) {
                    return seguro;
                }
            }
            System.out.println("Seguro não encontrado");
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    public boolean cadastrarCorretor(Corretor corretor) {
        try {
            if (buscarCorretor(corretor.getCodigoUsuario()) == null) {
                corretores.add(corretor);
                return true;
            } else {
                System.out.println("Corretor já cadastrado");
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public boolean cadastrarCliente(Cliente cliente) {
        try {
            if (buscarCliente(cliente.getCodigoUsuario()) == null) {
                clientes.add(cliente);
                return true;
            } else {
                System.out.println("Cliente já cadastrado");
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public boolean cadastrarImovel(Imovel imovel) {
        try {
            if (buscarImovel(imovel.getCodigoImovel()) == null) {
                imoveis.add(imovel);
                return true;
            } else {
                System.out.println("Imóvel já cadastrado");
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public boolean cadastrarSeguros(Seguro seguro) {
        try {
            if (buscarSeguro(seguro.getCodigoSeguro()) == null) {
                seguros.add(seguro);
                return true;
            } else {
                System.out.println("Seguro já cadastrado");
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public boolean adicionarCasaResidencial(Imovel imovel) {
        try {
            if (buscarImovel(imovel.getCodigoImovel()) == null) {
                imoveis.add(imovel);
                return true;
            } else {
                System.out.println("Imovel ja cadastrado");
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
}
