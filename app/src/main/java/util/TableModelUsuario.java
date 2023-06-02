/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import controller.UsuarioController;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Usuario;

/**
 *
 * @author User
 */
public class TableModelUsuario extends AbstractTableModel {
    
    String[] columns = {"Nome","Editar", "Excluir"};
    List<Usuario> usuarios = new ArrayList();
    TableModelUsuario usuarioModel;
    UsuarioController usuarioController = new UsuarioController();
    
    @Override
    public int getRowCount() {
        return usuarios.size();
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
         
        switch(columnIndex) {
            
            case 0: 
                 return usuarios.get(rowIndex).getNome();
            case 1:
                return "";
            case 2: 
                return "";
            default:    
            return "Dados não encontrado";
        }
        
    }
    
    public String[] getColumns() {
        return columns;
    }
    
    public List<Usuario> getUsuarios() {
        return usuarios;
    }
    
    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
}
