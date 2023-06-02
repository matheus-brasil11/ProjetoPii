/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import controller.AluguelController;
import controller.ClienteController;
import controller.VeiculoController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import model.Aluguel;

/**
 *
 * @author User
 */
public class QueryScreenAluguel extends javax.swing.JDialog {

     MaskFormatter mf = null; 
    
    public QueryScreenAluguel(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);

        try {
        mf = new MaskFormatter("##-##-####");
        mf.setPlaceholderCharacter('_');
        } catch (ParseException e) {
        e.printStackTrace();
        }
        
        txtDataAluguel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(mf));   
        txtDataEntrega.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(mf));   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblIdVeiculo = new javax.swing.JLabel();
        txtDataEntrega = new javax.swing.JFormattedTextField();
        lblIdCliente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaObservacao = new javax.swing.JTextArea();
        lblShowIdCliente = new javax.swing.JLabel();
        lblIdAluguel = new javax.swing.JLabel();
        lblDataEntrega = new javax.swing.JLabel();
        lblShowIdAluguel = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        btnAlterar = new javax.swing.JButton();
        txtValor = new javax.swing.JTextField();
        lblDataAluguel = new javax.swing.JLabel();
        lblSelectVeiculo = new javax.swing.JLabel();
        lblEntregue = new javax.swing.JLabel();
        lblObservacao = new javax.swing.JLabel();
        txtDataAluguel = new javax.swing.JFormattedTextField();
        cbVeiculo = new javax.swing.JComboBox<>();
        lblSelectCliente = new javax.swing.JLabel();
        lblShowIdVeiculo = new javax.swing.JLabel();
        cbCliente = new javax.swing.JComboBox<>();
        cbEntregue = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        lblIdVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        lblIdVeiculo.setText("ID = ");
        jPanel1.add(lblIdVeiculo);
        lblIdVeiculo.setBounds(157, 106, 40, 16);

        txtDataEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataEntregaActionPerformed(evt);
            }
        });
        jPanel1.add(txtDataEntrega);
        txtDataEntrega.setBounds(209, 182, 125, 30);

        lblIdCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblIdCliente.setText("ID = ");
        jPanel1.add(lblIdCliente);
        lblIdCliente.setBounds(340, 106, 40, 16);

        txtAreaObservacao.setColumns(20);
        txtAreaObservacao.setRows(5);
        jScrollPane1.setViewportView(txtAreaObservacao);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(79, 322, 223, 83);

        lblShowIdCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblShowIdCliente.setText("0");
        jPanel1.add(lblShowIdCliente);
        lblShowIdCliente.setBounds(370, 106, 21, 16);

        lblIdAluguel.setForeground(new java.awt.Color(255, 255, 255));
        lblIdAluguel.setText("ID Aluguel =");
        jPanel1.add(lblIdAluguel);
        lblIdAluguel.setBounds(147, 36, 66, 16);

        lblDataEntrega.setForeground(new java.awt.Color(255, 255, 255));
        lblDataEntrega.setText("*Data de Entrega");
        jPanel1.add(lblDataEntrega);
        lblDataEntrega.setBounds(209, 160, 95, 16);

        lblShowIdAluguel.setForeground(new java.awt.Color(255, 255, 255));
        lblShowIdAluguel.setText("0");
        jPanel1.add(lblShowIdAluguel);
        lblShowIdAluguel.setBounds(219, 36, 172, 16);

        lblValor.setForeground(new java.awt.Color(255, 255, 255));
        lblValor.setText("*Valor ");
        jPanel1.add(lblValor);
        lblValor.setBounds(210, 230, 38, 16);

        btnAlterar.setBackground(new java.awt.Color(0, 46, 116));
        btnAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlterar);
        btnAlterar.setBounds(39, 438, 308, 57);

        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });
        jPanel1.add(txtValor);
        txtValor.setBounds(209, 248, 125, 24);

        lblDataAluguel.setForeground(new java.awt.Color(255, 255, 255));
        lblDataAluguel.setText("*Data do Aluguel");
        jPanel1.add(lblDataAluguel);
        lblDataAluguel.setBounds(26, 160, 93, 16);

        lblSelectVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        lblSelectVeiculo.setText("*Selecione um veículo");
        jPanel1.add(lblSelectVeiculo);
        lblSelectVeiculo.setBounds(26, 79, 125, 16);

        lblEntregue.setForeground(new java.awt.Color(255, 255, 255));
        lblEntregue.setText("Entregue");
        jPanel1.add(lblEntregue);
        lblEntregue.setBounds(30, 230, 51, 16);

        lblObservacao.setForeground(new java.awt.Color(255, 255, 255));
        lblObservacao.setText("Observação");
        jPanel1.add(lblObservacao);
        lblObservacao.setBounds(157, 300, 69, 16);

        txtDataAluguel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataAluguelActionPerformed(evt);
            }
        });
        jPanel1.add(txtDataAluguel);
        txtDataAluguel.setBounds(26, 182, 125, 30);

        cbVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbVeiculoActionPerformed(evt);
            }
        });
        jPanel1.add(cbVeiculo);
        cbVeiculo.setBounds(26, 101, 125, 26);

        lblSelectCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblSelectCliente.setText("*Selecione um cliente");
        jPanel1.add(lblSelectCliente);
        lblSelectCliente.setBounds(209, 79, 125, 16);

        lblShowIdVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        lblShowIdVeiculo.setText("0");
        jPanel1.add(lblShowIdVeiculo);
        lblShowIdVeiculo.setBounds(187, 106, 21, 16);

        cbCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbClienteActionPerformed(evt);
            }
        });
        jPanel1.add(cbCliente);
        cbCliente.setBounds(209, 101, 125, 26);

        cbEntregue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não" }));
        cbEntregue.setSelectedIndex(1);
        jPanel1.add(cbEntregue);
        cbEntregue.setBounds(25, 250, 130, 24);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background5.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-9, -14, 430, 570);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void txtDataEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataEntregaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataEntregaActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
   
         
        Aluguel aluguel = new Aluguel();
        
        AluguelController aluguelController = new AluguelController();
        ClienteController clienteController = new ClienteController();
        VeiculoController veiculoController = new VeiculoController();
        
        String dataString = txtDataAluguel.getValue().toString();
        String dataString2 = txtDataEntrega.getValue().toString();
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        
        Date dataFormatada = null;
        Date dataFormatada2 = null;
            
        try {
             dataFormatada = sdf.parse(dataString);
             dataFormatada2 = sdf.parse(dataString2);
         } catch (ParseException ex) {
             Logger.getLogger(RegistrationScreenAluguel.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        aluguel.getCliente().setId(clienteController.getById(Integer.parseInt(getlblShowIdCliente().getText())).getId());
        aluguel.setDataAluguel(dataFormatada);
        aluguel.setDataEntrega(dataFormatada2);
        aluguel.getVeiculo().setId(veiculoController.getById(Integer.parseInt(getlblShowIdVeiculo().getText())).getId());
        aluguel.setEntregue(cbEntregue.getSelectedItem().toString());
        aluguel.setObservacao(getTxtAreaObservacao().getText());
        aluguel.setValorPago(Float.parseFloat(getTxtValor().getText()));
        aluguel.setId(Integer.parseInt(getLblShowIdAluguel().getText()));
        
        aluguelController.update(aluguel);
        
        JOptionPane.showMessageDialog(null, "Aluguel Alterado com Sucesso");
        
        dispose();
        
        


        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void txtDataAluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataAluguelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataAluguelActionPerformed

    private void cbVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVeiculoActionPerformed
       cbVeiculo.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
             
        VeiculoController veiculoController = new VeiculoController();  
             
        getlblShowIdVeiculo().setText(Integer.toString(veiculoController.getIdByModelo(getCbVeiculo().getSelectedItem().toString())));
        
       }
       });
        // TODO add your handling code here:
    }//GEN-LAST:event_cbVeiculoActionPerformed

    private void cbClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbClienteActionPerformed
         cbCliente.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
               
        ClienteController clienteController = new ClienteController();  
             
        getlblShowIdCliente().setText(Integer.toString(clienteController.getIdByName(getCbCliente().getSelectedItem().toString())));
        
       }
       });  
             // TODO add your handling code here:
    }//GEN-LAST:event_cbClienteActionPerformed

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
            java.util.logging.Logger.getLogger(QueryScreenAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QueryScreenAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QueryScreenAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QueryScreenAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                QueryScreenAluguel dialog = new QueryScreenAluguel(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JComboBox<String> cbCliente;
    private javax.swing.JComboBox<String> cbEntregue;
    private javax.swing.JComboBox<String> cbVeiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDataAluguel;
    private javax.swing.JLabel lblDataEntrega;
    private javax.swing.JLabel lblEntregue;
    private javax.swing.JLabel lblIdAluguel;
    private javax.swing.JLabel lblIdCliente;
    private javax.swing.JLabel lblIdVeiculo;
    private javax.swing.JLabel lblObservacao;
    private javax.swing.JLabel lblSelectCliente;
    private javax.swing.JLabel lblSelectVeiculo;
    private javax.swing.JLabel lblShowIdAluguel;
    private javax.swing.JLabel lblShowIdCliente;
    private javax.swing.JLabel lblShowIdVeiculo;
    private javax.swing.JLabel lblValor;
    private javax.swing.JTextArea txtAreaObservacao;
    private javax.swing.JFormattedTextField txtDataAluguel;
    private javax.swing.JFormattedTextField txtDataEntrega;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables

    
    public JLabel getLblShowIdAluguel(){
        return lblShowIdAluguel;
    }

    public JLabel getlblShowIdCliente() {
    return lblShowIdCliente;
    }
    
    public void setlblShowIdCliente(JLabel lblShowIdCliente) {
        this.lblShowIdCliente = lblShowIdCliente;
    }
    
    public JLabel getlblShowIdVeiculo() {
    return lblShowIdVeiculo;
    }
    
    public void setlblShowIdVeiculo(JLabel lblShowIdVeiculo) {
    this.lblShowIdVeiculo = lblShowIdVeiculo;
    }
    
    public JButton getBtnAlterar() {
        return btnAlterar;
    }

    public void setBtnAlterar(JButton btnAlterar) {
        this.btnAlterar = btnAlterar;
    }

    public JComboBox<String> getCbCliente() {
        return cbCliente;
    }

    public void setCbCliente(JComboBox<String> cbCliente) {
        this.cbCliente = cbCliente;
    }

    public JComboBox<String> getCbVeiculo() {
        return cbVeiculo;
    }

    public void setCbVeiculo(JComboBox<String> cbVeiculo) {
        this.cbVeiculo = cbVeiculo;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JLabel getLblDataAluguel() {
        return lblDataAluguel;
    }

    public void setLblDataAluguel(JLabel lblDataAluguel) {
        this.lblDataAluguel = lblDataAluguel;
    }

    public JLabel getLblDataEntrega() {
        return lblDataEntrega;
    }

    public void setLblDataEntrega(JLabel lblDataEntrega) {
        this.lblDataEntrega = lblDataEntrega;
    }

    public JLabel getLblEntregue() {
        return lblEntregue;
    }

    public void setLblEntregue(JLabel lblEntregue) {
        this.lblEntregue = lblEntregue;
    }

    public JLabel getLblObservacao() {
        return lblObservacao;
    }

    public void setLblObservacao(JLabel lblObservacao) {
        this.lblObservacao = lblObservacao;
    }

    public JLabel getLblSelectCliente() {
        return lblSelectCliente;
    }

    public void setLblSelectCliente(JLabel lblSelectCliente) {
        this.lblSelectCliente = lblSelectCliente;
    }

    public JLabel getLblSelectVeiculo() {
        return lblSelectVeiculo;
    }

    public void setLblSelectVeiculo(JLabel lblSelectVeiculo) {
        this.lblSelectVeiculo = lblSelectVeiculo;
    }

    public JLabel getLblValor() {
        return lblValor;
    }

    public void setLblValor(JLabel lblValor) {
        this.lblValor = lblValor;
    }

    public JTextArea getTxtAreaObservacao() {
        return txtAreaObservacao;
    }

    public void setTxtAreaObservacao(JTextArea txtAreaObservacao) {
        this.txtAreaObservacao = txtAreaObservacao;
    }

    public JFormattedTextField getTxtDataAluguel() {
        return txtDataAluguel;
    }

    public void setTxtDataAluguel(JFormattedTextField txtDataAluguel) {
        this.txtDataAluguel = txtDataAluguel;
    }

    public JFormattedTextField getTxtDataEntrega() {
        return txtDataEntrega;
    }

    public void setTxtDataEntrega(JFormattedTextField txtDataEntrega) {
        this.txtDataEntrega = txtDataEntrega;
    }

    public JTextField getTxtValor() {
        return txtValor;
    }

    public void setTxtValor(JTextField txtValor) {
        this.txtValor = txtValor;
    }

    public JComboBox<String> getCbEntregue() {
        return cbEntregue;
    }

    public void setCbEntregue(JComboBox<String> cbEntregue) {
        this.cbEntregue = cbEntregue;
    }

 


}
