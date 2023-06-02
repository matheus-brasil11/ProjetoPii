/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;


import controller.VeiculoController;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Veiculo;

/**
 *
 * @author User
 */
public class TableModelVeiculo extends AbstractTableModel{
 
    String[] columns = {"Placa","Alugado","Modelo", "Consultar", "Excluir"};
    List<Veiculo> veiculos = new ArrayList();
    TableModelVeiculo veiculoModel;
    VeiculoController veiculoController = new VeiculoController();
    
    @Override
    public int getRowCount() {
        return veiculos.size();
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
                 return veiculos.get(rowIndex).getPlaca();
            case 1:
                boolean result = veiculoController.verificarVeiculoAlugado(veiculos.get(rowIndex));
                
               String str = (result) ? "Sim" : "Não";
               
               return str;
                
            case 2: 
                return veiculos.get(rowIndex).getModelo();
            case 3:
                return "";
            case 4:
                return "";    
                
            default:    
            return "Dados não encontrado";
        }
        
    }
    
    public String[] getColumns() {
        return columns;
    }
    
    public List<Veiculo> getVeiculos() {
        return veiculos;
    }
    
    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }
    
    
}
