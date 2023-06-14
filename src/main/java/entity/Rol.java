
package entity;

import entity.base.IRegistroEntityBase;


public class Rol implements IRegistroEntityBase {
    private int idRol;
    private String rol;

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }   

    @Override
    public Integer getId() {
        return getIdRol();
    }

    @Override
    public void setId(Integer id) {
        setIdRol(id);
    }
}
