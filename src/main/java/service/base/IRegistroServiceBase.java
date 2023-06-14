/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service.base;

import java.util.List;

/**
 *
 * @author informatica
 */
public interface IRegistroServiceBase<T> {

    public List<T> obtenerRegistros();

    T obtenerRegistro(Integer id);

    public void actualizarRegistro(T registro);

    public void crearRegistro(T registro);

    void eliminarRegistro(Integer id);


}
