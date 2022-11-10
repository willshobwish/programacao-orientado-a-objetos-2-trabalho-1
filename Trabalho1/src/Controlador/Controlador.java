/*
 * Trabalho de programacao orientado a objetos II
 */
package Controlador;

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

    private static ArrayList<Venda> Venda = new ArrayList<>();
    private static ArrayList<Imovel> Imovel = new ArrayList<>();
    private static ArrayList<Usuario> Usuario = new ArrayList<>();
    private static ArrayList<Seguro> Seguro = new ArrayList<>();
    private static ArrayList<Aluguel> Aluguel = new ArrayList<>();
    private static Imobiliaria Imobiliaria = new Imobiliaria("Teste", "Endereco teste", Aluguel, Venda, Imovel, Usuario, Seguro, null);

    public Controlador() {
//        Imobiliaria = new Imobiliaria("Teste", "Endereco teste", Aluguel, Venda, Imovel, Usuario, Seguro, null);
    }

    public String toString() {
        return """
               Controlador inicializado:
               Imobiliaria:
               Nome: %s
               Endereco: %s
               """.formatted(Imobiliaria.getNome(), Imobiliaria.getEndereco());
    }
//Clientes

    public void adicionarCliente(LocalDate Data, int CodigoUsuario, String NomeCliente, String cpf, String rg, LocalDate DataNascimento, String endereco, String cep, String telefone, String email) {
        Cliente Cliente = new Cliente(Data, CodigoUsuario, NomeCliente, cpf, rg, DataNascimento, endereco, cep, telefone, email);
        Imobiliaria.adicionarCliente(Cliente);
        System.out.println(Cliente.toString());
    }

    public String mostrarClientes() {
        String Dados = "Clientes cadastrados:\n";
        ArrayList<Usuario> Usuarios = Imobiliaria.getUsuarios();
        for (Usuario U : Usuarios) {
            if (U instanceof Cliente) {
                Dados = Dados + U.toString() + "\n-----------------------\n";
            }
        }
        System.out.println("Mostrar usuarios acionado");
        return Dados;
    }

//Corretores
    public boolean adicionarCorretores(String creci, float salario, String pis, int codigoUsuario, String nome, String cpf, String rg, LocalDate DataNascimento, LocalDate dataAdmissao, String endereco, String cep, String telefone, String email) {
        Corretor Corretor = new Corretor(creci, salario, pis, dataAdmissao, codigoUsuario, nome, cpf, rg, DataNascimento, endereco, cep, telefone, email);
        if (Imobiliaria.adicionarCorretor(Corretor)) {
            System.out.println("Corretor cadastrado:\n" + Corretor.toString());
            return true;
        } else {
            System.out.println("Corretor nao cadastrado");
            return false;
        }
    }

    public String mostrarCorretores() {
        String Dados = "Corretores cadastrados:\n";
        ArrayList<Usuario> Usuarios = Imobiliaria.getUsuarios();
        for (Usuario U : Usuarios) {
            if (U instanceof Corretor) {
                Dados = Dados + U.toString() + "\n-----------------------\n";
            }
        }
        System.out.println("Mostrar usuarios acionado");
        return Dados;
    }

//Outros
    public int geradorCodigoUsuario() {
        ArrayList<Usuario> Usuarios = Imobiliaria.getUsuarios();
        System.out.println("Gerador de codigo de usuario acionado");
        return Usuarios.size();
    }
}
