/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Usuario;
import view.FormCadastroView;

/**
 *
 * @author tiago
 */
public class UsuarioDAO {
    
    private final Connection connection;

    public UsuarioDAO(Connection connection) {
        this.connection = connection;
    }
    
    public void insert(Usuario usuario) throws SQLException{
   
            String sql = "insert into usuario(usuario,senha) values('"+usuario.getUsuario()+"','"+usuario.getSenha()+"'); ";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();        
            connection.close();        
    }

    public boolean existeNoBancoPorUsuarioESenha(Usuario usuarioNovo) throws SQLException {
       String sql = "select * from usuario where usuario = ? and senha = ?";
       PreparedStatement statement = connection.prepareStatement(sql);
       
       statement.setString(1, usuarioNovo.getUsuario());
       statement.setString(2, usuarioNovo.getSenha());
       
       boolean resultado = statement.execute();	
       ResultSet resultSet = statement.getResultSet();
       
       while(resultSet.next()) {
	   return true;
       }
       
       return false;
    }
    
    
}
