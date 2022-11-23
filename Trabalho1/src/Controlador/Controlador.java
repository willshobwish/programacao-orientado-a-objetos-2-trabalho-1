/*
 * Trabalho de programacao orientado a objetos II
 */
package Controlador;

import Imovel.ApartamentoResidencial;
import Imovel.CasaResidencial;
import Imovel.Comercial;
import Imovel.Imovel;
import Pagamento.Pagamento;
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

    public ArrayList<Imovel> getImoveisCompradosCliente(Cliente cliente) {
        return cliente.getImoveisComprados();
    }

    public String mostrarClientes() {
        boolean existe = false;
        String Dados = "Clientes cadastrados:\n";
        ArrayList<Usuario> Usuarios = Imobiliaria.getUsuarios();
        for (Usuario U : Usuarios) {
            if (U instanceof Cliente) {
                existe = true;
                Dados = Dados + U.toString() + "\n------------------------------------------------\n";
            }
        }
        if (!existe) {
            return Dados = Dados + "Nenhum cliente cadastrado";
        }
        System.out.println("Mostrar usuarios acionado");
        return Dados;
    }

    public ArrayList<String> NomesClientesArray() {
        ArrayList<String> Nomes = new ArrayList<String>();
        ArrayList<Usuario> Usuarios = Imobiliaria.getUsuarios();
        for (Usuario U : Usuarios) {
            if (U instanceof Cliente) {
                Nomes.add(U.getNome());
            }
        }
        return Nomes;
    }

    public Cliente getClientePorNome(String Nome) {
        ArrayList<Usuario> Clientes = Imobiliaria.getUsuarios();
        for (Usuario C : Clientes) {
            if ((C.getNome().equals(Nome)) && (C instanceof Cliente)) {
                return (Cliente) C;
            }
        }
        return null;
    }

    public ArrayList<Imovel> listarHistoricoCliente(Cliente cliente) {
        ArrayList<Imovel> imoveisComprados = cliente.getImoveisComprados();
        ArrayList<Imovel> imoveisAlugados = cliente.getImoveisAlugados();
        ArrayList<Imovel> todosImoveis = new ArrayList<Imovel>();

        todosImoveis.addAll(imoveisComprados);
        todosImoveis.addAll(imoveisAlugados);

        return todosImoveis;
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

    public ArrayList<String> NomesCorretoresArray() {
        ArrayList<String> Nomes = new ArrayList<String>();
        ArrayList<Usuario> Usuarios = Imobiliaria.getUsuarios();
        for (Usuario U : Usuarios) {
            if (U instanceof Corretor) {
                Nomes.add(U.getNome());
            }
        }
        return Nomes;
    }

    public Corretor getCorretorPorNome(String Nome) {
        ArrayList<Usuario> Corretor = Imobiliaria.getUsuarios();
        for (Usuario C : Corretor) {
            if ((C.getNome().equals(Nome)) && (C instanceof Corretor)) {
                return (Corretor) C;
            }
        }
        return null;
    }

    public Corretor getCorretorDoMes() {
        ArrayList<Corretor> Corretores = Imobiliaria.getCorretores();
        Corretor CorretorDoMes = null;
        for (Corretor C : Corretores) {
            if (C.getVendas() >= CorretorDoMes.getVendas()) {
                CorretorDoMes = (Corretor) C;
            }
        }
        return CorretorDoMes;
    }

    // Imoveis
    public ArrayList<String> CodigosImoveisArray() {
        ArrayList<String> CodigosImoveis = new ArrayList<String>();
        ArrayList<Imovel> Imoveis = Imobiliaria.getImoveis();
        for (Imovel I : Imoveis) {
            CodigosImoveis.add(String.valueOf(I.getCodigoImovel()));
        }
        return CodigosImoveis;
    }

    public Imovel buscarImovel(String Codigo) {
        // ArrayList<String> CodigosImoveis = new ArrayList<String>();
        ArrayList<Imovel> Imoveis = Imobiliaria.getImoveis();
        for (Imovel I : Imoveis) {
            if (I.getCodigoImovel() == Integer.parseInt(Codigo)) {
                return I;
            }
        }
        return null;
    }

    public ArrayList<Aluguel> getAlugueisAtrasado(LocalDate data) {
        ArrayList<Aluguel> alugueisAtrasados = new ArrayList<Aluguel>();
        ArrayList<Aluguel> alugueis = Imobiliaria.getAlugueis();

        for (Aluguel alu : alugueis) {
            if (alu.getDataPagamentoMensal().isBefore(data)) {
                alugueisAtrasados.add(alu);
            }
        }

        return alugueisAtrasados;
    }

    public ArrayList<Aluguel> getAlugueislVigente(LocalDate data) {
        ArrayList<Aluguel> alugueisVigentes = new ArrayList<Aluguel>();
        ArrayList<Aluguel> alugueis = Imobiliaria.getAlugueis();

        for (Aluguel alu : alugueis) {
            if (alu.getDataPagamentoMensal().isAfter(data)) {
                alugueisVigentes.add(alu);
            }
        }

        return alugueisVigentes;
    }

    public ArrayList<Usuario> getClientesComAluguelAtrasado(LocalDate data) {
        ArrayList<Usuario> clientesAtrasados = new ArrayList<Usuario>();
        ArrayList<Aluguel> alugueis = Imobiliaria.getAlugueis();

        for (Aluguel alu : alugueis) {
            if (alu.getDataPagamentoMensal().isBefore(data)) {
                clientesAtrasados.add(alu.getCliente());
            }
        }

        return clientesAtrasados;
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

    public String exibirCasasResidenciais() {
        String Dados = "";
        ArrayList<Imovel> Casas = Imobiliaria.getImoveis();
        for (Imovel CasaExibicao : Casas) {
            System.out.println(CasaExibicao.toString());
            Dados = Dados + CasaExibicao.toString();
        }
        return Dados;
    }

    // exibe todos os imoveis da classe Comercial
    public String exibirComerciais() {
        String Dados = "";
        ArrayList<Imovel> Comercial = Imobiliaria.getImoveis();
        for (Imovel ComercialExibicao : Comercial) {
            if (ComercialExibicao instanceof Comercial) {
                System.out.println(ComercialExibicao.toString());
                Dados = Dados + ComercialExibicao.toString();
            }
        }
        return Dados;
    }

    public ArrayList<Aluguel> getAlugueis() {
        return Imobiliaria.getAlugueis();
    }

    public ArrayList<Aluguel> getAlugueisFinalizados() {
        ArrayList<Aluguel> alugueisFinalizados = new ArrayList<Aluguel>();
        ArrayList<Aluguel> alugueis = Imobiliaria.getAlugueis();

        for (Aluguel alu : alugueis) {
            if (alu.getDataDevolucao().isBefore(LocalDate.now())) {
                alugueisFinalizados.add(alu);
            }
        }

        return alugueisFinalizados;
    }

    // exibe todos os imoveis da classe ApartamentoResidencial
    public String exibirApartamentosResidenciais() {
        String Dados = "";
        ArrayList<Imovel> Residencial = Imobiliaria.getImoveis();
        for (Imovel ResidencialExibicao : Residencial) {
            if (ResidencialExibicao instanceof ApartamentoResidencial) {
                System.out.println(ResidencialExibicao.toString());
                Dados = Dados + ResidencialExibicao.toString();
            }
        }
        return Dados;
    }

    public ArrayList<Imovel> getImoveisDisponiveis() {
        ArrayList<Imovel> Imoveis = Imobiliaria.getImoveis();
        ArrayList<Imovel> ImoveisDisponiveis = new ArrayList<Imovel>();

        for (Imovel I : Imoveis) {
            if (I.isDisponivel()) {
                ImoveisDisponiveis.add(I);
            }
        }
        return ImoveisDisponiveis;
    }

    public ArrayList<Imovel> getImoveisNaoDisponiveis() {
        ArrayList<Imovel> Imoveis = Imobiliaria.getImoveis();
        ArrayList<Imovel> ImoveisNaoDisponiveis = new ArrayList<Imovel>();

        for (Imovel I : Imoveis) {
            if (!I.isDisponivel()) {
                ImoveisNaoDisponiveis.add(I);
            }
        }
        return ImoveisNaoDisponiveis;
    }

    // Apartamento residencial
    public void CadastroApartamentoResidencial(int andar, float valorCondominio, int codigoImovel, String endereco,
            LocalDate dataConstrucao, float areaTotal, float areaConstruida, int qtdDormitorios, int qtdBanheiros,
            int qtdVagasGaragem, float valorIPTU, float valorVenda, float valorAluguel) {
        Imobiliaria.CadastrarApartamentoResidencial(new ApartamentoResidencial(andar, valorCondominio, codigoImovel,
                endereco, dataConstrucao, areaTotal, areaConstruida, qtdDormitorios, qtdBanheiros, qtdVagasGaragem,
                valorIPTU, valorVenda, valorAluguel));
    }

    // Comercial
    public void CadastrarComercial(float taxaImpostoFederal, int codigoImovel, String endereco,
            LocalDate dataConstrucao, float areaTotal, float areaConstruida, int qtdDormitorios, int qtdBanheiros,
            int qtdVagasGaragem, float valorIPTU, float valorVenda, float valorAluguel) {
        Imobiliaria.CadastrarComercial(
                new Comercial(taxaImpostoFederal, codigoImovel, endereco, dataConstrucao, areaTotal, areaConstruida,
                        qtdDormitorios, qtdBanheiros, qtdVagasGaragem, valorIPTU, valorVenda, valorAluguel));
    }

    // Vendas
    public void CadastroVenda(int codigoVenda, Cliente cliente, Corretor corretor, Imovel imovel, LocalDate dataVenda,
            float valorTotalVenda, Pagamento formaPagamento) {
        if (imovel.isDisponivel()) {
            Imobiliaria.CadastrarVenda(
                    new Venda(codigoVenda, cliente, corretor, imovel, dataVenda, valorTotalVenda, formaPagamento));
            corretor.addVenda();
            imovel.setDisponibilidade();
            cliente.comprarImovel(imovel);
        } else {
            System.out.println("Imovel nao disponivel para venda");
        }
    }

    // Locacao
    public void CadastroLocacao(int codigoAluguel, Cliente cliente, Corretor corretor, Imovel imovel,
            LocalDate dataAluguel, LocalDate dataDevolucao, LocalDate dataPagamentoMensal, float valorTotalAluguel,
            Pagamento formaPagamento, ArrayList<Seguro> segurosContratados, boolean pago) {

        if (imovel.isDisponivel()) {
            Imobiliaria.CadastroLocacao(
                    new Aluguel(codigoAluguel, cliente, corretor, imovel, dataAluguel, dataDevolucao,
                            dataPagamentoMensal,
                            valorTotalAluguel, formaPagamento, segurosContratados, pago));
            corretor.addAluguel();
            imovel.setDisponibilidade();
            cliente.alugarImovel(imovel);
        } else {
            System.out.println("Imovel nao disponivel para locacao");
        }
    }

    public int geracaoCodigoAluguel() {
        ArrayList<Aluguel> Alugueis = Imobiliaria.getAlugueis();
        return Alugueis.size();
    }

    public String ExibirTodasLocacoes() {
        String Dados = "Todas locações:\n";
        ArrayList<Aluguel> Alugueis = Imobiliaria.getAlugueis();
        for (Aluguel A : Alugueis) {
            Dados += A.toString();
            Dados += "-----------";
        }
        return Dados;
    }

    // Seguro
    public void CadastroSeguro(int codigoSeguro, String nomeSeguradora, String tipo, String descricao, float valor) {
        Seguro Seguro = new Seguro(codigoSeguro, nomeSeguradora, tipo, descricao, valor);
        Imobiliaria.CadastrarSeguro(Seguro);
    }

    public ArrayList<String> NomeSeguroArray() {
        ArrayList<Seguro> Seguros = Imobiliaria.getSeguros();
        ArrayList<String> SeguroDescricao = new ArrayList<String>();
        for (Seguro S : Seguros) {
            SeguroDescricao.add(S.getTipo());
        }
        return SeguroDescricao;
    }

    public String ExibirTodosSeguros() {
        ArrayList<Seguro> Seguros = Imobiliaria.getSeguros();
        String DadosSeguro = "";
        for (Seguro S : Seguros) {
            DadosSeguro = DadosSeguro + S.toString();
        }
        return DadosSeguro;
    }

    public Seguro BuscarSeguro(String Tipo) {
        ArrayList<Seguro> Seguros = Imobiliaria.getSeguros();
        for (Seguro S : Seguros) {
            if (S.getTipo().equals(Tipo)) {
                return S;
            }
        }
        return null;
    }

    public ArrayList<Venda> getVendas() {
        ArrayList<Venda> Vendas = Imobiliaria.getVendas();
        return Vendas;
    }

    public float getLucroTotalVendas() {
        ArrayList<Venda> Vendas = Imobiliaria.getVendas();
        ArrayList<Corretor> corretores = Imobiliaria.getCorretores();
        float ValorTotal = 0;
        for (Venda V : Vendas) {
            ValorTotal += V.getValorTotalVenda();
        }

        for (Corretor C : corretores) {
            ValorTotal -= C.getSalario();
        }

        return ValorTotal;
    }

    public ArrayList<Venda> getVendasDoMes(LocalDate data) {
        ArrayList<Venda> Vendas = Imobiliaria.getVendas();
        ArrayList<Venda> VendasDoMês = new ArrayList<Venda>();

        LocalDate DataVenda;
        for (Venda V : Vendas) {
            DataVenda = V.getDataVenda();
            if (DataVenda.getMonth() == data.getMonth()) {
                VendasDoMês.add(V);
            }
        }
        return VendasDoMês;
    }

    public float getLucroDoMes(LocalDate Mes) {
        ArrayList<Venda> Vendas = Imobiliaria.getVendas();
        ArrayList<Corretor> corretores = Imobiliaria.getCorretores();
        float lucro = 0;
        LocalDate DataVenda;

        for (Venda V : Vendas) {
            DataVenda = V.getDataVenda();
            if (DataVenda.getMonth() == Mes.getMonth()) {
                lucro += V.getValorTotalVenda();
            }
        }

        for (Corretor C : corretores) {
            lucro -= C.getSalario();
        }

        return lucro;
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

    public int geradorCodigoSeguro() {
        ArrayList<Seguro> Seguros = Imobiliaria.getSeguros();
        System.out.println("Gerador de codigo de Seguros acionado");
        return Seguros.size();
    }

    public int geradorCodigoVenda() {
        ArrayList<Venda> Vendas = Imobiliaria.getVendas();
        System.out.println("Gerador de codigo de vendas acionado");
        return Vendas.size();
    }
}
