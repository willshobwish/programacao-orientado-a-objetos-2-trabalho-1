/*
 * Trabalho de programacao orientado a objetos II
 */
package Grafico.Cadastro;

import Controlador.Controlador;
import Imovel.Imovel;
import Pagamento.Cartao;
import Pagamento.Dinheiro;
import Pagamento.Pagamento;
import Unicos.Aluguel;
import Unicos.Seguro;
import Usuario.Cliente;
import Usuario.Corretor;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Willian Yoshio Murayama
 */
public class CadastroLocacao extends javax.swing.JFrame {

    public Controlador Controlador = new Controlador();
    private ArrayList<Seguro> SegurosSelecionados = new ArrayList<Seguro>();

    /**
     * Creates new form CadastroVenda
     */
    public CadastroLocacao() {
        initComponents();
        SegurosSelecao.setEnabled(false);
        Seguros.setEnabled(false);
        AdicionarSeguro.setEnabled(false);
        String[] NomesCorretores = Controlador.NomesCorretoresArray().toArray(new String[0]);
        DefaultComboBoxModel CorretorModel = new DefaultComboBoxModel(NomesCorretores);
        Corretor.setModel(CorretorModel);
        String[] CodigosImoveis = Controlador.CodigosImoveisArray().toArray(new String[0]);
        DefaultComboBoxModel CodigoModel = new DefaultComboBoxModel(CodigosImoveis);
        ImovelCodigo.setModel(CodigoModel);
        String[] TipoSeguros = Controlador.NomeSeguroArray().toArray(new String[0]);
        DefaultComboBoxModel SeguroModel = new DefaultComboBoxModel(TipoSeguros);
        SegurosSelecao.setModel(SeguroModel);
        String[] ClientesNomes = Controlador.NomesClientesArray().toArray(new String[0]);
        DefaultComboBoxModel ClientesNomesModel = new DefaultComboBoxModel(ClientesNomes);
        ClientesNomeBox.setModel(ClientesNomesModel);
        Dinheiro.setSelected(true);
        disableCartao();
        Codigo.setText(String.valueOf(Controlador.geracaoCodigoAluguel()));
        DiaLocacao.setValue(DataDia());
        MesLocacao.setValue(DataMes());
        AnoLocacao.setValue(DataAno());
    }

    public int DataAno() {
        LocalDate localdate = LocalDate.now();
//        System.out.println(localdate.getYear());
        return localdate.getYear();
    }

    public int DataMes() {
        LocalDate localdate = LocalDate.now();
//        System.out.println(localdate.getYear());
        return localdate.getMonthValue();
    }

    public int DataDia() {
        LocalDate localdate = LocalDate.now();
//        System.out.println(localdate.getYear());
        return localdate.getDayOfMonth();
    }

    public void enableCartao() {
        NomeCartao.setEnabled(true);
        NumeroCartao.setEnabled(true);
        BandeiraCartao.setEnabled(true);
    }

