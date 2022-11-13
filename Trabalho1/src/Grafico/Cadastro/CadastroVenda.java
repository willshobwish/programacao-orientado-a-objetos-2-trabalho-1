/*
 * Trabalho de programacao orientado a objetos II
 */
package Grafico.Cadastro;

import Controlador.Controlador;
import Imovel.Imovel;
import Pagamento.Dinheiro;
import Pagamento.Pagamento;
import Usuario.Cliente;
import Usuario.Corretor;
import java.time.LocalDate;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Willian Yoshio Murayama
 */
public class CadastroVenda extends javax.swing.JFrame {

    public Controlador Controlador = new Controlador();

    /**
     * Creates new form CadastroVenda
     */
    public CadastroVenda() {
        initComponents();
        String[] NomesCorretores = Controlador.NomesCorretoresArray().toArray(new String[0]);
        DefaultComboBoxModel model = new DefaultComboBoxModel(NomesCorretores);
        Corretor.setModel(model);
        String[] CodigosImoveis = Controlador.CodigosImoveisArray().toArray(new String[0]);
        DefaultComboBoxModel CodigosModel = new DefaultComboBoxModel(CodigosImoveis);
        ImovelCodigo.setModel(CodigosModel);
        String[] ClientesNomes = Controlador.NomesClientesArray().toArray(new String[0]);
        DefaultComboBoxModel ClientesModel = new DefaultComboBoxModel(ClientesNomes);
        ClientesNomeBox.setModel(ClientesModel);
        Codigo.setText(String.valueOf(Controlador.geradorCodigoVenda()));
        DiaVenda.setValue(DataDia());
        MesVenda.setValue(DataMes());
        AnoVenda.setValue(DataAno());
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

    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Corretor = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        ImovelCodigo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        DiaVenda = new javax.swing.JSpinner();
        MesVenda = new javax.swing.JSpinner();
        AnoVenda = new javax.swing.JSpinner();
        AnoCadastroLabel = new javax.swing.JLabel();
        MesCadastroLabel = new javax.swing.JLabel();
        DiaCadastroLabel = new javax.swing.JLabel();
        DataCadastroLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        Codigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ClientesNomeBox = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Venda de imóvel");

        jLabel1.setText("Corretor");

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

        jButton1.setText("Comprar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        DiaVenda.setValue(DataDia());

        MesVenda.setValue(DataMes());

        AnoVenda.setName(""); // NOI18N
        AnoVenda.setValue(DataAno());

        AnoCadastroLabel.setText("Ano");

        MesCadastroLabel.setText("Mês");

        DiaCadastroLabel.setText("Dia");

        DataCadastroLabel.setText("Data de venda");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel3.setText("Dados do imóvel");

        Codigo.setEditable(false);

        jLabel4.setText("Código");

        jLabel10.setText("Cliente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1)
                                .addComponent(Corretor, 0, 204, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addComponent(ImovelCodigo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addComponent(Codigo)
                                .addComponent(jLabel10)
                                .addComponent(ClientesNomeBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel3)
                            .addComponent(DataCadastroLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DiaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DiaCadastroLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MesVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MesCadastroLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AnoCadastroLabel)
                                    .addComponent(AnoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Corretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ImovelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ClientesNomeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DataCadastroLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DiaCadastroLabel)
                    .addComponent(MesCadastroLabel)
                    .addComponent(AnoCadastroLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DiaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AnoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MesVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CorretorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorretorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CorretorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int codigoVenda = Integer.parseInt(Codigo.getText());
        Cliente cliente = Controlador.getClientePorNome(ClientesNomeBox.getSelectedItem().toString());
        Corretor corretor = Controlador.getCorretorPorNome(Corretor.getSelectedItem().toString());
        Imovel imovel = Controlador.BuscarImovel(ImovelCodigo.getSelectedItem().toString());
        LocalDate dataVenda = LocalDate.parse(AnoVenda.getValue() + "-" + MesVenda.getValue() + "-" + DiaVenda.getValue());
        float valorTotalVenda = imovel.getValorVenda();
        Pagamento formaPagamento = new Dinheiro();
        Controlador.CadastroVenda(codigoVenda, cliente, corretor, imovel, dataVenda, valorTotalVenda, formaPagamento);
        JOptionPane.showMessageDialog(this, "Venda cadastrado com sucesso");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ImovelCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImovelCodigoActionPerformed
        // TODO add your handling code here:
        Imovel ImovelExibicao = Controlador.BuscarImovel(ImovelCodigo.getSelectedItem().toString());
        jTextArea1.setText(ImovelExibicao.toString());
    }//GEN-LAST:event_ImovelCodigoActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroVenda().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AnoCadastroLabel;
    private javax.swing.JSpinner AnoVenda;
    private javax.swing.JComboBox<String> ClientesNomeBox;
    private javax.swing.JTextField Codigo;
    private javax.swing.JComboBox<String> Corretor;
    private javax.swing.JLabel DataCadastroLabel;
    private javax.swing.JLabel DiaCadastroLabel;
    private javax.swing.JSpinner DiaVenda;
    private javax.swing.JComboBox<String> ImovelCodigo;
    private javax.swing.JLabel MesCadastroLabel;
    private javax.swing.JSpinner MesVenda;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
