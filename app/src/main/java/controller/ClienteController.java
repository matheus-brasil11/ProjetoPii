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
import model.Cliente;
import util.ConnectionFactory;

/**
 *
 * @author User
 */
public class ClienteController { 
     public boolean save(Cliente cliente) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        String sql = null;
        
        try {
            
        connection = ConnectionFactory.getConnection();    
        
        sql = "SELECT cpf FROM cliente WHERE cpf = ?";
  
        statement = connection.prepareStatement(sql);        
        statement.setString(1, cliente.getCpf());
        
        resultSet = statement.executeQuery();

        if (resultSet.next()) {
            
            return false;  
            
        } else {
            
        sql = "INSERT INTO cliente (nomeCliente, endereco, uf, telefone, cpf, email) VALUES (?, ?, ?, ?, ?, ?)";    
                 
        statement = connection.prepareStatement(sql);
         
        statement.setString(1, cliente.getNomeCliente());
        statement.setString(2, cliente.getEndereco());
        statement.setString(3, cliente.getUf());
        statement.setString(4, cliente.getTelefone());
        statement.setString(5, cliente.getCpf());
        statement.setString(6, cliente.getEmail());
        
        statement.execute();
        
         return true;
         }   
        } catch (SQLException ex) {
            
            throw new RuntimeException("Erro ao salvar Cliente");
            
        } finally {           
            ConnectionFactory.closeConnection(connection, statement, resultSet);   
        }
    }
       
    public void update(Cliente cliente) {
        
        String sql = "UPDATE cliente SET nomeCliente = ?, endereco = ?, uf = ?, telefone = ?, cpf = ?, email = ? WHERE id = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            
            statement.setString(1, cliente.getNomeCliente());
            statement.setString(2, cliente.getEndereco());
            statement.setString(3, cliente.getUf());
            statement.setString(4, cliente.getTelefone());
            statement.setString(5, cliente.getCpf());
            statement.setString(6, cliente.getEmail());
            statement.setInt(7, cliente.getId());
            
            statement.execute();
            
        } catch (Exception ex) {
            
            throw new RuntimeException("Erro ao atualizar Cliente");
        }     
    }
        
        
     public void removeById (int Id) {
        
         String sql = "DELETE FROM cliente WHERE id = ?";
         
         Connection connection = null;
         PreparedStatement statement = null;
         
         try {
             
             connection = ConnectionFactory.getConnection();
             statement = connection.prepareStatement(sql);
             
             statement.setInt(1, Id);
             statement.execute();
             
             
         } catch (Exception ex) {
             
             throw new RuntimeException("Erro ao deletar Cliente");
             
         } finally {
             
             ConnectionFactory.closeConnection(connection, statement);
             
         }    
  
    } 
     
     
     public Cliente getById(int Id) {
         
        String sql = "SELECT * FROM cliente where id = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        Cliente clienteEx = null;
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, Id);
            resultSet = statement.executeQuery();
            
        while(resultSet.next()) { 
            
            Cliente cliente = new Cliente();
            
            cliente.setId(resultSet.getInt("id"));
            cliente.setNome(resultSet.getString("nomeCliente"));
            cliente.setEndereco(resultSet.getString("endereco"));
            cliente.setUf(resultSet.getString("uf"));
            cliente.setTelefone(resultSet.getString("telefone"));
            cliente.setCpf(resultSet.getString("cpf"));
            cliente.setEmail(resultSet.getString("email"));        
            
           clienteEx = cliente;
        }    
            
        } catch (Exception ex) {
             throw new RuntimeException("Erro ao trazer cliente " + ex.getMessage() + ex );            
        } finally {           
            ConnectionFactory.closeConnection(connection, statement, resultSet);
        } 

        return clienteEx;          
     }
     
     
     public List<Cliente> getAll() {
              
        String sql = "SELECT * FROM cliente";
        
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        List<Cliente> clientes = new ArrayList<Cliente>();
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            
        while(resultSet.next()) {
            
            Cliente cliente = new Cliente();
            
            cliente.setId(resultSet.getInt("id"));
            cliente.setNome(resultSet.getString("nomeCliente"));
            cliente.setEndereco(resultSet.getString("endereco"));
            cliente.setUf(resultSet.getString("uf"));
            cliente.setTelefone(resultSet.getString("telefone"));
            cliente.setCpf(resultSet.getString("cpf"));
            cliente.setEmail(resultSet.getString("email"));

            clientes.add(cliente);            
        }    
            
        } catch (Exception ex) {
             throw new RuntimeException("Erro ao trazer clientes " + ex.getMessage() + ex );            
        } finally {           
            ConnectionFactory.closeConnection(connection, statement, resultSet);
        }      
        return clientes;
    }   
     
      public int getIdByName(String nome) {
              
        String sql = "SELECT id FROM cliente WHERE nomeCliente = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        int id = 0;
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setString(1, nome);
            resultSet = statement.executeQuery();
            
        while(resultSet.next()) {
            
            id = resultSet.getInt("id"); 
            
        }    
            
        } catch (Exception ex) {
             throw new RuntimeException("Erro ao trazer clientes " + ex.getMessage() + ex );            
        } finally {           
            ConnectionFactory.closeConnection(connection, statement, resultSet);
        }   
        
        return id;
    }  
     
     
        public void getAllNames(JComboBox comboBox) {
              
        String sql = "SELECT nomeCliente FROM cliente";
        
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            
        while(resultSet.next()) {
            
            comboBox.addItem(resultSet.getString("nomeCliente"));   
            
        }    
            
        } catch (Exception ex) {
             throw new RuntimeException("Erro ao trazer veiculos para o comboBox " + ex.getMessage() + ex );            
        } finally {           
            ConnectionFactory.closeConnection(connection, statement, resultSet);
        }      
    }   
     
     public List<Cliente> getAllByCpfOrName(String data) {
              
        String sql = "SELECT * FROM cliente where cpf LIKE ? || nomeCliente LIKE ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        List<Cliente> clientes = new ArrayList<Cliente>();
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setString(1, data + "%" );
            statement.setString(2, data + "%");
            resultSet = statement.executeQuery();
            
        while(resultSet.next()) {
            
            Cliente cliente = new Cliente();
            
            cliente.setId(resultSet.getInt("id"));
            cliente.setNome(resultSet.getString("nomeCliente"));
            cliente.setEndereco(resultSet.getString("endereco"));
            cliente.setUf(resultSet.getString("uf"));
            cliente.setTelefone(resultSet.getString("telefone"));
            cliente.setCpf(resultSet.getString("cpf"));
            cliente.setEmail(resultSet.getString("email"));

            clientes.add(cliente);            
        }    
            
        } catch (Exception ex) {
             throw new RuntimeException("Erro ao trazer clientes " + ex.getMessage() + ex );            
        } finally {           
            ConnectionFactory.closeConnection(connection, statement, resultSet);
        }      
        return clientes;
    }   
    
}
