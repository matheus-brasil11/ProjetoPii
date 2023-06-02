/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.UsuarioController;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JOptionPane;
import model.Usuario;
import util.ButtonColumnCellRenderer;
import util.TableModelUsuario;

/**
 *
 * @author User
 */
public class ScreenUsuario extends javax.swing.JFrame {

        UsuarioController usuarioController = new UsuarioController();
    
        TableModelUsuario usuarioModel;
    
    
    /**
     * Creates new form ScreenUsuario
     */
    public ScreenUsuario() {
        initComponents();
        initDataController();
        initComponetsModel();
        decorateTableTask();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblControleDeClientes = new javax.swing.JLabel();
        btnBusca = new javax.swing.JButton();
        lblBusqueVeiculo = new javax.swing.JLabel();
        txtBuscaUsuario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUsuario = new javax.swing.JTable();
        btnCadastrar = new javax.swing.JButton();
        btnVoltarPainel = new javax.swing.JButton();
        lblAviso = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        lblControleDeClientes.setBackground(new java.awt.Color(255, 255, 255));
        lblControleDeClientes.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblControleDeClientes.setForeground(new java.awt.Color(255, 255, 255));
        lblControleDeClientes.setText("Controle de Usu�rios");
        jPanel1.add(lblControleDeClientes);
        lblControleDeClientes.setBounds(237, 70, 243, 32);

        btnBusca.setBackground(new java.awt.Color(0, 46, 116));
        btnBusca.setForeground(new java.awt.Color(255, 255, 255));
        btnBusca.setText("Buscar");
        btnBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaActionPerformed(evt);
            }
        });
        jPanel1.add(btnBusca);
        btnBusca.setBounds(326, 186, 71, 32);

        lblBusqueVeiculo.setBackground(new java.awt.Color(255, 255, 255));
        lblBusqueVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        lblBusqueVeiculo.setText("Busque o usu�rio");
        jPanel1.add(lblBusqueVeiculo);
        lblBusqueVeiculo.setBounds(311, 120, 99, 16);
        jPanel1.add(txtBuscaUsuario);
        txtBuscaUsuario.setBounds(274, 142, 181, 32);

        tableUsuario.setBackground(new java.awt.Color(255, 255, 255));
        tableUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Consultar", "Excluir"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableUsuario.setGridColor(new java.awt.Color(255, 255, 255));
        tableUsuario.setRowHeight(35);
        tableUsuario.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableUsuario);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(83, 232, 536, 134);

        btnCadastrar.setBackground(new java.awt.Color(0, 46, 116));
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastrar);
        btnCadastrar.setBounds(455, 392, 87, 32);

        btnVoltarPainel.setBackground(new java.awt.Color(0, 46, 116));
        btnVoltarPainel.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltarPainel.setText("Voltar para o Painel");
        btnVoltarPainel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarPainelActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltarPainel);
        btnVoltarPainel.setBounds(246, 453, 200, 80);

        lblAviso.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblAviso.setForeground(new java.awt.Color(255, 255, 255));
        lblAviso.setText("O usu�rio n�o est� aparecendo?");
        jPanel1.add(lblAviso);
        lblAviso.setBounds(159, 398, 250, 19);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background6.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(-20, -10, 730, 620);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        RegistrationScreenUsuario registrationScreenUsuario = new RegistrationScreenUsuario(this, rootPaneCheckingEnabled);
        registrationScreenUsuario.setVisible(true);

        registrationScreenUsuario.addWindowListener(new WindowAdapter() {

            public void windowClosed(WindowEvent e) {

                initDataController();
                initComponetsModel();
                decorateTableTask();
            }
        }) ;
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnVoltarPainelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarPainelActionPerformed
        // TODO add your handling code here:

        ScreenPainel painelScreen = new ScreenPainel();
        dispose();
        painelScreen.setVisible(true);
    }//GEN-LAST:event_btnVoltarPainelActionPerformed

    private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed
  
        initComponetsModel(txtBuscaUsuario.getText());
        decorateTableTask();

    }//GEN-LAST:event_btnBuscaActionPerformed

    private void tableUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableUsuarioMouseClicked

        int rowIndex = tableUsuario.rowAtPoint(evt.getPoint());
        int columnIndex = tableUsuario.columnAtPoint(evt.getPoint());

        Usuario usuario = usuarioModel.getUsuarios().get(rowIndex);

        switch(columnIndex) {
            case 1 :
                
            QueryScreenUsuario queryScreenUsuario = new QueryScreenUsuario(this,rootPaneCheckingEnabled);

            queryScreenUsuario.getLblShowId().setText(Integer.toString(usuario.getId()));
            queryScreenUsuario.getTxtNome().setText(usuario.getNome());
            queryScreenUsuario.getTxtCargo().setText(usuario.getCargo());
            queryScreenUsuario.getTxtLogin().setText(usuario.getLogin());
            queryScreenUsuario.getTxtSenha().setText(usuario.getSenha());
            queryScreenUsuario.getTxtEmail().setText(usuario.getSenha());

            queryScreenUsuario.setVisible(true);

            queryScreenUsuario.addWindowListener(new WindowAdapter() {

                public void windowClosed(WindowEvent e) {

                    initDataController();
                    initComponetsModel();
                    decorateTableTask();
                }
            }) ;
            break;
            case 2 :

            int resposta = JOptionPane.showOptionDialog(this,"Voc� realmente deseja apagar esse usu�rio?","Confirma��o",
                JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,
                null,
                new String[]{"Sim", "N�o"},
                "Sim"
            );

            // Verifica qual bot�o foi pressionado
            if (resposta == JOptionPane.YES_OPTION) {
                usuarioController.removeById(usuario.getId());
                usuarioModel.getUsuarios().remove(usuario);
                initDataController();
                initComponetsModel();
                decorateTableTask();
            }
            break;
        }
    }//GEN-LAST:event_tableUsuarioMouseClicked

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
            java.util.logging.Logger.getLogger(ScreenUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScreenUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScreenUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScreenUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScreenUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnVoltarPainel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAviso;
    private javax.swing.JLabel lblBusqueVeiculo;
    private javax.swing.JLabel lblControleDeClientes;
    private javax.swing.JTable tableUsuario;
    private javax.swing.JTextField txtBuscaUsuario;
    // End of variables declaration//GEN-END:variables
  
         public void decorateTableTask() {
         tableUsuario.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
         tableUsuario.getTableHeader().setBackground(new Color(42, 47, 79));
         tableUsuario.getTableHeader().setForeground(new Color(255, 255, 255));
         tableUsuario.setAutoCreateRowSorter(true);
         
         
         tableUsuario.getColumnModel().getColumn(1).setCellRenderer(new ButtonColumnCellRenderer("edit"));
         tableUsuario.getColumnModel().getColumn(2).setCellRenderer(new ButtonColumnCellRenderer("delete"));
     }
    
    
    
     public void initDataController() {
         
     usuarioController = new UsuarioController();
     }
     
     public void initComponetsModel() {

         usuarioModel = new TableModelUsuario();
         tableUsuario.setModel(usuarioModel);
         
          loadUsuarios();   
     }
     
     public void initComponetsModel(String nome) {

         usuarioModel = new TableModelUsuario();
         tableUsuario.setModel(usuarioModel);
         
          loadUsuarios(nome);   
     }
     
     public void loadUsuarios() {
         
       List<Usuario> usuarios = usuarioController.getAll();
       usuarioModel.setUsuarios(usuarios);
    }
     
     public void loadUsuarios(String nome) {
         
       List<Usuario> veiculos = usuarioController.getAllByNome(nome);
       usuarioModel.setUsuarios(veiculos);
     }

}

