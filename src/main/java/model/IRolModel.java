package model;

import entity.Rol;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author informatica
 */
public interface IRolModel {
    public void crearRegistro(Rol rol);
    public List<Rol> obtenerRegistros();
    public Rol obtenerRegistro(int id);
    public void eliminarRegistro(int id);
    public void actualizarRegistro(Rol rol);
}
