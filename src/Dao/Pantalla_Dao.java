
package Dao;


import entidades.Pantallas;
import entidades.Tablapk;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;

public class Pantalla_Dao {
    
     private EntityManagerFactory emf = Persistence.createEntityManagerFactory("MarketPU");
    private EntityManager em = emf.createEntityManager();
    
    
       public boolean guardar2 (Pantallas menu){
        boolean op=false;
        try {
            
            em.getTransaction().begin();
            Tablapk objPk =em.find(Tablapk.class,5);
            menu.setCodigo(objPk.getValor()+1);
            objPk.setValor(objPk.getValor()+1);
            em.persist(menu);
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
       
        public List<Pantallas> consultarTodo() {
        
        List<Pantallas> lista;
        Query consulta = em.createNamedQuery("Pantallas.findAll");
        lista = consulta.getResultList();
        return lista;
    }
    
       public Pantallas consultarPorNombre(String nombre) {
        
        List<Pantallas> lista;
        Query consulta = em.createNamedQuery("Pantallas.findByPantalla");
        consulta.setParameter("pantalla",nombre);
        lista = consulta.getResultList();
        return lista.get(0);
    }
      public Pantallas consultarPorCodigo(int codigo) {
        
        List<Pantallas> lista;
        Query consulta = em.createNamedQuery("Pantallas.findByCodigo");
        consulta.setParameter("codigo",codigo);
        lista = consulta.getResultList();
        return lista.get(0);
    }
      
    public ComboBoxModel ObtenerPantallas() {
        JComboBox combo = new JComboBox();
        List<Pantallas> lista = consultarTodo();
        for (Pantallas m : lista) {
            combo.addItem(m.getPantalla());
        }
        return combo.getModel();
    }
}
