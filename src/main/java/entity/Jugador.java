
package entity;

import entity.base.IRegistroEntityBase;

public class Jugador extends Persona implements IRegistroEntityBase{
    private int idJugador;
    private int  puntos;

    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public Integer getId() {
        return getIdJugador();
    }

    @Override
    public void setId(Integer id) {
        setIdJugador(id);
    }

   
    
}
