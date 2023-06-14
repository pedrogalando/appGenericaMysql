package model;

import conexion.Conexion;
import entity.Jugador;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author informatica
 */
public class JugadorModelImpl implements IJugadorModel{
private Connection connection;
    private Statement stm;

    @Override
    public void crearRegistro(Jugador jugador) {
        try {
            connection = new Conexion().getConnection();
            stm = connection.createStatement();
            String query = "INSERT INTO jugador(jugador) values('" + jugador.getNombre()+"'";
            stm.executeQuery(query);
            stm.close();
            connection.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    @Override
    public List<Jugador> obtenerRegistros() {
        List<Jugador> listaJugador = null;
         try {
            connection = new Conexion().getConnection();
            stm = connection.createStatement();
            String query = "SELECT * FROM jugador";
            ResultSet rs = stm.executeQuery(query);
            
            while(rs.next()){
                Jugador jugador = new Jugador();
                jugador.setNombre(rs.getString(1));
                listaJugador.add(jugador);
            }
            
            stm.close();
            connection.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
         return listaJugador;
    }

    @Override
    public Jugador obtenerRegistro(int id) {
        Jugador jugador = null;
         try {
            connection = new Conexion().getConnection();
            stm = connection.createStatement();
            String query = "SELECT * FROM jugador WHERE idJugador=" + id;
            ResultSet rs = stm.executeQuery(query);
            
            rs.next();
            jugador = new Jugador();
            jugador.setNombre(rs.getString(1));
                        
            stm.close();
            connection.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
         return jugador;
    }

    @Override
    public void eliminarRegistro(int id) {
         try {
            connection = new Conexion().getConnection();
            stm = connection.createStatement();
            String query = "DELETE FROM jugador WHERE idJugador=" + id;
            stm.executeQuery(query);
            stm.close();
            connection.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    @Override
    public void actualizarRegistro(Jugador jugador) {
         try {
            connection = new Conexion().getConnection();
            stm = connection.createStatement();
            String query = "UPDATE jugador SET jugador'" + jugador.getNombre() +"' WHERE idJugador = " + jugador.getId();
            stm.executeQuery(query);
            stm.close();
            connection.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    
}
