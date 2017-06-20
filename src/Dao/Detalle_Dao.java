
package Dao;

import entidades.Detalle;
import entidades.Tablapk;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Detalle_Dao {
    
      private EntityManagerFactory emf = Persistence.createEntityManagerFactory("MarketPU");
    private EntityManager em = emf.createEntityManager();
    
    
    public boolean guardar2 (Detalle detalle){
        boolean op=false;
        try {
            
            em.getTransaction().begin();
            Tablapk objPk =em.find(Tablapk.class,2);
            detalle.setCodigo(objPk.getValor()+1);
            objPk.setValor(objPk.getValor()+1);
            em.persist(detalle);
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
    
     public Detalle consultarPorpk(int codigo) {
        Detalle detalle;
     return  detalle= em.find(Detalle.class, codigo);
        
    }
      public List<Detalle> consultarTodo() {
        
        List<Detalle> lista;
        Query consulta = em.createNamedQuery("Detalle.findAll");
        lista = consulta.getResultList();
        return lista;
    }
}
