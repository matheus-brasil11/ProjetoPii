        /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import model.Veiculo;
import util.ConnectionFactory;

/**
 *
 * @author User
 */
public class VeiculoController {   
    
    public boolean save(Veiculo veiculo) {
        
       Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        String sql = null;
        
        try {
          
        connection = ConnectionFactory.getConnection();
        
        sql = "Select placa from veiculo where placa = ?";    
             
        statement = connection.prepareStatement(sql);        
        statement.setString(1, veiculo.getPlaca());
        resultSet = statement.executeQuery();  
        
        
        if (resultSet.next()) {
        
        return false; 
        
        } else {
         
        sql = "INSERT INTO veiculo (numero, placa, fabricante, modelo, anoModelo, qtdPortas, acessorios) VALUES (?, ?, ?, ?, ?, ?, ?)";    
            
        statement = connection.prepareStatement(sql); 
            
        statement.setString(1, veiculo.getNumero());
        statement.setString(2, veiculo.getPlaca());
        statement.setString(3, veiculo.getFabricante());
        statement.setString(4, veiculo.getModelo());
        statement.setInt(5, veiculo.getAnoModelo());
        statement.setInt(6, veiculo.getQtdPortas());
        statement.setString(7, veiculo.getAcessorios());
        
        statement.execute();
        
        return true;
        
        }
        
        } catch (SQLException ex) {
            
            throw new RuntimeException("Erro ao salvar Veiculo");
            
        } finally {
            
            ConnectionFactory.closeConnection(connection, statement, resultSet);

        }
    }

       
     public void update(Veiculo veiculo) {
        
        String sql = "UPDATE veiculo SET numero = ?, placa = ?, fabricante = ?, modelo = ?, anoModelo = ?, qtdPortas = ?, acessorios = ? WHERE id = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql); 
            
            statement.setString(1, veiculo.getNumero());
            statement.setString(2, veiculo.getPlaca());
            statement.setString(3, veiculo.getFabricante());
            statement.setString(4, veiculo.getModelo());
            statement.setInt(5, veiculo.getAnoModelo());
            statement.setInt(6, veiculo.getQtdPortas());
            statement.setString(7, veiculo.getAcessorios());
            statement.setInt(8, veiculo.getId());
            
            statement.execute();
            
        } catch (Exception ex) {
            
            throw new RuntimeException("Erro ao atualizar veiculo");
        } finally {
             
             ConnectionFactory.closeConnection(connection, statement);
             
         }     
    }
        
     public void removeById (int Id) {
        
         String sql = "DELETE FROM veiculo WHERE id = ?";
         
         Connection connection = null;
         PreparedStatement statement = null;
         
         try {

             connection = ConnectionFactory.getConnection();
             statement = connection.prepareStatement(sql);
             
             statement.setInt(1, Id);
             statement.execute();

         } catch (Exception ex) {
             
             throw new RuntimeException("Erro ao deletar Veiculo");
             
         } finally {
             
             ConnectionFactory.closeConnection(connection, statement);   
         }           
    } 
     
        public List<Veiculo> getAll() {
              
        String sql = "SELECT * FROM veiculo";
        
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        List<Veiculo> veiculos = new ArrayList<Veiculo>();
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            
        while(resultSet.next()) {
            
            Veiculo veiculo = new Veiculo();
            
            
            veiculo.setId(resultSet.getInt("id"));
            veiculo.setNumero(resultSet.getString("numero"));
            veiculo.setPlaca(resultSet.getString("placa"));
            veiculo.setFabricante(resultSet.getString("fabricante"));
            veiculo.setModelo(resultSet.getString("modelo"));
            veiculo.setAnoModelo(resultSet.getInt("anoModelo"));
            veiculo.setQtdPortas(resultSet.getInt("qtdPortas"));
            veiculo.setAcessorios(resultSet.getString("acessorios"));

            veiculos.add(veiculo);            
        }    
            
        } catch (Exception ex) {
             throw new RuntimeException("Erro ao trazer veiculos " + ex.getMessage() + ex );            
        } finally {           
            ConnectionFactory.closeConnection(connection, statement, resultSet);
        }      
        return veiculos;
    }  
        
        public int getIdByModelo(String modelo) {
              
        String sql = "SELECT id FROM veiculo WHERE modelo = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        int id = 0;
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setString(1, modelo);
            resultSet = statement.executeQuery();
            
        while(resultSet.next()) {
            
            id = resultSet.getInt("id"); 
            
        }    
            
        } catch (Exception ex) {
             throw new RuntimeException("Erro ao trazer veiculos " + ex.getMessage() + ex );            
        } finally {           
            ConnectionFactory.closeConnection(connection, statement, resultSet);
        }   
        
        return id;
    }  
    
       public void getAllModelosAlugados(JComboBox comboBox) {
              
        String sql = "SELECT modelo FROM Veiculo V Left Join Aluguel A On V.id = A.idVeiculo WHERE a.idVeiculo is Null";
        
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            
        while(resultSet.next()) {
             
            comboBox.addItem(resultSet.getString("modelo"));          
        }    
            
        } catch (Exception ex) {
             throw new RuntimeException("Erro ao trazer veiculos para o comboBox " + ex.getMessage() + ex );            
        } finally {           
            ConnectionFactory.closeConnection(connection, statement, resultSet);
        }      
    }     
       
       public void getAllModelos(JComboBox comboBox) {
              
        String sql = "SELECT modelo FROM Veiculo V Left Join Aluguel A On V.id = A.idVeiculo";
        
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            
        while(resultSet.next()) {
             
            comboBox.addItem(resultSet.getString("modelo"));          
        }    
            
        } catch (Exception ex) {
             throw new RuntimeException("Erro ao trazer veiculos para o comboBox " + ex.getMessage() + ex );            
        } finally {           
            ConnectionFactory.closeConnection(connection, statement, resultSet);
        }      
    }      
        
    
     public Veiculo getById(int Id) {
         
        String sql = "SELECT * FROM veiculo where id = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        Veiculo veiculoEx = null;
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, Id);
            resultSet = statement.executeQuery();
            
        while(resultSet.next()) { 
            
            Veiculo veiculo = new Veiculo();
            
            veiculo.setId(resultSet.getInt("id"));
            veiculo.setNumero(resultSet.getString("numero"));
            veiculo.setPlaca(resultSet.getString("placa"));
            veiculo.setFabricante(resultSet.getString("fabricante"));
            veiculo.setModelo(resultSet.getString("modelo"));
            veiculo.setAnoModelo(resultSet.getInt("anoModelo"));
            veiculo.setQtdPortas(resultSet.getInt("qtdPortas"));
            veiculo.setAcessorios(resultSet.getString("acessorios"));       
            
           veiculoEx = veiculo;
        }    
            
        } catch (Exception ex) {
             throw new RuntimeException("Erro ao trazer veiculo " + ex.getMessage() + ex );            
        } finally {           
            ConnectionFactory.closeConnection(connection, statement, resultSet);
        } 

        return veiculoEx;          
     }
     
    public List<Veiculo> getAllByModelo(String modelo) {
              
        String sql = "SELECT * FROM veiculo where modelo LIKE ? || fabricante LIKE ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        List<Veiculo> veiculos = new ArrayList<Veiculo>();
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setString(1, modelo + "%");
            statement.setString(2, modelo + "%");
            resultSet = statement.executeQuery();
            
        while(resultSet.next()) {
            
            Veiculo veiculo = new Veiculo();
            
            
            veiculo.setId(resultSet.getInt("id"));
            veiculo.setNumero(resultSet.getString("numero"));
            veiculo.setPlaca(resultSet.getString("placa"));
            veiculo.setFabricante(resultSet.getString("fabricante"));
            veiculo.setModelo(resultSet.getString("modelo"));
            veiculo.setAnoModelo(resultSet.getInt("anoModelo"));
            veiculo.setQtdPortas(resultSet.getInt("qtdPortas"));
            veiculo.setAcessorios(resultSet.getString("acessorios"));

            veiculos.add(veiculo);            
        }    
            
        } catch (Exception ex) {
             throw new RuntimeException("Erro ao trazer veiculos " + ex.getMessage() + ex );            
        } finally {           
            ConnectionFactory.closeConnection(connection, statement, resultSet);
        }      
        return veiculos;
    }    
    
    
    
    
    
    public boolean verificarVeiculoAlugado(Veiculo veiculo){
        
        String sql = "SELECT * FROM Veiculo V Join Aluguel A On ? = A.idVeiculo Where a.entregue = 'Não'";
        
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, veiculo.getId());
            resultSet = statement.executeQuery();
            
        return resultSet.next() == true;
    
        } catch (Exception ex) {
             throw new RuntimeException("Erro ao verificar Veiculo " + ex.getMessage() + ex );            
        } finally {           
            ConnectionFactory.closeConnection(connection, statement, resultSet);
        }      
    }
    
}
