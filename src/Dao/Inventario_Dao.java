
package Dao;


import entidades.Inventario;
import entidades.Tablapk;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Inventario_Dao {
    
     private EntityManagerFactory emf = Persistence.createEntityManagerFactory("MarketPU");
    private EntityManager em = emf.createEntityManager();
    
    
    public boolean guardar2 (Inventario producto){
        boolean op=false;
        try {
            
            em.getTransaction().begin();
            Tablapk objPk =em.find(Tablapk.class,8);
            producto.setCodigo(objPk.getValor()+1);
            objPk.setValor(objPk.getValor()+1);
            em.persist(producto);
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
    
     public Inventario consultarPorpk(int codigo) {
        Inventario producto;
     return  producto= em.find(Inventario.class, codigo);
        
    }
       public List<Inventario> consultarTodo() {
        
        List<Inventario> lista;
        Query consulta = em.createNamedQuery("Inventario.findAll");
        lista = consulta.getResultList();
        return lista;
    }
       
        public Inventario consultarPorNombre(String nombre) {
        
        List<Inventario> lista;
        Query consulta = em.createNamedQuery("Inventario.findByNombre");
        consulta.setParameter("nombre",nombre);
        lista = consulta.getResultList();
        return lista.get(0);
    }
         public boolean modificar (Inventario producto){
        boolean op=false;
        try {
            
            em.getTransaction().begin();
            em.merge(producto);
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
            Inventario producto = null;
            try {
                producto = em.getReference(Inventario.class, codigo);
                producto.getCodigo();
            } catch (EntityNotFoundException enfe) {
               enfe.printStackTrace();
                em.getTransaction().rollback();
            }
            em.remove(producto);
            em.getTransaction().commit();
        } finally {
          
                em.close();
            
        }
    }
    
}
