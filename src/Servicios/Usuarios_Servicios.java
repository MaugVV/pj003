
package Servicios;


import Dao.Usuarios_Dao;
import entidades.Usuarios;
import java.util.List;

public class Usuarios_Servicios {
    
    Usuarios_Dao uDao = new Usuarios_Dao();
    
      public boolean guardar2 (Usuarios usuarios){
       
        return uDao.guardar2(usuarios);
        
        
    }
       public List<Usuarios> ConsultarTodo(){
    
       return uDao.consultarTodo();
    }
    
}
