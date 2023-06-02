/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;


import controller.ClienteController;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Cliente;
/**
 *
 * @author User
 */
public class TableModelCliente extends AbstractTableModel{

    String[] columns = {"CPF", "Nome", "Editar", "Excluir"};
    List<Cliente> clientes = new ArrayList();
    TableModelCliente clienteModel;
    ClienteController clienteController = new ClienteController();
    
    @Override
    public int getRowCount() {
        return clientes.size();
    }

    @Override
    public int getColumnCount() {   
        return columns.length;    
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return columns[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        int v = 2;
        
        switch(columnIndex) {
            
            case 0: 
                 return clientes.get(rowIndex).getCpf();
            case 1:
                return clientes.get(rowIndex).getNomeCliente();
            case 2: 
                  return "";
            case 3:
                
                if (v > 3) 
                
                return "";
                        
                else 
                    
                    return"";
                
            default:    
            return "Dados não encontrado";
        }
        
    }
    
    public String[] getColumns() {
        return columns;
    }
    
    public List<Cliente> getClientes() {
        return clientes;
    }
    
    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
}
