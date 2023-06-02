/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import controller.AluguelController;
import controller.ClienteController;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import model.Aluguel;
import view.RegistrationScreenAluguel;

/**
 *
 * @author User
 */
public class TableModelAluguel extends AbstractTableModel {

    String[] columns = {"Nome do Cliente","Veiculo Alugado", "Data do Aluguel", "Editar", "Excluir"};
    List<Aluguel> alugueis = new ArrayList();
    TableModelAluguel tableModelAluguel;
    AluguelController aluguelController = new AluguelController();
    ClienteController clienteController = new ClienteController();
    
    @Override
    public int getRowCount() {
        return alugueis.size();
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
         
        Date data = alugueis.get(rowIndex).getDataAluguel();     
        
        DateFormat formatoSaida = new SimpleDateFormat("dd-MM-yyyy");
        
        String dataConvertida = formatoSaida.format(data);

        switch(columnIndex) {
            
            case 0: 
                return alugueis.get(rowIndex).getCliente().getNomeCliente();
            case 1:
                return alugueis.get(rowIndex).getVeiculo().getModelo();
            case 2: 
                return dataConvertida;
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
    
    public List<Aluguel> getAlugueis() {
        return alugueis;
    }
    
    public void setAlugueis(List<Aluguel> alugueis) {
        this.alugueis = alugueis;
    }
}