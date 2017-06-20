package Dao;

import entidades.Parametrossistema;
import entidades.Tablapk;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;

public class ParametroSistema_Dao {

   
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("MarketPU");
    private EntityManager em = emf.createEntityManager();

    public Boolean guardar(Parametrossistema parametros) {
        Boolean confirmar = false;
        try {
            em.getTransaction().begin();
            Tablapk objPk =em.find(Tablapk.class,15);
            parametros.setCodigo(objPk.getValor()+1);
            objPk.setValor(objPk.getValor()+1);
            em.persist(parametros);
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

    public Parametrossistema consultarPorCodigo(int codigo) {
        Parametrossistema parametros;
        parametros = em.find(Parametrossistema.class,codigo);
        return parametros;
    }
    
    public Parametrossistema consultarPorNombre(String nombre) {
        List<Parametrossistema> lista;
        Query consulta = em.createNamedQuery("Parametrossistema.findByNombre");
        consulta.setParameter("nombre", nombre);
        lista = consulta.getResultList();
        return lista.get(0);
    }

    public List<Parametrossistema> consultarTodo() {
        List<Parametrossistema> lista;
        Query consulta = em.createNamedQuery("Parametrossistema.findAll");
        lista = consulta.getResultList();
        return lista;
    }

    public boolean modificar(Parametrossistema parametros) {
        boolean op = false;
        try {

            em.getTransaction().begin();
            em.merge(parametros);
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
            Parametrossistema parametros = null;
            try {
                parametros = em.getReference(Parametrossistema.class, codigo);
                em.remove(parametros);
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
        List<Parametrossistema> lista = consultarTodo();
        for (Parametrossistema m : lista) {
            combo.addItem(m.getParametro());
        }
        return combo.getModel();
    } 
}
