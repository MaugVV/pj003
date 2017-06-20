
package Servicios;

import Dao.Sucursal_Dao;
import entidades.Sucursal;
import java.util.List;

public class Sucursal_Servicios {
    
     private Sucursal_Dao sucursalDao = new Sucursal_Dao();
    
     public boolean guardar2 (Sucursal sucursal){
       
        return sucursalDao.guardar2(sucursal);
        
        
    }
       public Sucursal ConsultarPorpk(int codigo){
    
       return sucursalDao.consultarPorpk(codigo);
    }
       
        public List<Sucursal> ConsultarTodo(){
    
       return sucursalDao.consultarTodo();
    }
         public Sucursal ConsultarPorNombre(String nombre){
    
       return sucursalDao.consultarPorNombre(nombre);
    }
          public boolean modificar (Sucursal sucursal){
       
        return sucursalDao.modificar(sucursal);

    }
          public void Eliminar(int codigo){
          sucursalDao.eliminar(codigo);
          }
}
