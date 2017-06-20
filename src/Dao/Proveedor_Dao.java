
package Dao;

import entidades.Proveedor;
import entidades.Tablapk;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Proveedor_Dao {
    
     private EntityManagerFactory emf = Persistence.createEntityManagerFactory("MarketPU");
    private EntityManager em = emf.createEntityManager();
    
    
    public boolean guardar2 (Proveedor proveedor){
        boolean op=false;
        try {
            
            em.getTransaction().begin();
            Tablapk objPk =em.find(Tablapk.class,9);
            proveedor.setCodigo(objPk.getValor()+1);
            objPk.setValor(objPk.getValor()+1);
            em.persist(proveedor);
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
    
     public Proveedor consultarPorpk(int codigo) {
        Proveedor proveedor;
     return  proveedor= em.find(Proveedor.class, codigo);
        
    }
       public List<Proveedor> consultarTodo() {
        
        List<Proveedor> lista;
        Query consulta = em.createNamedQuery("Proveedor.findAll");
        lista = consulta.getResultList();
        return lista;
    }
       
        public Proveedor consultarPorNombre(String nombre) {
        
        List<Proveedor> lista;
        Query consulta = em.createNamedQuery("Proveedor.findByNombre");
        consulta.setParameter("nombre",nombre);
        lista = consulta.getResultList();
        return lista.get(0);
    }
         public boolean modificar (Proveedor proveedor){
        boolean op=false;
        try {
            
            em.getTransaction().begin();
            em.merge(proveedor);
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
            Proveedor proveedor = null;
            try {
                proveedor = em.getReference(Proveedor.class, codigo);
                proveedor.getCodigo();
            } catch (EntityNotFoundException enfe) {
               enfe.printStackTrace();
                em.getTransaction().rollback();
            }
            em.remove(proveedor);
            em.getTransaction().commit();
        } finally {
          
                em.close();
            
        }
    }
    
}
