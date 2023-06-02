/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.AluguelController;
import controller.ClienteController;
import controller.VeiculoController;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Aluguel;
import util.ButtonColumnCellRenderer;
import util.TableModelAluguel;

/**
 *
 * @author User
 */
public class ScreenAluguel extends javax.swing.JFrame {

    AluguelController aluguelController = new AluguelController();
    
    TableModelAluguel aluguelModel;
   
    public ScreenAluguel() {
        initComponents();
        initDataController();
        initComponetsModel();
        decorateTableTask();
        setLocationRelativeTo(null); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblControleDeClientes = new javax.swing.JLabel();
        lblBusqueCliente = new javax.swing.JLabel();
        txtBuscaAluguel = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAluguel = new javax.swing.JTable();
        lblAviso = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnBusca = new javax.swing.JButton();
        btnVoltarPainel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cbEntregue = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(10, 77, 104));
        jPanel1.setLayout(null);

        lblControleDeClientes.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblControleDeClientes.setForeground(new java.awt.Color(255, 255, 255));
        lblControleDeClientes.setText("Controle de Alugueis");
        jPanel1.add(lblControleDeClientes);
        lblControleDeClientes.setBounds(224, 52, 243, 32);

        lblBusqueCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblBusqueCliente.setText("Busque o aluguel pelo nome do Cliente");
        jPanel1.add(lblBusqueCliente);
        lblBusqueCliente.setBounds(233, 110, 218, 16);

