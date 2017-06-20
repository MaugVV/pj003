
package Dao;

import entidades.Tablapk;
import entidades.Usuarios;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class Usuarios_Dao {
    
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("MarketPU");
    private EntityManager em = emf.createEntityManager();
    
    
       public boolean guardar2 (Usuarios usuarios){
        boolean op=false;
        try {
            
            em.getTransaction().begin();
            Tablapk objPk =em.find(Tablapk.class,11);
            usuarios.setCodigo(objPk.getValor()+1);
            objPk.setValor(objPk.getValor()+1);
            em.persist(usuarios);
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
       
        public List<Usuarios> consultarTodo() {
        
        List<Usuarios> lista;
        Query consulta = em.createNamedQuery("Usuarios.findAll");
        lista = consulta.getResultList();
        return lista;
    }
}
