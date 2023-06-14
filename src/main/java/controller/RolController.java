
package controller;

import controller.base.RegistroControllerBase;
import entity.Rol;
import service.IRolService;
import service.RolServiceImpl;

public class RolController extends RegistroControllerBase<Rol>{
    private IRolService service;
    
    public void crearActualizarRol(Rol rol){
        service = new RolServiceImpl();
        super.setService(service);
        super.setRegistro(rol);
        super.crearActualizarRegistro();
    }        
}