        txtBuscaAluguel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaAluguelActionPerformed(evt);
            }
        });
        jPanel1.add(txtBuscaAluguel);
        txtBuscaAluguel.setBounds(253, 132, 182, 32);

        tableAluguel.setBackground(new java.awt.Color(255, 255, 255));
        tableAluguel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome do Cliente", "Veiculo Alugado", "Data Aluguel", "Editar", "Excluir"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableAluguel.setGridColor(new java.awt.Color(255, 255, 255));
        tableAluguel.setRowHeight(35);
        tableAluguel.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableAluguel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableAluguelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableAluguel);
        if (tableAluguel.getColumnModel().getColumnCount() > 0) {
            tableAluguel.getColumnModel().getColumn(0).setResizable(false);
            tableAluguel.getColumnModel().getColumn(1).setResizable(false);
            tableAluguel.getColumnModel().getColumn(2).setResizable(false);
            tableAluguel.getColumnModel().getColumn(3).setResizable(false);
            tableAluguel.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(42, 220, 632, 178);

        lblAviso.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblAviso.setForeground(new java.awt.Color(255, 255, 255));
        lblAviso.setText("O Aluguel não está aparecendo?");
        jPanel1.add(lblAviso);
        lblAviso.setBounds(168, 423, 240, 19);

        btnCadastrar.setBackground(new java.awt.Color(0, 46, 116));
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastrar);
        btnCadastrar.setBounds(423, 410, 95, 43);

        btnBusca.setBackground(new java.awt.Color(0, 46, 116));
        btnBusca.setForeground(new java.awt.Color(255, 255, 255));
        btnBusca.setText("Buscar");
        btnBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaActionPerformed(evt);
            }
        });
        jPanel1.add(btnBusca);
        btnBusca.setBounds(307, 170, 71, 32);

        btnVoltarPainel.setBackground(new java.awt.Color(0, 46, 116));
        btnVoltarPainel.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltarPainel.setText("Voltar para o Painel");
        btnVoltarPainel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarPainelActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltarPainel);
        btnVoltarPainel.setBounds(252, 465, 199, 76);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Status");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(530, 150, 37, 16);

        cbEntregue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todas", "Sim", "Não" }));
        cbEntregue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEntregueActionPerformed(evt);
            }
        });
        jPanel1.add(cbEntregue);
        cbEntregue.setBounds(515, 170, 70, 26);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background8.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-30, -30, 880, 780);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscaAluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaAluguelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaAluguelActionPerformed

    private void tableAluguelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableAluguelMouseClicked

        int rowIndex = tableAluguel.rowAtPoint(evt.getPoint());
        int columnIndex = tableAluguel.columnAtPoint(evt.getPoint());

        Aluguel aluguel = aluguelModel.getAlugueis().get(rowIndex);
        AluguelController AluguelController = new AluguelController();
                        
            VeiculoController veiculoController = new VeiculoController();
            ClienteController clienteController = new ClienteController(); 

            switch(columnIndex) {
            case 3:
              
            DateFormat formatoSaida = new SimpleDateFormat("dd-MM-yyyy");
         
            String dataConvertida = formatoSaida.format(aluguel.getDataAluguel());
            String dataConvertida2 = formatoSaida.format(aluguel.getDataEntrega());
             
            QueryScreenAluguel queryScreenAluguel = new QueryScreenAluguel(this,rootPaneCheckingEnabled);    
        
            veiculoController.getAllModelos(queryScreenAluguel.getCbVeiculo());
            clienteController.getAllNames(queryScreenAluguel.getCbCliente());   
                       
            queryScreenAluguel.getlblShowIdVeiculo().setText(Integer.toString(veiculoController.getIdByModelo(queryScreenAluguel.getCbVeiculo().getSelectedItem().toString())));
            queryScreenAluguel.getlblShowIdCliente().setText(Integer.toString(clienteController.getIdByName(queryScreenAluguel.getCbCliente().getSelectedItem().toString())));
            queryScreenAluguel.getLblShowIdAluguel().setText(Integer.toString(aluguel.getId()));
                        
            queryScreenAluguel.getCbCliente().setSelectedItem(aluguel.getCliente().getNomeCliente());
            queryScreenAluguel.getCbVeiculo().setSelectedItem(aluguel.getVeiculo().getModelo().toString());          
          
            queryScreenAluguel.getTxtDataAluguel().setValue(dataConvertida);
            queryScreenAluguel.getTxtDataEntrega().setValue(dataConvertida2);
            
            
            queryScreenAluguel.getCbEntregue().setSelectedItem(aluguel.getEntregue());
            queryScreenAluguel.getTxtValor().setText(Float.toString(aluguel.getValorPago()));
            queryScreenAluguel.getTxtAreaObservacao().setText(aluguel.getObservacao());
            
            queryScreenAluguel.setVisible(rootPaneCheckingEnabled);

            queryScreenAluguel.addWindowListener(new WindowAdapter() {

                public void windowClosed(WindowEvent e) {

                    initDataController();
                    initComponetsModel();
                    decorateTableTask();
                }
            }) ;
            break;
            case 4 :

            int resposta = JOptionPane.showOptionDialog(this,"Você realmente deseja apagar esse Aluguel?","Confirmação",
                JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,
                null,
                new String[]{"Sim", "Não"},
                "Sim"
            );

            // Verifica qual botão foi pressionado
            if (resposta == JOptionPane.YES_OPTION) {
                AluguelController.removeById(aluguel.getId());
                aluguelModel.getAlugueis().remove(aluguel);
                initDataController();
                initComponetsModel();
                decorateTableTask();
            }
            break;
        }
    }//GEN-LAST:event_tableAluguelMouseClicked

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        VeiculoController veiculoController = new VeiculoController();
        ClienteController clienteController = new ClienteController();
        
        RegistrationScreenAluguel registrationScreenAluguel = new RegistrationScreenAluguel(this, rootPaneCheckingEnabled);     
        
        veiculoController.getAllModelosAlugados(registrationScreenAluguel.getCbVeiculo());
        clienteController.getAllNames(registrationScreenAluguel.getCbCliente());    
        
        registrationScreenAluguel.getlblShowIdVeiculo().setText(Integer.toString(veiculoController.getIdByModelo(registrationScreenAluguel.getCbVeiculo().getSelectedItem().toString())));
        registrationScreenAluguel.getlblShowIdCliente().setText(Integer.toString(clienteController.getIdByName(registrationScreenAluguel.getCbCliente().getSelectedItem().toString())));
        
        registrationScreenAluguel.setVisible(true);

        registrationScreenAluguel.addWindowListener(new WindowAdapter() {

        public void windowClosed(WindowEvent e) {  
            initDataController();
            initComponetsModel();
            decorateTableTask();
                                                 }
        }) ;
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed

         initComponetsModel(txtBuscaAluguel.getText());
         decorateTableTask();
        
    }//GEN-LAST:event_btnBuscaActionPerformed

    private void btnVoltarPainelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarPainelActionPerformed
        // TODO add your handling code here:

        ScreenPainel painelScreen = new ScreenPainel();
        dispose();
        painelScreen.setVisible(true);
    }//GEN-LAST:event_btnVoltarPainelActionPerformed

    private void cbEntregueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEntregueActionPerformed

         cbEntregue.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            if(cbEntregue.getSelectedItem() == "Todas")  {
                initComponetsModel();
                decorateTableTask();
            } else {
               initComponetsModelEntregue(cbEntregue.getSelectedItem().toString()); 
               decorateTableTask();
            }
       }
       });


        // TODO add your handling code here:
    }//GEN-LAST:event_cbEntregueActionPerformed

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
            java.util.logging.Logger.getLogger(ScreenAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScreenAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScreenAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScreenAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScreenAluguel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnVoltarPainel;
    private javax.swing.JComboBox<String> cbEntregue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAviso;
    private javax.swing.JLabel lblBusqueCliente;
    private javax.swing.JLabel lblControleDeClientes;
    private javax.swing.JTable tableAluguel;
    private javax.swing.JTextField txtBuscaAluguel;
    // End of variables declaration//GEN-END:variables
      
    public void decorateTableTask() {
         tableAluguel.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
         tableAluguel.getTableHeader().setBackground(new Color(42, 47, 79));
         tableAluguel.getTableHeader().setForeground(new Color(255, 255, 255));
         tableAluguel.setAutoCreateRowSorter(true);
         tableAluguel.getColumnModel().getColumn(3).setCellRenderer(new ButtonColumnCellRenderer("edit"));
         tableAluguel.getColumnModel().getColumn(4).setCellRenderer(new ButtonColumnCellRenderer("delete"));
     }
     
     public void initDataController() {
         
         aluguelController = new AluguelController();
     }
     
     public void initComponetsModel() {

         aluguelModel = new TableModelAluguel();
         tableAluguel.setModel(aluguelModel);
         
         loadAlugueis();   
     }
     
     public void initComponetsModel(String model) {

         aluguelModel = new TableModelAluguel();
         tableAluguel.setModel(aluguelModel);
         
         loadAlugueis(model);   
     }
     
    public void initComponetsModelEntregue(String situacao) {

         aluguelModel = new TableModelAluguel();
         tableAluguel.setModel(aluguelModel);
         
         loadAlugueisEntregue(situacao);   
     }
     
     public void loadAlugueis() {
         
       List<Aluguel> alugueis = aluguelController.getAll();
       aluguelModel.setAlugueis(alugueis);
    }
     
     public void loadAlugueis(String nome) {
         
       List<Aluguel> alugueis = aluguelController.getAllByNome(nome);
       aluguelModel.setAlugueis(alugueis);
     }
     
     public void loadAlugueisEntregue(String situacao) {
         
       List<Aluguel> alugueis = aluguelController.getAllByEntregue(situacao);
       aluguelModel.setAlugueis(alugueis);
     } 

}
