/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entity.Rol;
import java.util.List;
import model.IRolModel;
import model.RolModelImpl;

/**
 *
 * @author informatica
 */
public class RolServiceImpl implements IRolService{
    private IRolModel model = new RolModelImpl();

    @Override
    public List<Rol> obtenerRegistros() {
        return model.obtenerRegistros();
    }

    @Override
    public Rol obtenerRegistro(Integer id) {
        return model.obtenerRegistro(id);
    }

    @Override
    public void actualizarRegistro(Rol registro) {
        model.actualizarRegistro(registro);
    }

    @Override
    public void crearRegistro(Rol registro) {
        model.crearRegistro(registro);
    }

    @Override
    public void eliminarRegistro(Integer id) {
        model.eliminarRegistro(id);
    }    
}
