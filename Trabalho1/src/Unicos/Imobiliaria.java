/*
 * Trabalho de programacao orientado a objetos II
 */
package Unicos;

import Imovel.ApartamentoResidencial;
import Imovel.CasaResidencial;
import Imovel.Comercial;
import Imovel.Imovel;
import Usuario.Cliente;
import Usuario.Corretor;
import Usuario.Usuario;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
    private ArrayList<Aluguel> alugueis = new ArrayList<Aluguel>();
    private ArrayList<Venda> vendas = new ArrayList<Venda>();
    private ArrayList<Imovel> imoveis = new ArrayList<Imovel>();
    private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    private ArrayList<Seguro> seguros = new ArrayList<Seguro>();
    private Configuracao configuracoes = new Configuracao();

    public Imobiliaria(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        carregarAlugueis();
        carregarImoveis();
        carregarSeguros();
        carregarUsuarios();
        carregarVendas();
        // Criacao de objetos para teste
//        if (imoveis.size() == 0) {
//            imoveis.add(new CasaResidencial(0, "Rua de teste de casa residencial", LocalDate.parse("1998-08-12"), 200,
//                    150, 2, 1, 2,
//                    100, 200, 300));
//            imoveis.add(new Comercial(100, 1, "Rua de teste de comercial", LocalDate.parse("1999-09-22"), 300, 250, 2,
//                    2, 10, 300,
//                    500, 600));
//            imoveis.add(new ApartamentoResidencial(20, 300, 2, "Rua de teste de apartamento residencial",
//                    LocalDate.parse("1898-07-17"), 400, 300, 4, 2, 4, 400, 600, 200));
//        }
//        if (usuarios.size() == 0) {
//            usuarios.add(new Cliente(LocalDate.now(), 0, "Cliente de teste", "328.432.432-32", "421.321.321-48",
//                    LocalDate.parse("2022-09-13"), "Rua de teste cliente teste", "19015-832", "(18) 92894-2382",
//                    "emailteste@email.com.br"));
//            usuarios.add(new Corretor("93402843", 300, "489327", LocalDate.parse("2021-09-10"), 1, "Corretor teste",
//                    "983.324.234-23", "324.432.543-54", LocalDate.parse("2000-09-12"), "Rua de teste corretor",
//                    "32983-343", "(18) 90382-3242", "emailcorretor@email.com.br"));
//        }
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
        return usuarios;
    }

    public ArrayList<Corretor> getCorretores() {
        ArrayList<Corretor> corretores = new ArrayList<Corretor>();
        for (Usuario usuario : usuarios) {
            if (usuario instanceof Corretor) {
                corretores.add((Corretor) usuario);
            }
        }
        return corretores;
    }

    public ArrayList<Cliente> getClientes() {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        for (Usuario usuario : usuarios) {
            if (usuario instanceof Cliente) {
                clientes.add((Cliente) usuario);
            }
        }
        return clientes;
    }

    public ArrayList<Aluguel> getAlugueis() {
        return alugueis;
    }

    public void setAlugueis(ArrayList<Aluguel> alugueis) {
        this.alugueis = alugueis;
    }

    public ArrayList<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(ArrayList<Venda> vendas) {
        this.vendas = vendas;
    }

    public ArrayList<Seguro> getSeguros() {
        return seguros;
    }

    public void setSeguros(ArrayList<Seguro> seguros) {
        this.seguros = seguros;
    }

    public void carregarSeguros() {
        try {
            FileInputStream Filename = new FileInputStream(configuracoes.getArquivoSeguros());
            ObjectInputStream LoadObject = new ObjectInputStream(Filename);
            seguros = (ArrayList<Seguro>) LoadObject.readObject();
            if (seguros == null) {
                seguros = new ArrayList<>();
            }
            LoadObject.close();
            Filename.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void carregarImoveis() {
        try {
            FileInputStream Filename = new FileInputStream(configuracoes.getArquivoImoveis());
            ObjectInputStream LoadObject = new ObjectInputStream(Filename);
            imoveis = (ArrayList<Imovel>) LoadObject.readObject();
            if (imoveis == null) {
                imoveis = new ArrayList<Imovel>();
            }
            LoadObject.close();
            Filename.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void carregarVendas() {
        try {
            FileInputStream Filename = new FileInputStream(configuracoes.getArquivoVendas());
            ObjectInputStream LoadObject = new ObjectInputStream(Filename);
            vendas = (ArrayList<Venda>) LoadObject.readObject();
            if (vendas == null) {
                vendas = new ArrayList<Venda>();
            }
            LoadObject.close();
            Filename.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void carregarAlugueis() {
        try {
            FileInputStream Filename = new FileInputStream(configuracoes.getArquivoAlugueis());
            ObjectInputStream LoadObject = new ObjectInputStream(Filename);
            alugueis = (ArrayList<Aluguel>) LoadObject.readObject();
            if (alugueis == null) {
                alugueis = new ArrayList<Aluguel>();
            }
            LoadObject.close();
            Filename.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void carregarUsuarios() {
        try {
            FileInputStream Filename = new FileInputStream(configuracoes.getArquivoUsuarios());
            ObjectInputStream LoadObject = new ObjectInputStream(Filename);
            usuarios = (ArrayList<Usuario>) LoadObject.readObject();
            if (usuarios == null) {
                usuarios = new ArrayList<Usuario>();
            }
            LoadObject.close();
            Filename.close();
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
            obj.writeObject(vendas);
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
            obj.writeObject(imoveis);
            obj.close();
            out.close();
            System.out.println("Imoveis salvo");
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean salvarUsuarios() {
        try {
            FileOutputStream out = new FileOutputStream(configuracoes.getArquivoUsuarios());
            ObjectOutputStream obj = new ObjectOutputStream(out);
            obj.writeObject(usuarios);
            obj.close();
            return true;
        } catch (Exception e) {
            System.out.println(e);
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

    // public boolean salvarArquivos() {
    // if (salvarAlugueis() && salvarVendas() && salvarImoveis() && salvarUsuarios()
    // && salvarSeguros()) {
    // return true;
    // } else {
    // return false;
    // }
    // }
    public Usuario buscarCorretor(int codigo) {
        try {
            for (Usuario corretor : usuarios) {
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

    public void cadastrarCliente(Cliente cliente) {
        usuarios.add(cliente);
        salvarUsuarios();
        System.out.println("Cliente cadastrado");
    }

    public Usuario buscarCliente(int codigo) {
        try {
            for (Usuario cliente : usuarios) {
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

    public void CadastroLocacao(Aluguel Alguel) {
        alugueis.add(Alguel);
        salvarAlugueis();
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

    public void cadastrarCorretor(Corretor corretor) {
        usuarios.add(corretor);
        salvarUsuarios();
        System.out.println("Corretor cadastrado");
    }

    public boolean cadastrarImovel(Imovel imovel) {
        try {
            if (buscarImovel(imovel.getCodigoImovel()) == null) {
                imoveis.add(imovel);
                salvarImoveis();
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

    // Comercial
    public void CadastrarComercial(Comercial Comercial) {
        imoveis.add(Comercial);
        System.out.println(Comercial.toString());
        salvarImoveis();
    }

    // Apartamento residencial
    public void CadastrarApartamentoResidencial(ApartamentoResidencial Apartamento) {
        imoveis.add(Apartamento);
        System.out.println(Apartamento.toString());
        salvarImoveis();
    }

    public boolean adicionarCasaResidencial(CasaResidencial CasaResidencial) {
        // try {
        // if (buscarImovel(CasaResidencial.getCodigoImovel()) == null) {
        // imoveis.add(CasaResidencial);
        // salvarImoveis();
        // return true;
        // } else {
        // System.out.println("CasaResidencial ja cadastrado");
        // return false;
        // }
        // } catch (Exception e) {
        // return false;
        // }
        imoveis.add(CasaResidencial);
        salvarImoveis();
        return true;
    }

    // Vendas
    public void CadastrarVenda(Venda Venda) {
        vendas.add(Venda);
        System.out.println(Venda.toString());
        salvarVendas();
    }

    // Algueis
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

    // Seguro
    public void CadastrarSeguro(Seguro Seguro) {
        seguros.add(Seguro);
        salvarSeguros();
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
}
