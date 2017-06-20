
package Dao;


import entidades.Perfilpantalla;
import entidades.Tablapk;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Perfil_Pantalla_Dao {
   
     private EntityManagerFactory emf = Persistence.createEntityManagerFactory("MarketPU");
    private EntityManager em = emf.createEntityManager();
    
     public boolean guardar2 (Perfilpantalla pantp){
        boolean op=false;
        try {
            
            em.getTransaction().begin();
            Tablapk objPk =em.find(Tablapk.class,7);
            pantp.setCodigo(objPk.getValor()+1);
            objPk.setValor(objPk.getValor()+1);
            em.persist(pantp);
            em.persist(objPk);
            em.getTransaction().commit();
            op=true;
            
            } catch (Exception e) {
                
                e.printStackTrace();
                em.getTransaction().rollback();
                op=false;
                
            }finally {
            em.close();
            return op;
            
        }        
     }
    
    public List<Perfilpantalla> consultarTodo() {
        
        List<Perfilpantalla> lista;
        Query consulta = em.createNamedQuery("Perfilpantalla.findAll");
        lista = consulta.getResultList();
        return lista;
    }
    
      public Perfilpantalla consultarPorCodigo(int codigo) {
        
        List<Perfilpantalla> lista;
        Query consulta = em.createNamedQuery("Perfilpantalla.findByCodigo");
        consulta.setParameter("codigo",codigo);
        lista = consulta.getResultList();
        return lista.get(0);
    }
    
    
}
