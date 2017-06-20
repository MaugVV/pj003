
package Servicios;

import Dao.Perfil_Pantalla_Dao;
import entidades.Perfilpantalla;
import java.util.List;

public class Perfil_Pantalla_Servicios {
    
    Perfil_Pantalla_Dao pp = new Perfil_Pantalla_Dao();
    
     public void guardar2(Perfilpantalla pantp){
    
        pp.guardar2(pantp);
    }
     public Perfilpantalla ConsultarPorCodigo(int codigo){
    
       return pp.consultarPorCodigo(codigo);
    }
     
      public List<Perfilpantalla> ConsultarTodo(){
    
       return pp.consultarTodo();
    }
}

