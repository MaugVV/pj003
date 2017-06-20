
package Servicios;


import Dao.Factura_Dao;
import entidades.Factura;
import java.util.List;

public class Factura_Servicios {
    
    private Factura_Dao cabeceraDao = new Factura_Dao();
    
     public boolean guardar2 (Factura cabecera){
       
        return cabeceraDao.guardar2(cabecera);
        
        
    }
       public Factura ConsultarPorpk(int codigo){
    
       return cabeceraDao.consultarPorpk(codigo);
    }
        public List<Factura> ConsultarTodo(){
    
       return cabeceraDao.consultarTodo();
    }
}
