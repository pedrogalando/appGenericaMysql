/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entity.Jugador;
import java.util.List;
import model.IJugadorModel;
import model.JugadorModelImpl;

/**
 *
 * @author informatica
 */
public class JugadorServiceImpl implements IJugadorService{
    private IJugadorModel model = new JugadorModelImpl();

    @Override
    public List<Jugador> obtenerRegistros() {
        return model.obtenerRegistros();
    }

    @Override
    public Jugador obtenerRegistro(Integer id) {
        return model.obtenerRegistro(id);
    }

    @Override
    public void actualizarRegistro(Jugador registro) {
        model.actualizarRegistro(registro);
    }

    @Override
    public void crearRegistro(Jugador registro) {
        model.crearRegistro(registro);
    }

    @Override
    public void eliminarRegistro(Integer id) {
        model.eliminarRegistro(id);
    }    
}
