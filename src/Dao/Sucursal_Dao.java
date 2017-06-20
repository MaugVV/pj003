
package Dao;

import entidades.Sucursal;
import entidades.Tablapk;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Sucursal_Dao {
   
    
      private EntityManagerFactory emf = Persistence.createEntityManagerFactory("MarketPU");
    private EntityManager em = emf.createEntityManager();
    
    
    public boolean guardar2 (Sucursal sucursal){
        boolean op=false;
        try {
            
            em.getTransaction().begin();
            Tablapk objPk =em.find(Tablapk.class,10);
            sucursal.setCodigo(objPk.getValor()+1);
            objPk.setValor(objPk.getValor()+1);
            em.persist(sucursal);
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
    
     public Sucursal consultarPorpk(int codigo) {
        Sucursal sucursal;
     return  sucursal= em.find(Sucursal.class, codigo);
        
    }
       public List<Sucursal> consultarTodo() {
        
        List<Sucursal> lista;
        Query consulta = em.createNamedQuery("Sucursal.findAll");
        lista = consulta.getResultList();
        return lista;
    }
       
        public Sucursal consultarPorNombre(String nombre) {
        
        List<Sucursal> lista;
        Query consulta = em.createNamedQuery("Sucursal.findByNombre");
        consulta.setParameter("nombre",nombre);
        lista = consulta.getResultList();
        return lista.get(0);
    }
         public boolean modificar (Sucursal sucursal){
        boolean op=false;
        try {
            
            em.getTransaction().begin();
            em.merge(sucursal);
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
         
         public void eliminar (int codigo){
     
        try {
        
            em.getTransaction().begin();
            Sucursal sucursal = null;
            try {
                sucursal = em.getReference(Sucursal.class, codigo);
                sucursal.getCodigo();
            } catch (EntityNotFoundException enfe) {
               enfe.printStackTrace();
                em.getTransaction().rollback();
            }
            em.remove(sucursal);
            em.getTransaction().commit();
        } finally {
          
                em.close();
            
        }
    }
}
