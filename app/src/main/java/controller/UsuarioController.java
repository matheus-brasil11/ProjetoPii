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
import model.Usuario;
import util.ConnectionFactory;

/**
 *
 * @author User
 */
public class UsuarioController {
    

    public boolean verificaLogin(String Login, String Senha)  {
        
        
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        try {  
            
         connection = ConnectionFactory.getConnection();

         String sql = "SELECT login FROM usuario WHERE login = ? And senha = ?";
            
         statement = connection.prepareStatement(sql);
         statement.setString(1, Login);
         statement.setString(2, Senha);
         resultSet = statement.executeQuery();

        return !!resultSet.next();
  
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro de Login");   
        } finally {        
            ConnectionFactory.closeConnection(connection, statement, resultSet);
        }
    }
    
    public boolean save(Usuario usuario) {
        
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        String sql = null;
        
        try {
          
        connection = ConnectionFactory.getConnection();
        
        sql = "Select login from usuario where login = ? or email = ?";    
             
        statement = connection.prepareStatement(sql);        
        statement.setString(1, usuario.getLogin());
        statement.setString(2, usuario.getEmail());
        resultSet = statement.executeQuery();  
        
        
        if (resultSet.next()) {
        
        return false; 
        
        } else {
         
        sql = "INSERT INTO usuario (nome, cargo, login, senha, email) VALUES (?, ?, ?, ?, ?)";    
            
        statement = connection.prepareStatement(sql); 
            
        statement.setString(1, usuario.getNome());
        statement.setString(2, usuario.getCargo());
        statement.setString(3, usuario.getLogin());
        statement.setString(4, usuario.getSenha());
        statement.setString(5, usuario.getEmail());
        
        statement.execute();
        
        return true;
        
        }
        
        } catch (SQLException ex) {
            
            throw new RuntimeException("Erro ao salvar Usuario");
            
        } finally {
            
            ConnectionFactory.closeConnection(connection, statement, resultSet);

        }
    }
       
     public void update(Usuario usuario) {
        
        String sql = "UPDATE usuario SET nome = ?, cargo = ?, login = ?, senha = ?, email = ? WHERE id = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            
            statement.setString(1, usuario.getNome());
            statement.setString(2, usuario.getCargo());
            statement.setString(3, usuario.getLogin());
            statement.setString(4, usuario.getSenha());
            statement.setString(5, usuario.getEmail());
            statement.setInt(6, usuario.getId());
            
            statement.execute();
            
        } catch (Exception ex) {
            
            throw new RuntimeException("Erro ao atualizar Usuario");
        }     
    }
        
     public void removeById (int Id) {
        
         String sql = "DELETE FROM usuario WHERE id = ?";
         
         Connection connection = null;
         PreparedStatement statement = null;
         
         try {
             
             connection = ConnectionFactory.getConnection();
             statement = connection.prepareStatement(sql);
             
             statement.setInt(1, Id);
             statement.execute();
             
             
         } catch (Exception ex) {
             
             throw new RuntimeException("Erro ao deletar Usuario");
             
         } finally {
             
             ConnectionFactory.closeConnection(connection, statement);
             
         }           
    }
     
        public List<Usuario> getAll() {
              
        String sql = "SELECT * FROM usuario where nome != 'admin'";
        
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        java.util.List<Usuario> usuarios = new ArrayList<Usuario>();
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            
        while(resultSet.next()) {
            
            Usuario usuario = new Usuario();

            usuario.setId(resultSet.getInt("id"));
            usuario.setNome(resultSet.getString("nome"));
            usuario.setCargo(resultSet.getString("cargo"));
            usuario.setLogin(resultSet.getString("login"));
            usuario.setSenha(resultSet.getString("senha"));
            usuario.setEmail(resultSet.getString("email"));

            usuarios.add(usuario);            
        }    
            
        } catch (Exception ex) {
             throw new RuntimeException("Erro ao trazer usuarios " + ex.getMessage() + ex );            
        } finally {           
            ConnectionFactory.closeConnection(connection, statement, resultSet);
        }      
        return usuarios;
    }    
     
    public List<Usuario> getAllByNome(String data) {
              
        String sql = "SELECT * FROM usuario where nome LIKE ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        java.util.List<Usuario> usuarios = new ArrayList<Usuario>();
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setString(1, data + "%");
            resultSet = statement.executeQuery();
            
        while(resultSet.next()) {
            
            Usuario usuario = new Usuario();
            
            
            usuario.setId(resultSet.getInt("id"));
            usuario.setNome(resultSet.getString("nome"));
            usuario.setCargo(resultSet.getString("cargo"));
            usuario.setLogin(resultSet.getString("login"));
            usuario.setSenha(resultSet.getString("senha"));
            usuario.setEmail(resultSet.getString("email"));

            usuarios.add(usuario);            
        }    
            
        } catch (Exception ex) {
             throw new RuntimeException("Erro ao trazer veiculos " + ex.getMessage() + ex );            
        } finally {           
            ConnectionFactory.closeConnection(connection, statement, resultSet);
        }      
        return usuarios;
    }  
    
}
