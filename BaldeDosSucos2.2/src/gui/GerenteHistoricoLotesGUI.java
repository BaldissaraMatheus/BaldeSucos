/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.LoteDelDAO;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.LoteDel;

/**
 *
 * @author loboandro
 */
public class GerenteHistoricoLotesGUI extends javax.swing.JFrame {

    /**
     * Creates new form HistoricoLotesGUI
     */
    public GerenteHistoricoLotesGUI() {
        initComponents();
        setIcon();
        LoteDelDAO dao = new LoteDelDAO();
        List<LoteDel> listaLoteDel = dao.recuperaLotesDel();

        DefaultTableModel tbmlotes = (DefaultTableModel) jTableLotes.getModel();
        for (int i = tbmlotes.getRowCount() - 1; i >= 0; i--) {
            tbmlotes.removeRow(i);
        }
        int i = 0;
        for (LoteDel us : listaLoteDel) {
            tbmlotes.addRow(new String[1]);
            jTableLotes.setValueAt(us.getIdLoteDel(), i, 0);
            jTableLotes.setValueAt(us.getTipoProdutoLoteDel(), i, 1);
            jTableLotes.setValueAt(us.getEspecificacaoDel(), i, 2);
            jTableLotes.setValueAt(us.getQtdUnitariaDel(), i, 3);
            jTableLotes.setValueAt(us.getFornecedorDel(), i, 4);
            jTableLotes.setValueAt(us.getDataEntradaDel(), i, 5);
            jTableLotes.setValueAt(us.getDataSaidaDel(), i, 6);
            jTableLotes.setValueAt(us.getHoraEntradaDel(), i, 7);
            jTableLotes.setValueAt(us.getHoraSaidaDel(), i, 8);
            jTableLotes.setValueAt(us.getValidadeDel(), i, 9);
            i++;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLotes = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableLotes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Lote", "Produto", "Especificação", "QtdUnitaria", "Fornecedor", "Data de Entrada", "Data de Saída", "Hora de Entrada", "Hora de Saída", "Validade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableLotes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableLotes);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagens/back.png"))); // NOI18N
        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu1.setText("Arquivo");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagens/logout.png"))); // NOI18N
        jMenuItem1.setText("Desconectar");
        jMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 983, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        GerenteEstoqueGUI janEstq = new GerenteEstoqueGUI();
        janEstq.setLocationRelativeTo(null);
        janEstq.setVisible(true);
        janEstq.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked
        LoginGUI janLogin = new LoginGUI();
        janLogin.setLocationRelativeTo(null);
        janLogin.setVisible(true);
        janLogin.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        LoginGUI janLogin = new LoginGUI();
        janLogin.setLocationRelativeTo(null);
        janLogin.setVisible(true);
        janLogin.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(GerenteHistoricoLotesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenteHistoricoLotesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenteHistoricoLotesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenteHistoricoLotesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenteHistoricoLotesGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLotes;
    // End of variables declaration//GEN-END:variables
private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("suco.png")));
    }
}
