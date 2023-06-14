package model;

import entity.Usuario;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author informatica
 */
public interface IUsuarioModel {
        public void crearRegistro(Usuario usuario);
    public List<Usuario> obtenerRegistros();
    public Usuario obtenerRegistro(int id);
    public void eliminarRegistro(int id);
    public void actualizarRegistro(Usuario usuario);
}
