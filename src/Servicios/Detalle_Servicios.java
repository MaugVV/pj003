
package Servicios;


import Dao.Detalle_Dao;
import entidades.Detalle;
import java.util.List;

public class Detalle_Servicios {
    
     private Detalle_Dao detalleDao = new Detalle_Dao();
    
     public boolean guardar2 (Detalle detalle){
       
        return detalleDao.guardar2(detalle);
        
        
    }
       public Detalle ConsultarPorpk(int codigo){
    
       return detalleDao.consultarPorpk(codigo);
    }
        public List<Detalle> ConsultarTodo(){
    
       return detalleDao.consultarTodo();
    }
}
