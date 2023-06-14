/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import entity.Usuario;
import java.util.List;
import model.IUsuarioModel;
import model.UsuarioModelImpl;

/**
 *
 * @author informatica
 */
public class UsuarioServiceImpl implements IUsuarioService{
    private IUsuarioModel model = new UsuarioModelImpl();

    @Override
    public List<Usuario> obtenerRegistros() {
        return model.obtenerRegistros();
    }

    @Override
    public Usuario obtenerRegistro(Integer id) {
        return model.obtenerRegistro(id);
    }

    @Override
    public void actualizarRegistro(Usuario registro) {
        model.actualizarRegistro(registro);
    }

    @Override
    public void crearRegistro(Usuario registro) {
        model.crearRegistro(registro);
    }

    @Override
    public void eliminarRegistro(Integer id) {
        model.eliminarRegistro(id);
    }    
}
