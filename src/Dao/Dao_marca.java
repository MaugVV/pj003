package Dao;

import entidades.Marca;
import entidades.Tablapk;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Dao_marca {
  
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("MarketPU");
    private EntityManager em = emf.createEntityManager();
    
    public Boolean guardar(Marca marca){
        Boolean confirmar=false;
        try {
            em.getTransaction().begin();
            Tablapk objPk =em.find(Tablapk.class,12);
            marca.setCodigo(objPk.getValor()+1);
            objPk.setValor(objPk.getValor()+1);
            em.persist(marca);
            em.persist(objPk);
            em.getTransaction().commit();
            confirmar=true;
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();   
            
        } finally{
            em.close();
        }
        return confirmar;
    }
        
    public Marca consultarPorCodigo(int codigo){
        Marca categoria;
        categoria = em.find(Marca.class,codigo);
        return categoria;
    }
  
    public Marca consultarPorNombre(String nombre) {
        List<Marca> lista;
        Query consulta = em.createNamedQuery("Marca.findByNombre");
        consulta.setParameter("nombre",nombre);
        lista = consulta.getResultList();
        return lista.get(0);
    }
    
    public List<Marca> consultarTodo() {
        List<Marca> lista;
        Query consulta = em.createNamedQuery("Marca.findAll");
        lista = consulta.getResultList();
        return lista;
    }
    
    public boolean modificar(Marca marca) {
        boolean op = false;
        try {

            em.getTransaction().begin();
            em.merge(marca);
            em.getTransaction().commit();
            op = true;

        } catch (Exception e) {

            e.printStackTrace();
            em.getTransaction().rollback();
            op = false;

        } finally {
            em.close();
            return op;

        }
    }

    public void eliminar(int codigo) {

        try {

            em.getTransaction().begin();
            Marca marca = null;
            try {
                marca = em.getReference(Marca.class, codigo);
                em.remove(marca);
                em.getTransaction().commit();
            } catch (EntityNotFoundException enfe) {
                enfe.printStackTrace();
                em.getTransaction().rollback();
            }

        } finally {

            em.close();

        }
    }
    public ComboBoxModel LlenarCombo() {
        JComboBox combo = new JComboBox();
        List<Marca> lista = consultarTodo();
        for (Marca m : lista) {
            combo.addItem(m.getNombre());
        }
        return combo.getModel();
    } 
}
