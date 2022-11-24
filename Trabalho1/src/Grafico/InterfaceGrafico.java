/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Grafico;

import Controlador.Controlador;
import Grafico.Cadastro.CadastroCliente;
import Grafico.Cadastro.CadastroCorretor;
import Grafico.Cadastro.CadastroImovel;
import Grafico.Cadastro.CadastroLocacao;
import Grafico.Cadastro.CadastroSeguro;
import Grafico.Cadastro.CadastroVenda;
import Grafico.Cadastro.PagarLocacao;

/**
 *
 * @author Willian
 */
public class InterfaceGrafico extends javax.swing.JFrame {

    public Controlador Controlador = new Controlador();

    /**
     * Creates new form InterfaceGrafico
     */
    public InterfaceGrafico() {
        initComponents();
        System.out.println(Controlador.toString());
    }

    private void Limpar() {
        TextoExibicao.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem11 = new javax.swing.JMenuItem();
        TextoExibicaoScroll = new javax.swing.JScrollPane();
        TextoExibicao = new javax.swing.JTextArea();
        BarraMenu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Cliente = new javax.swing.JMenuItem();
        Corretores = new javax.swing.JMenuItem();
        CasaResidencial = new javax.swing.JMenuItem();
        VendaCadastro = new javax.swing.JMenuItem();
        LocacaoCadastro = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        ImovelMenu = new javax.swing.JMenu();
        Todos = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        CategoriaApartamentoResidencial = new javax.swing.JMenuItem();
        CategoriaCasaResidencial = new javax.swing.JMenuItem();
        CategoriaComercial = new javax.swing.JMenuItem();
        Locacao = new javax.swing.JMenu();
        ListaDisponivel = new javax.swing.JMenuItem();
        ListaIndisponivel = new javax.swing.JMenuItem();
        DisponivelVenda = new javax.swing.JMenuItem();
        IndisponivelVenda = new javax.swing.JMenuItem();
        UsuarioMenu = new javax.swing.JMenu();
        ClientesCadastrados = new javax.swing.JMenuItem();
        CorretoresCadastrados = new javax.swing.JMenuItem();
        PagamentoMenu = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        jMenuItem11.setText("jMenuItem11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trabalho 01");

        TextoExibicao.setEditable(false);
        TextoExibicao.setColumns(20);
        TextoExibicao.setRows(5);
        TextoExibicaoScroll.setViewportView(TextoExibicao);

        jMenu1.setText("Cadastro");

        Cliente.setText("Cliente");
        Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteActionPerformed(evt);
            }
        });
        jMenu1.add(Cliente);

        Corretores.setText("Corretores");
        Corretores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorretoresActionPerformed(evt);
            }
        });
        jMenu1.add(Corretores);

        CasaResidencial.setText("Imovel");
        CasaResidencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasaResidencialActionPerformed(evt);
            }
        });
        jMenu1.add(CasaResidencial);

        VendaCadastro.setText("Venda");
        VendaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VendaCadastroActionPerformed(evt);
            }
        });
        jMenu1.add(VendaCadastro);

        LocacaoCadastro.setText("Locação");
        LocacaoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocacaoCadastroActionPerformed(evt);
            }
        });
        jMenu1.add(LocacaoCadastro);

        jMenuItem2.setText("Seguro");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        BarraMenu.add(jMenu1);

        ImovelMenu.setText("Imovel");

        Todos.setText("Todos");

        jMenuItem1.setText("Todas categorias");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Todos.add(jMenuItem1);

        CategoriaApartamentoResidencial.setText("Apartamento Residencial");
        CategoriaApartamentoResidencial.setToolTipText("");
        CategoriaApartamentoResidencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaApartamentoResidencialActionPerformed(evt);
            }
        });
        Todos.add(CategoriaApartamentoResidencial);

        CategoriaCasaResidencial.setText("Casa Residencial");
        CategoriaCasaResidencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaCasaResidencialActionPerformed(evt);
            }
        });
        Todos.add(CategoriaCasaResidencial);

        CategoriaComercial.setText("Comercial");
        CategoriaComercial.setToolTipText("");
        CategoriaComercial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaComercialActionPerformed(evt);
            }
        });
        Todos.add(CategoriaComercial);

        ImovelMenu.add(Todos);

        Locacao.setText("Locação");

        ListaDisponivel.setText("Disponível");
        ListaDisponivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaDisponivelActionPerformed(evt);
            }
        });
        Locacao.add(ListaDisponivel);

        ListaIndisponivel.setText("Indisponível");
        ListaIndisponivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaIndisponivelActionPerformed(evt);
            }
        });
        Locacao.add(ListaIndisponivel);

        ImovelMenu.add(Locacao);

        DisponivelVenda.setText("Disponível para venda");
        DisponivelVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisponivelVendaActionPerformed(evt);
            }
        });
        ImovelMenu.add(DisponivelVenda);

        IndisponivelVenda.setText("Indisponível para venda e ou locação");
        IndisponivelVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IndisponivelVendaActionPerformed(evt);
            }
        });
        ImovelMenu.add(IndisponivelVenda);

        BarraMenu.add(ImovelMenu);

        UsuarioMenu.setText("Usuario");

        ClientesCadastrados.setText("Clientes cadastrados");
        ClientesCadastrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientesCadastradosActionPerformed(evt);
            }
        });
        UsuarioMenu.add(ClientesCadastrados);

        CorretoresCadastrados.setText("Corretores cadastrados");
        CorretoresCadastrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorretoresCadastradosActionPerformed(evt);
            }
        });
        UsuarioMenu.add(CorretoresCadastrados);

        BarraMenu.add(UsuarioMenu);

        PagamentoMenu.setText("Pagamento");

        jMenuItem12.setText("Pagar locação de imóvel");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        PagamentoMenu.add(jMenuItem12);

        jMenuItem3.setText("Alugueis com atraso no pagamento");
        PagamentoMenu.add(jMenuItem3);

        jMenuItem5.setText("Funcionário do mês");
        PagamentoMenu.add(jMenuItem5);

        jMenuItem6.setText("Imóveis comprados por um cliente");
        PagamentoMenu.add(jMenuItem6);

        jMenuItem7.setText("Clientes com alugueis em atraso");
        PagamentoMenu.add(jMenuItem7);

        jMenuItem8.setText("Locações finalizadas ou não");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        PagamentoMenu.add(jMenuItem8);

        jMenuItem9.setText("Locações finalizadas");
        PagamentoMenu.add(jMenuItem9);

        jMenuItem10.setText("Locações não finalizadas");
        PagamentoMenu.add(jMenuItem10);

        BarraMenu.add(PagamentoMenu);

        jMenu4.setText("Seguro");

        jMenuItem4.setText("Exibir todos");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        BarraMenu.add(jMenu4);

        setJMenuBar(BarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(TextoExibicaoScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 908,
                                        Short.MAX_VALUE)
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(TextoExibicaoScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 505,
                                        Short.MAX_VALUE)
                                .addContainerGap()));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jMenuItem1ActionPerformed

    private void VendaCadastroActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_VendaCadastroActionPerformed
        // TODO add your handling code here:
        CadastroVenda CadastroVenda = new CadastroVenda();
        CadastroVenda.setLocationRelativeTo(this);
        CadastroVenda.setVisible(true);
    }// GEN-LAST:event_VendaCadastroActionPerformed

    private void LocacaoCadastroActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_LocacaoCadastroActionPerformed
        // TODO add your handling code here:
        CadastroLocacao CadastroLocacao = new CadastroLocacao();
        CadastroLocacao.setLocationRelativeTo(this);
        CadastroLocacao.setVisible(true);
    }// GEN-LAST:event_LocacaoCadastroActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        CadastroSeguro CadastroSeguro = new CadastroSeguro();
        CadastroSeguro.setLocationRelativeTo(this);
        CadastroSeguro.setVisible(true);
    }// GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        TextoExibicao.setText(Controlador.ExibirTodosSeguros());
    }// GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        Limpar();
        TextoExibicao.setText(Controlador.ExibirTodasLocacoes());
    }// GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        PagarLocacao PagarLocacao = new PagarLocacao();
        PagarLocacao.setLocationRelativeTo(this);
        PagarLocacao.setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void ClientesCadastradosActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ClientesCadastradosActionPerformed
        // TODO add your handling code here:
        Limpar();
        TextoExibicao.setText(Controlador.mostrarClientes());
    }// GEN-LAST:event_ClientesCadastradosActionPerformed

    private void CorretoresCadastradosActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_CorretoresCadastradosActionPerformed
        // TODO add your handling code here:
        Limpar();
        TextoExibicao.setText("Corretores cadastrados:");
        TextoExibicao.setText(Controlador.mostrarCorretores());
    }// GEN-LAST:event_CorretoresCadastradosActionPerformed

    private void CategoriaApartamentoResidencialActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_CategoriaApartamentoResidencialActionPerformed
        // TODO add your handling code here:
        Limpar();
        TextoExibicao.setText("Lista de categoria de apartamento residencial:\n");
    }// GEN-LAST:event_CategoriaApartamentoResidencialActionPerformed

    private void CategoriaCasaResidencialActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_CategoriaCasaResidencialActionPerformed
        // TODO add your handling code here:
        Limpar();
        TextoExibicao.setText("Lista de categoria de casa residencial:\n" + Controlador.exibirCasasResidenciais());
    }// GEN-LAST:event_CategoriaCasaResidencialActionPerformed

    private void CategoriaComercialActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_CategoriaComercialActionPerformed
        // TODO add your handling code here:
        Limpar();
        TextoExibicao.setText("Lista de categoria de comercio:");
    }// GEN-LAST:event_CategoriaComercialActionPerformed

    private void DisponivelVendaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_DisponivelVendaActionPerformed
        // TODO add your handling code here:
        Limpar();
        TextoExibicao.setText("Casas disponiveis para venda:");
    }// GEN-LAST:event_DisponivelVendaActionPerformed

    private void IndisponivelVendaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_IndisponivelVendaActionPerformed
        // TODO add your handling code here:
        Limpar();
        TextoExibicao.setText("Casas indisponiveis para venda ou aluguel:");
    }// GEN-LAST:event_IndisponivelVendaActionPerformed

    private void ListaDisponivelActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ListaDisponivelActionPerformed
        // TODO add your handling code here:
        Limpar();
        TextoExibicao.setText("Casas disponiveis para locacao:");
    }// GEN-LAST:event_ListaDisponivelActionPerformed

    private void ListaIndisponivelActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ListaIndisponivelActionPerformed
        // TODO add your handling code here:
        Limpar();
        TextoExibicao.setText("Casas indisponiveis para locacao:");
    }// GEN-LAST:event_ListaIndisponivelActionPerformed

    private void ClienteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ClienteActionPerformed
        // TODO add your handling code here:
        CadastroCliente CadastroCliente = new CadastroCliente();
        CadastroCliente.setLocationRelativeTo(this);
        CadastroCliente.setVisible(true);
    }// GEN-LAST:event_ClienteActionPerformed

    private void CorretoresActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_CorretoresActionPerformed
        // TODO add your handling code here:
        CadastroCorretor CadastroCorretores = new CadastroCorretor();
        CadastroCorretores.setLocationRelativeTo(this);
        CadastroCorretores.setVisible(true);
    }// GEN-LAST:event_CorretoresActionPerformed

    private void CasaResidencialActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_CasaResidencialActionPerformed
        // TODO add your handling code here:
        CadastroImovel CadastroCasaResidencial = new CadastroImovel(this, true);
        CadastroCasaResidencial.setLocationRelativeTo(this);
        CadastroCasaResidencial.setVisible(true);
    }// GEN-LAST:event_CasaResidencialActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceGrafico.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceGrafico.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceGrafico.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceGrafico.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceGrafico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JMenuItem CasaResidencial;
    private javax.swing.JMenuItem CategoriaApartamentoResidencial;
    private javax.swing.JMenuItem CategoriaCasaResidencial;
    private javax.swing.JMenuItem CategoriaComercial;
    private javax.swing.JMenuItem Cliente;
    private javax.swing.JMenuItem ClientesCadastrados;
    private javax.swing.JMenuItem Corretores;
    private javax.swing.JMenuItem CorretoresCadastrados;
    private javax.swing.JMenuItem DisponivelVenda;
    private javax.swing.JMenu ImovelMenu;
    private javax.swing.JMenuItem IndisponivelVenda;
    private javax.swing.JMenuItem ListaDisponivel;
    private javax.swing.JMenuItem ListaIndisponivel;
    private javax.swing.JMenu Locacao;
    private javax.swing.JMenuItem LocacaoCadastro;
    private javax.swing.JMenu PagamentoMenu;
    private javax.swing.JTextArea TextoExibicao;
    private javax.swing.JScrollPane TextoExibicaoScroll;
    private javax.swing.JMenu Todos;
    private javax.swing.JMenu UsuarioMenu;
    private javax.swing.JMenuItem VendaCadastro;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
