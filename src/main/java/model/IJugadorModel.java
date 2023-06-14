package model;

import entity.Jugador;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author informatica
 */
public interface IJugadorModel {
    public void crearRegistro(Jugador jugador);
    public List<Jugador> obtenerRegistros();
    public Jugador obtenerRegistro(int id);
    public void eliminarRegistro(int id);
    public void actualizarRegistro(Jugador jugador);
}
