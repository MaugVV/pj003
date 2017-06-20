
package Dao;

import entidades.Tablapk;
import entidades.Vendedor;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;

public class Vendedor_Dao {
   
     private EntityManagerFactory emf = Persistence.createEntityManagerFactory("MarketPU");
    private EntityManager em = emf.createEntityManager();
    
    
    public boolean guardar2 (Vendedor empleado){
        boolean op=false;
        try {
            
            em.getTransaction().begin();
            Tablapk objPk =em.find(Tablapk.class,3);
            empleado.setCodigo(objPk.getValor()+1);
            objPk.setValor(objPk.getValor()+1);
            em.persist(empleado);
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
    
     public Vendedor consultarPorpk(int codigo) {
        Vendedor empleado;
     return  empleado= em.find(Vendedor.class, codigo);
        
    }
       public List<Vendedor> consultarTodo() {
        
        List<Vendedor> lista;
        Query consulta = em.createNamedQuery("Vendedor.findAll");
        lista = consulta.getResultList();
        return lista;
    }
       
        public Vendedor consultarPorNombre(String nombre) {
        
        List<Vendedor> lista;
        Query consulta = em.createNamedQuery("Vendedor.findByNombre");
        consulta.setParameter("nombre",nombre);
        lista = consulta.getResultList();
        return lista.get(0);
    }
        
         public Vendedor consultarPorCedula(String cedula) {
        
        List<Vendedor> lista;
        Query consulta = em.createNamedQuery("Vendedor.findByCedula");
        consulta.setParameter("cedula",cedula);
        lista = consulta.getResultList();
        return lista.get(0);
    }
         public boolean modificar (Vendedor empleado){
        boolean op=false;
        try {
            
            em.getTransaction().begin();
            em.merge(empleado);
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
            Vendedor empleado = null;
            try {
                empleado = em.getReference(Vendedor.class, codigo);
                empleado.getCodigo();
            } catch (EntityNotFoundException enfe) {
               enfe.printStackTrace();
                em.getTransaction().rollback();
            }
            em.remove(empleado);
            em.getTransaction().commit();
        } finally {
          
                em.close();
            
        }
    }
         
    public ComboBoxModel ObtenerEmpleados() {
        JComboBox combo = new JComboBox();
        List<Vendedor> lista = consultarTodo();
        for (Vendedor m : lista) {
            combo.addItem(m.getCedula()+" "+m.getApellido());
        }
        return combo.getModel();
    } 
    
}
