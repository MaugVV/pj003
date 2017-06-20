
package Servicios;



import Dao.Vendedor_Dao;
import entidades.Vendedor;
import java.util.List;

public class Vendedor_Servicios {
    
    private Vendedor_Dao clienteDao = new Vendedor_Dao();
    
     public boolean guardar2 (Vendedor empleado){
       
        return clienteDao.guardar2(empleado);
        
        
    }
       public Vendedor ConsultarPorpk(int codigo){
    
       return clienteDao.consultarPorpk(codigo);
    }
       public Vendedor ConsultarPorNombre(String nombre){
    
       return clienteDao.consultarPorNombre(nombre);
    }
       public Vendedor ConsultarPorCedula(String cedula){
    
       return clienteDao.consultarPorCedula(cedula);
    }
        public List<Vendedor> ConsultarTodo(){
    
       return clienteDao.consultarTodo();
    }
        public boolean modificar (Vendedor empleado){
       
        return clienteDao.modificar(empleado);

    }
        public void Eliminar(int codigo){
          clienteDao.eliminar(codigo);
          }
    
}
