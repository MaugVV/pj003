
package Dao;


import entidades.Comprador;
import entidades.Tablapk;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Comprador_Dao {
    
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("MarketPU");
    private EntityManager em = emf.createEntityManager();
    
    
    public boolean guardar2 (Comprador cliente){
        boolean op=false;
        try {
            
            em.getTransaction().begin();
            Tablapk objPk =em.find(Tablapk.class,1);
            cliente.setCodigo(objPk.getValor()+1);
            objPk.setValor(objPk.getValor()+1);
            em.persist(cliente);
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
    
     public Comprador consultarPorpk(int codigo) {
        Comprador cliente;
     return  cliente= em.find(Comprador.class, codigo);
        
    }
       public List<Comprador> consultarTodo() {
        
        List<Comprador> lista;
        Query consulta = em.createNamedQuery("Comprador.findAll");
        lista = consulta.getResultList();
        return lista;
    }
       
        public Comprador consultarPorNombre(String nombre) {
        
        List<Comprador> lista;
        Query consulta = em.createNamedQuery("Comprador.findByNombre");
        consulta.setParameter("nombre",nombre);
        lista = consulta.getResultList();
        return lista.get(0);
    }
        public Comprador consultarPorCedula(String cedula) {
        
        List<Comprador> lista;
        Query consulta = em.createNamedQuery("Comprador.findByCedula");
        consulta.setParameter("cedula",cedula);
        lista = consulta.getResultList();
        return lista.get(0);
    }
         public boolean modificar (Comprador cliente){
        boolean op=false;
        try {
            
            em.getTransaction().begin();
            em.merge(cliente);
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
            Comprador sucursal = null;
            try {
                sucursal = em.getReference(Comprador.class, codigo);
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
