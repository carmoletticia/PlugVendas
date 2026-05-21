package Telas;

import DAO.VendaDAO;
import Model.Venda;
import Model.VendaStore;
import javax.swing.JOptionPane;

public class TelaVender extends javax.swing.JFrame {

    public TelaVender() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("PlugVendas - Realizar Venda");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bttFinalizar = new javax.swing.JButton();
        bttCancelar = new javax.swing.JButton();
        bttAdicionar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        bttVoltar = new javax.swing.JButton();
        txtQuantidade = new javax.swing.JTextField();
        txtValorTotal = new javax.swing.JTextField();
        txtProduto = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Realizar Vendas");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setText("Produto");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setText("Quantidade");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setText("Cliente");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setText("Valor total");

        bttFinalizar.setBackground(new java.awt.Color(0, 0, 0));
        bttFinalizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bttFinalizar.setForeground(new java.awt.Color(255, 255, 255));
        bttFinalizar.setText("Finalizar venda");
        bttFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttFinalizarActionPerformed(evt);
            }
        });

        bttCancelar.setBackground(new java.awt.Color(0, 0, 0));
        bttCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bttCancelar.setForeground(new java.awt.Color(255, 255, 255));
        bttCancelar.setText("Cancelar");
        bttCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttCancelarActionPerformed(evt);
            }
        });

        bttAdicionar.setBackground(new java.awt.Color(0, 0, 0));
        bttAdicionar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bttAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        bttAdicionar.setText("Adicionar produto");
        bttAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttAdicionarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/PlugVendasLogo.png"))); // NOI18N

        bttVoltar.setBackground(new java.awt.Color(0, 0, 0));
        bttVoltar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bttVoltar.setForeground(new java.awt.Color(255, 255, 255));
        bttVoltar.setText("Voltar");
        bttVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(35, 35, 35)
                                    .addComponent(jLabel1))
                                .addComponent(txtProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                .addComponent(txtQuantidade)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtCliente)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bttVoltar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(bttAdicionar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(bttFinalizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bttCancelar)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bttVoltar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bttAdicionar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttFinalizar)
                    .addComponent(bttCancelar))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttVoltarActionPerformed

        TelaMenu menu = new TelaMenu();
        menu.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_bttVoltarActionPerformed

    private void bttAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttAdicionarActionPerformed

        String produto = txtProduto.getText();
        String quantidade = txtQuantidade.getText();

        if (produto.isEmpty() || quantidade.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Preencha produto e quantidade");
            return;
        }

        javax.swing.JOptionPane.showMessageDialog(this,
                "Produto adicionado à venda");
    }//GEN-LAST:event_bttAdicionarActionPerformed

    private void bttFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttFinalizarActionPerformed

        if (txtCliente.getText().isEmpty()
                || txtValorTotal.getText().isEmpty()) {

            javax.swing.JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            return;
        }

        Venda venda = new Venda();

        venda.setNomeCliente(txtCliente.getText());

        venda.setNomeProduto(txtProduto.getText());
        venda.setQuantidade(Integer.parseInt(txtQuantidade.getText()));

        venda.setValorTotal(Double.parseDouble(txtValorTotal.getText()));

        venda.setDataVenda(new java.util.Date());

        venda.setComissao(venda.getValorTotal() * 0.05);

        VendaStore.vendas.add(venda);

        VendaDAO dao = new VendaDAO();
        dao.salvar(venda);

        javax.swing.JOptionPane.showMessageDialog(null, "Venda registrada com sucesso!");

        txtCliente.setText("");
        txtProduto.setText("");
        txtQuantidade.setText("");
        txtValorTotal.setText("");


    }//GEN-LAST:event_bttFinalizarActionPerformed

    private void bttCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttCancelarActionPerformed

        txtProduto.setText("");
        txtQuantidade.setText("");
        txtCliente.setText("");
        txtValorTotal.setText("");

        javax.swing.JOptionPane.showMessageDialog(this,
                "Venda cancelada!");
    }//GEN-LAST:event_bttCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaVender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVender().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttAdicionar;
    private javax.swing.JButton bttCancelar;
    private javax.swing.JButton bttFinalizar;
    private javax.swing.JButton bttVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtProduto;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtValorTotal;
    // End of variables declaration//GEN-END:variables
}
