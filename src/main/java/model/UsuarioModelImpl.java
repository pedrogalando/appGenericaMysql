package model;

import conexion.Conexion;
import entity.Usuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class UsuarioModelImpl implements IUsuarioModel{
private Connection connection;
    private Statement stm;

    @Override
    public void crearRegistro(Usuario usuario) {
        try {
            connection = new Conexion().getConnection();
            stm = connection.createStatement();
            String query = "INSERT INTO usuario(usuario) values('" + usuario.getUsr()+"'";
            stm.executeQuery(query);
            stm.close();
            connection.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    @Override
    public List<Usuario> obtenerRegistros() {
        List<Usuario> listaUsuario = null;
         try {
            connection = new Conexion().getConnection();
            stm = connection.createStatement();
            String query = "SELECT * FROM usuario";
            ResultSet rs = stm.executeQuery(query);
            
            while(rs.next()){
                Usuario usuario = new Usuario();
                usuario.setUsr(rs.getString(1));
                listaUsuario.add(usuario);
            }
            
            stm.close();
            connection.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
         return listaUsuario;
    }

    @Override
    public Usuario obtenerRegistro(int id) {
        Usuario usuario = null;
         try {
            connection = new Conexion().getConnection();
            stm = connection.createStatement();
            String query = "SELECT * FROM usuario WHERE idUsuario=" + id;
            ResultSet rs = stm.executeQuery(query);
            
            rs.next();
            usuario = new Usuario();
            usuario.setUsr(rs.getString(1));
                        
            stm.close();
            connection.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
         return usuario;
    }

    @Override
    public void eliminarRegistro(int id) {
         try {
            connection = new Conexion().getConnection();
            stm = connection.createStatement();
            String query = "DELETE FROM usuario WHERE idUsuario=" + id;
            stm.executeQuery(query);
            stm.close();
            connection.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    @Override
    public void actualizarRegistro(Usuario usuario) {
         try {
            connection = new Conexion().getConnection();
            stm = connection.createStatement();
            String query = "UPDATE usuario SET usuario'" + usuario.getUsr() +"' WHERE idUsuario = " + usuario.getId();
            stm.executeQuery(query);
            stm.close();
            connection.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
