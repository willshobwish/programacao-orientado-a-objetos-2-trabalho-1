/*
 * Trabalho de programacao orientado a objetos II
 */
package Controlador;

import Imovel.CasaResidencial;
import Imovel.Imovel;
import Unicos.Aluguel;
import Unicos.Imobiliaria;
import Unicos.Seguro;
import Unicos.Venda;
import Usuario.Cliente;
import Usuario.Corretor;
import Usuario.Usuario;
import java.time.LocalDate;
import java.util.ArrayList;

/*
 *
 * Bruno Augusto Furquim
 * Giovanna Silva Custodio
 * Willian Yoshio Murayama
 *
 */
public class Controlador {
    // Nao sei se eh necessario ser static, uma vez que esta na classe e nao no
    // construtor

    private static ArrayList<Venda> Venda = new ArrayList<>();
    private static ArrayList<Imovel> Imovel = new ArrayList<>();
    private static ArrayList<Usuario> Usuario = new ArrayList<>();
    private static ArrayList<Seguro> Seguro = new ArrayList<>();
    private static ArrayList<Aluguel> Aluguel = new ArrayList<>();
    private static Imobiliaria Imobiliaria = new Imobiliaria("Teste", "Endereco teste");

    public Controlador() {
        // Imobiliaria = new Imobiliaria("Teste", "Endereco teste", Aluguel, Venda,
        // Imovel, Usuario, Seguro, null);
    }

    public String toString() {
        return """
                Controlador inicializado:
                Imobiliaria:
                Nome: %s
                Endereco: %s
                """.formatted(Imobiliaria.getNome(), Imobiliaria.getEndereco());
    }

    // Clientes
    public void adicionarCliente(LocalDate Data, int CodigoUsuario, String NomeCliente, String cpf, String rg,
            LocalDate DataNascimento, String endereco, String cep, String telefone, String email) {
        Cliente Cliente = new Cliente(Data, CodigoUsuario, NomeCliente, cpf, rg, DataNascimento, endereco, cep,
                telefone, email);
        Imobiliaria.cadastrarCliente(Cliente);
        System.out.println(Cliente.toString());
    }

    public String mostrarClientes() {
        boolean existe = false;
        String Dados = "Clientes cadastrados:\n";
        ArrayList<Usuario> Usuarios = Imobiliaria.getUsuarios();
        for (Usuario U : Usuarios) {
            if (U instanceof Cliente) {
                existe = true;
                Dados = Dados + U.toString() + "\n-----------------------\n";
            }
        }
        if (!existe) {
            return Dados = Dados + "Nenhum cliente cadastrado";
        }
        System.out.println("Mostrar usuarios acionado");
        return Dados;
    }

    // Corretores
    public void adicionarCorretores(String creci, float salario, String pis, int codigoUsuario, String nome,
            String cpf, String rg, LocalDate DataNascimento, LocalDate dataAdmissao, String endereco, String cep,
            String telefone, String email) {
        Corretor Corretor = new Corretor(creci, salario, pis, dataAdmissao, codigoUsuario, nome, cpf, rg,
                DataNascimento, endereco, cep, telefone, email);
        Imobiliaria.cadastrarCorretor(Corretor);
    }

    public String mostrarCorretores() {
        boolean existe = false;
        String Dados = "Corretores cadastrados:\n";
        ArrayList<Usuario> Usuarios = Imobiliaria.getUsuarios();
        if (Usuarios == null) {
            return Dados = Dados + "Nenhum corretor cadastrado";
        }
        for (Usuario U : Usuarios) {
            if (U instanceof Corretor) {
                existe = true;
                Dados = Dados + U.toString() + "\n-----------------------\n";
            }
        }
        if (!existe) {
            return Dados = Dados + "Nenhum corretor cadastrado";
        }
        System.out.println("Mostrar usuarios acionado");
        return Dados;
    }

    // Casa residencial
    public void cadastroCasaResidencial(int codigoImovel, String endereco, LocalDate dataConstrucao, float areaTotal,
            float areaConstruida, int qtdDormitorios, int qtdBanheiros, int qtdVagasGaragem, float valorIPTU,
            float valorVenda, float valorAluguel) {
        CasaResidencial CasaResidencial = new CasaResidencial(codigoImovel, endereco, dataConstrucao, areaTotal,
                areaConstruida, qtdDormitorios, qtdBanheiros, qtdVagasGaragem, valorIPTU, valorVenda, valorAluguel);
        Imobiliaria.adicionarCasaResidencial(CasaResidencial);
        System.out.println("Casa residencial cadastrado:\n" + CasaResidencial.toString());
    }

    public String exibirTodasCasas() {
        String Dados = "";
        ArrayList<Imovel> Casas = Imobiliaria.getImoveis();
        for (Imovel CasaExibicao : Casas) {
            System.out.println(CasaExibicao.toString());
            Dados = Dados + CasaExibicao.toString();
        }
        return Dados;
    }

    // Outros
    public int geradorCodigoUsuario() {
        ArrayList<Usuario> Usuarios = Imobiliaria.getUsuarios();
        System.out.println("Gerador de codigo de usuario acionado");
        return Usuarios.size();
    }

    public int geradorCodigoImovel() {
        ArrayList<Imovel> Imoveis = Imobiliaria.getImoveis();
        System.out.println("Gerador de codigo de imoveis acionado");
        return Imoveis.size();
    }
}
