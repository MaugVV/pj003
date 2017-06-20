
package Servicios;


import Dao.Pantalla_Dao;
import entidades.Pantallas;
import java.util.List;

public class Pantallas_Servicios {
   
    Pantalla_Dao pDao = new Pantalla_Dao();
    
     public List<Pantallas> ConsultarTodo(){
    
       return pDao.consultarTodo();
    }
       public Pantallas ConsultarPorNombre(String nombre){
    
       return pDao.consultarPorNombre(nombre);
    }
       public Pantallas ConsultarPorCodigo(int codigo){
    
       return pDao.consultarPorCodigo(codigo);
    }
        public boolean guardar2 (Pantallas pantallas){
       
        return pDao.guardar2(pantallas);
        
        
    }
    
}
