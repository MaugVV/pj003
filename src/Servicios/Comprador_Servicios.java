
package Servicios;


import Dao.Comprador_Dao;
import entidades.Comprador;
import java.util.List;

public class Comprador_Servicios {
    
    private Comprador_Dao clienteDao = new Comprador_Dao();
    
     public boolean guardar2 (Comprador cliente){
       
        return clienteDao.guardar2(cliente);
        
        
    }
       public Comprador ConsultarPorpk(int codigo){
    
       return clienteDao.consultarPorpk(codigo);
    }
       public Comprador ConsultarPorCedula(String cedula){
    
       return clienteDao.consultarPorCedula(cedula);
    }
       public Comprador ConsultarPorNombre(String nombre){
    
       return clienteDao.consultarPorNombre(nombre);
    }
        public List<Comprador> ConsultarTodo(){
    
       return clienteDao.consultarTodo();
    }
        public boolean modificar (Comprador cliente){
       
        return clienteDao.modificar(cliente);

    }
        public void Eliminar(int codigo){
          clienteDao.eliminar(codigo);
          }
    
}
