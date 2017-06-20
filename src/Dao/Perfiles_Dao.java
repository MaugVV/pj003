
package Dao;


import entidades.Perfil;
import entidades.Tablapk;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;

public class Perfiles_Dao {
    
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("MarketPU");
    private EntityManager em = emf.createEntityManager();
    
     public boolean guardar2 (Perfil perfiles){
        boolean op=false;
        try {
            
            em.getTransaction().begin();
            Tablapk objPk =em.find(Tablapk.class,6);
            perfiles.setCodigo(objPk.getValor()+1);
            objPk.setValor(objPk.getValor()+1);
            em.persist(perfiles);
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
    
    public List<Perfil> consultarTodo() {
        
        List<Perfil> lista;
        Query consulta = em.createNamedQuery("Perfil.findAll");
        lista = consulta.getResultList();
        return lista;
    }
    public Perfil consultarPorNombre(String nombre) {
        
        List<Perfil> lista;
        Query consulta = em.createNamedQuery("Perfil.findByNombre");
        consulta.setParameter("nombre",nombre);
        lista = consulta.getResultList();
        return lista.get(0);
    }
      public Perfil consultarPorCodigo(int codigo) {
        
        List<Perfil> lista;
        Query consulta = em.createNamedQuery("Perfil.findByCodigo");
        consulta.setParameter("codigo",codigo);
        lista = consulta.getResultList();
        return lista.get(0);
    }
     public ComboBoxModel ObtenerPerfiles() {
        JComboBox combo = new JComboBox();
        List<Perfil> lista = consultarTodo();
        for (Perfil m : lista) {
            combo.addItem(m.getNombre());
        }
        return combo.getModel();
    }   
      
   
    
}