    public void disableCartao() {
        NomeCartao.setEnabled(false);
        NumeroCartao.setEnabled(false);
        BandeiraCartao.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        Corretor = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        ImovelCodigo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        DiaLocacao = new javax.swing.JSpinner();
        MesLocacao = new javax.swing.JSpinner();
        AnoLocacao = new javax.swing.JSpinner();
        AnoCadastroLabel = new javax.swing.JLabel();
        MesCadastroLabel = new javax.swing.JLabel();
        DiaCadastroLabel = new javax.swing.JLabel();
        DataCadastroLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DadosImovel = new javax.swing.JTextArea();
        jCheckBox1 = new javax.swing.JCheckBox();
        SegurosSelecao = new javax.swing.JComboBox<>();
        AdicionarSeguro = new javax.swing.JButton();
        DataCadastroLabel1 = new javax.swing.JLabel();
        DiaDevolucao = new javax.swing.JSpinner();
        MesDevolucao = new javax.swing.JSpinner();
        AnoDevolucao = new javax.swing.JSpinner();
        AnoCadastroLabel1 = new javax.swing.JLabel();
        MesCadastroLabel1 = new javax.swing.JLabel();
        DiaCadastroLabel1 = new javax.swing.JLabel();
        DataCadastroLabel2 = new javax.swing.JLabel();
        DiaPagamento = new javax.swing.JSpinner();
        DiaCadastroLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Dinheiro = new javax.swing.JRadioButton();
        Cartao = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        NomeCartao = new javax.swing.JTextField();
        BandeiraCartao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        NumeroCartao = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Seguros = new javax.swing.JTextArea();
        Codigo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ClientesNomeBox = new javax.swing.JComboBox<>();

        buttonGroup3.add(Dinheiro);
        buttonGroup3.add(Cartao);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Locação de imóvel");

        jLabel1.setText("Corretor");

        Corretor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Corretor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorretorActionPerformed(evt);
            }
        });

        jLabel2.setText("Imovel");

        ImovelCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImovelCodigoActionPerformed(evt);
            }
        });

        jButton1.setText("Alugar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        DiaLocacao.setValue(DataDia());

        MesLocacao.setValue(DataMes());

        AnoLocacao.setName(""); // NOI18N
        AnoLocacao.setValue(DataAno());

        AnoCadastroLabel.setText("Ano");

        MesCadastroLabel.setText("Mês");

        DiaCadastroLabel.setText("Dia");

        DataCadastroLabel.setText("Data da locação");

        DadosImovel.setEditable(false);
        DadosImovel.setColumns(20);
        DadosImovel.setRows(5);
        jScrollPane1.setViewportView(DadosImovel);

        jCheckBox1.setText("Adicionar seguro");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        SegurosSelecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SegurosSelecaoActionPerformed(evt);
            }
        });

        AdicionarSeguro.setText("Adicionar seguro");
        AdicionarSeguro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarSeguroActionPerformed(evt);
            }
        });

        DataCadastroLabel1.setText("Data da devolução");

        DiaDevolucao.setValue(DataDia());

        MesDevolucao.setValue(DataMes());

        AnoDevolucao.setName(""); // NOI18N
        AnoDevolucao.setValue(DataAno());

        AnoCadastroLabel1.setText("Ano");

        MesCadastroLabel1.setText("Mês");

        DiaCadastroLabel1.setText("Dia");

        DataCadastroLabel2.setText("Data do pagamento");

        DiaPagamento.setValue(DataDia());

        DiaCadastroLabel2.setText("Dia");

        jLabel3.setText("Forma de pagamento");

        Dinheiro.setText("Dinheiro");
        Dinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DinheiroActionPerformed(evt);
            }
        });

        Cartao.setText("Cartão");
        Cartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CartaoActionPerformed(evt);
            }
        });

        jLabel4.setText("Nome");

        jLabel5.setText("Bandeira");

        jLabel6.setText("Número");

        jLabel7.setText("Dados do imóvel");

        jLabel8.setText("Seguros");

        Seguros.setEditable(false);
        Seguros.setColumns(20);
        Seguros.setRows(5);
        jScrollPane2.setViewportView(Seguros);

        Codigo.setEditable(false);

        jLabel9.setText("Código");

        jLabel10.setText("Cliente");

        ClientesNomeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Dinheiro)
                            .addComponent(Cartao)
                            .addComponent(jLabel4)
                            .addComponent(NomeCartao)
                            .addComponent(jLabel5)
                            .addComponent(BandeiraCartao)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1)
                            .addComponent(Corretor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(ImovelCodigo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DataCadastroLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DiaLocacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DiaCadastroLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MesLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MesCadastroLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AnoCadastroLabel)
                                    .addComponent(AnoLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(DataCadastroLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DiaDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DiaCadastroLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MesDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MesCadastroLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AnoCadastroLabel1)
                                    .addComponent(AnoDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(DataCadastroLabel2)
                            .addComponent(DiaPagamento)
                            .addComponent(DiaCadastroLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9)
                            .addComponent(Codigo)
                            .addComponent(NumeroCartao)
                            .addComponent(jLabel10)
                            .addComponent(ClientesNomeBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jCheckBox1)
                                .addComponent(AdicionarSeguro, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(SegurosSelecao, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Corretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ClientesNomeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ImovelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DataCadastroLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MesCadastroLabel)
                            .addComponent(AnoCadastroLabel)
                            .addComponent(DiaCadastroLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DiaLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AnoLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MesLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DataCadastroLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MesCadastroLabel1)
                            .addComponent(AnoCadastroLabel1)
                            .addComponent(DiaCadastroLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DiaDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AnoDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MesDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DataCadastroLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DiaCadastroLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DiaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Dinheiro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cartao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NomeCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BandeiraCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NumeroCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SegurosSelecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AdicionarSeguro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CorretorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorretorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CorretorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int codigoAluguel = Integer.parseInt(Codigo.getText());
        Cliente cliente = Controlador.getClientePorNome(ClientesNomeBox.getSelectedItem().toString());
        Corretor corretor = Controlador.getCorretorPorNome(Corretor.getSelectedItem().toString());
        Imovel imovel = Controlador.BuscarImovel(ImovelCodigo.getSelectedItem().toString());
        LocalDate dataAluguel = LocalDate.parse(AnoLocacao.getValue().toString() + "-" + MesLocacao.getValue().toString() + "-" + DiaLocacao.getValue().toString());
        LocalDate dataDevolucao = LocalDate.parse(AnoDevolucao.getValue().toString() + "-" + MesDevolucao.getValue().toString() + "-" + DiaDevolucao.getValue().toString());
        LocalDate DataAgora = LocalDate.now();
        LocalDate dataPagamentoMensal = LocalDate.parse(DataAgora.getYear() + "-" + DataAgora.getMonthValue() + "-" + DiaPagamento.getValue().toString());
        float valorTotalAluguel = imovel.getValorAluguel();
        Pagamento formaPagamento = null;
        if (Dinheiro.isSelected()) {
            formaPagamento = new Dinheiro();
        }
        if (Cartao.isSelected()) {
            formaPagamento = new Cartao(NomeCartao.getText(), NumeroCartao.getText(), BandeiraCartao.getText());
        }
        ArrayList<Seguro> segurosContratados = SegurosSelecionados;
        boolean pago = false;
        Controlador.CadastroLocacao(new Aluguel(codigoAluguel, cliente, corretor, imovel, dataAluguel, dataDevolucao, dataPagamentoMensal, valorTotalAluguel, formaPagamento, segurosContratados, pago));
        System.out.println("cadastrado");
    }//GEN-LAST:event_jButton1ActionPerformed
    private void ImovelCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImovelCodigoActionPerformed
        // TODO add your handling code here:
        Imovel ImovelExibicao = Controlador.BuscarImovel(ImovelCodigo.getSelectedItem().toString());
        DadosImovel.setText(ImovelExibicao.toString());
    }//GEN-LAST:event_ImovelCodigoActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox1.isSelected()) {
            SegurosSelecao.setEnabled(true);
            Seguros.setEnabled(true);
            AdicionarSeguro.setEnabled(true);
        } else {
            SegurosSelecao.setEnabled(false);
            Seguros.setEnabled(false);
            AdicionarSeguro.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void DinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DinheiroActionPerformed
        // TODO add your handling code here:
        disableCartao();
    }//GEN-LAST:event_DinheiroActionPerformed

    private void CartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CartaoActionPerformed
        // TODO add your handling code here:
        enableCartao();
    }//GEN-LAST:event_CartaoActionPerformed

    private void SegurosSelecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SegurosSelecaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SegurosSelecaoActionPerformed

    private void AdicionarSeguroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarSeguroActionPerformed
        // TODO add your handling code here:
        System.out.println(SegurosSelecionados.contains(Controlador.BuscarSeguro(SegurosSelecao.getSelectedItem().toString())));
        if (SegurosSelecionados.contains(Controlador.BuscarSeguro(SegurosSelecao.getSelectedItem().toString()))) {
            JOptionPane.showMessageDialog(this,
                    "Seguro já cadastrado",
                    "Seguro",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            SegurosSelecionados.add(Controlador.BuscarSeguro(SegurosSelecao.getSelectedItem().toString()));
            String SegurosListados = Seguros.getText();
            SegurosListados = SegurosListados + SegurosSelecao.getSelectedItem().toString() + "\n";
            Seguros.setText(SegurosListados);
        }
    }//GEN-LAST:event_AdicionarSeguroActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroLocacao.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroLocacao.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroLocacao.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroLocacao.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroLocacao().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionarSeguro;
    private javax.swing.JLabel AnoCadastroLabel;
    private javax.swing.JLabel AnoCadastroLabel1;
    private javax.swing.JSpinner AnoDevolucao;
    private javax.swing.JSpinner AnoLocacao;
    private javax.swing.JTextField BandeiraCartao;
    private javax.swing.JRadioButton Cartao;
    private javax.swing.JComboBox<String> ClientesNomeBox;
    private javax.swing.JTextField Codigo;
    private javax.swing.JComboBox<String> Corretor;
    private javax.swing.JTextArea DadosImovel;
    private javax.swing.JLabel DataCadastroLabel;
    private javax.swing.JLabel DataCadastroLabel1;
    private javax.swing.JLabel DataCadastroLabel2;
    private javax.swing.JLabel DiaCadastroLabel;
    private javax.swing.JLabel DiaCadastroLabel1;
    private javax.swing.JLabel DiaCadastroLabel2;
    private javax.swing.JSpinner DiaDevolucao;
    private javax.swing.JSpinner DiaLocacao;
    private javax.swing.JSpinner DiaPagamento;
    private javax.swing.JRadioButton Dinheiro;
    private javax.swing.JComboBox<String> ImovelCodigo;
    private javax.swing.JLabel MesCadastroLabel;
    private javax.swing.JLabel MesCadastroLabel1;
    private javax.swing.JSpinner MesDevolucao;
    private javax.swing.JSpinner MesLocacao;
    private javax.swing.JTextField NomeCartao;
    private javax.swing.JTextField NumeroCartao;
    private javax.swing.JTextArea Seguros;
    private javax.swing.JComboBox<String> SegurosSelecao;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
