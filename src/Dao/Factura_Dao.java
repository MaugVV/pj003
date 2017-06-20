
package Dao;


import entidades.Factura;
import entidades.Tablapk;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class Factura_Dao {
    
     private EntityManagerFactory emf = Persistence.createEntityManagerFactory("MarketPU");
    private EntityManager em = emf.createEntityManager();
    
    
    public boolean guardar2 (Factura cabecera){
        boolean op=false;
        try {
            
            em.getTransaction().begin();
            Tablapk objPk =em.find(Tablapk.class,4);
            cabecera.setCodigo(objPk.getValor()+1);
            objPk.setValor(objPk.getValor()+1);
            em.persist(cabecera);
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
    
     public Factura consultarPorpk(int codigo) {
        Factura cabecera;
     return  cabecera= em.find(Factura.class, codigo);
        
    }
     public List<Factura> consultarTodo() {
        
        List<Factura> lista;
        Query consulta = em.createNamedQuery("Factura.findAll");
        lista = consulta.getResultList();
        return lista;
    }
}
