
package Servicios;

import Dao.Perfiles_Dao;
import entidades.Perfil;
import java.util.List;

public class Perfiles_Servicios {
    
    Perfiles_Dao perDao = new Perfiles_Dao();
    
     public boolean guardar2 (Perfil perfiles){
       
        return perDao.guardar2(perfiles);
        
        
    }
       public List<Perfil> ConsultarTodo(){
    
       return perDao.consultarTodo();
    }
       public Perfil ConsultarPorNombre(String nombre){
    
       return perDao.consultarPorNombre(nombre);
    }
        public Perfil ConsultarPorCodigo(int codigo){
    
       return perDao.consultarPorCodigo(codigo);
    }
        
    
}
