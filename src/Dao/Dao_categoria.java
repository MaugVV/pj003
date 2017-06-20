package Dao;

import entidades.Categoria;
import entidades.Tablapk;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;

public class Dao_categoria {

   
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("MarketPU");
    private EntityManager em = emf.createEntityManager();

    public Boolean guardar(Categoria categoria) {
        Boolean confirmar = false;
        try {
            em.getTransaction().begin();
            Tablapk objPk =em.find(Tablapk.class,13);
            categoria.setCodigo(objPk.getValor()+1);
            objPk.setValor(objPk.getValor()+1);
            em.persist(categoria);
            em.persist(objPk);
            em.getTransaction().commit();
            confirmar=true;
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
            
        } finally {
            em.close();
        }
        return confirmar;
    }

    public Categoria consultarPorCodigo(int codigo) {
        Categoria categoria;
        categoria = em.find(Categoria.class,codigo);
        return categoria;
    }

    public Categoria consultarPorNombre(String nombre) {
        List<Categoria> lista;
        Query consulta = em.createNamedQuery("Categoria.findByNombre");
        consulta.setParameter("nombre", nombre);
        lista = consulta.getResultList();
        return lista.get(0);
    }

    public List<Categoria> consultarTodo() {
        List<Categoria> lista;
        Query consulta = em.createNamedQuery("Categoria.findAll");
        lista = consulta.getResultList();
        return lista;
    }

    public boolean modificar(Categoria categoria) {
        boolean op = false;
        try {

            em.getTransaction().begin();
            em.merge(categoria);
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
            Categoria categoria = null;
            try {
                categoria = em.getReference(Categoria.class, codigo);
                em.remove(categoria);
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
        List<Categoria> lista = consultarTodo();
        for (Categoria m : lista) {
            combo.addItem(m.getNombre());
        }
        return combo.getModel();
    } 
}
