
package Servicios;

import Dao.Inventario_Dao;
import entidades.Inventario;

import java.util.List;

public class Inventario_Servicios {
   
    private Inventario_Dao clienteDao = new Inventario_Dao();
    
     public boolean guardar2 (Inventario producto){
       
        return clienteDao.guardar2(producto);
        
        
    }
       public Inventario ConsultarPorpk(int codigo){
    
       return clienteDao.consultarPorpk(codigo);
    }
       public Inventario ConsultarPorNombre(String nombre){
    
       return clienteDao.consultarPorNombre(nombre);
    }
        public List<Inventario> ConsultarTodo(){
    
       return clienteDao.consultarTodo();
    }
        public boolean modificar (Inventario producto){
       
        return clienteDao.modificar(producto);

    }
        public void Eliminar(int codigo){
          clienteDao.eliminar(codigo);
          }
    
}
