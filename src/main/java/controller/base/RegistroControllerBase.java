/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.base;

import entity.base.IRegistroEntityBase;
import java.util.ArrayList;
import service.base.IRegistroServiceBase;

/**
 *
 * @author informatica
 * @param <T>
 */
public class RegistroControllerBase<T extends IRegistroEntityBase> {

    private T registro;
    private ArrayList<T> listaRegistros;

    private IRegistroServiceBase<T> service;

    protected void resetItemList() {
        listaRegistros = new ArrayList<>();
        listaRegistros.addAll(service.obtenerRegistros());
    }

    public void crearActualizarRegistro() {
        if (registro.getId() == null) {
            service.crearRegistro(registro);
        } else {
            service.actualizarRegistro(registro);
        }

        resetItemList();
    }

    public void eliminarRegistro(int id) {
        service.eliminarRegistro(id);
    }

    public void setService(IRegistroServiceBase<T> service) {
        this.service = service;
    }

    public T getRegistro() {
        return registro;
    }

    public void setRegistro(T registro) {
        this.registro = registro;
    }

    public ArrayList<T> getListaRegistros() {
        return listaRegistros;
    }

    public void setListaRegistros(ArrayList<T> listaRegistros) {
        this.listaRegistros = listaRegistros;
    }
}
