package model;

import conexion.Conexion;
import entity.Rol;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class RolModelImpl implements IRolModel{
    private Connection connection;
    private Statement stm;

    @Override
    public void crearRegistro(Rol rol) {
        try {
            connection = new Conexion().getConnection();
            stm = connection.createStatement();
            String query = "INSERT INTO rol(rol) values('" + rol.getRol() +"'";
            stm.executeQuery(query);
            stm.close();
            connection.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    @Override
    public List<Rol> obtenerRegistros() {
        List<Rol> listaRol = null;
         try {
            connection = new Conexion().getConnection();
            stm = connection.createStatement();
            String query = "SELECT * FROM rol";
            ResultSet rs = stm.executeQuery(query);
            
            while(rs.next()){
                Rol rol = new Rol();
                rol.setRol(rs.getString(1));
                listaRol.add(rol);
            }
            
            stm.close();
            connection.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
         return listaRol;
    }

    @Override
    public Rol obtenerRegistro(int id) {
        Rol rol = null;
         try {
            connection = new Conexion().getConnection();
            stm = connection.createStatement();
            String query = "SELECT * FROM rol WHERE idRol=" + id;
            ResultSet rs = stm.executeQuery(query);
            
            rs.next();
            rol = new Rol();
            rol.setRol(rs.getString(1));
                        
            stm.close();
            connection.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
         return rol;
    }

    @Override
    public void eliminarRegistro(int id) {
         try {
            connection = new Conexion().getConnection();
            stm = connection.createStatement();
            String query = "DELETE FROM rol WHERE idRol=" + id;
            stm.executeQuery(query);
            stm.close();
            connection.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    @Override
    public void actualizarRegistro(Rol rol) {
         try {
            connection = new Conexion().getConnection();
            stm = connection.createStatement();
            String query = "UPDATE rol SET rol'" + rol.getRol() +"' WHERE idRol = " + rol.getId();
            stm.executeQuery(query);
            stm.close();
            connection.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    
}
