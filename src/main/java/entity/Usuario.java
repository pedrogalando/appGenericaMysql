
package entity;

import entity.base.IRegistroEntityBase;

public class Usuario implements IRegistroEntityBase{
    private int idUsuario;
    private String usr;
    private String pwd;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsr() {
        return usr;
    }

    public void setUsr(String usr) {
        this.usr = usr;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public Integer getId() {
        return getIdUsuario();
    }

    @Override
    public void setId(Integer id) {
        setIdUsuario(id);
    }
}
