
package Servicios;

import Dao.Proveedor_Dao;
import entidades.Proveedor;
import java.util.List;

public class Proveedor_Servicios {
  
    private Proveedor_Dao clienteDao = new Proveedor_Dao();
    
     public boolean guardar2 (Proveedor proveedor){
       
        return clienteDao.guardar2(proveedor);
        
        
    }
       public Proveedor ConsultarPorpk(int codigo){
    
       return clienteDao.consultarPorpk(codigo);
    }
       public Proveedor ConsultarPorNombre(String nombre){
    
       return clienteDao.consultarPorNombre(nombre);
    }
        public List<Proveedor> ConsultarTodo(){
    
       return clienteDao.consultarTodo();
    }
        public boolean modificar (Proveedor proveedor){
       
        return clienteDao.modificar(proveedor);

    }
        public void Eliminar(int codigo){
          clienteDao.eliminar(codigo);
          }
    
}
