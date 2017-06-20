package Dao;

import entidades.Estadisticas;
import entidades.Tablapk;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.swing.JOptionPane;

public class Dao_estadistica {
  
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("MarketPU");
    private EntityManager em = emf.createEntityManager();
    
    public Boolean guardar(Estadisticas estadistica){
        Boolean confirmar=false;
        try {
            em.getTransaction().begin();
            Tablapk objPk =em.find(Tablapk.class,14);
            estadistica.setCodigo(objPk.getValor()+1);
            objPk.setValor(objPk.getValor()+1);
            em.persist(estadistica);
            em.persist(objPk);
            em.getTransaction().commit();
            confirmar=true;
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();   
            JOptionPane.showMessageDialog(null,"ERROR "+e.getMessage());
        } finally{
            em.close();
        }
        return confirmar;
    }
        
    public Estadisticas consultarPorCodigo(int codigo){
        Estadisticas categoria;
        categoria = em.find(Estadisticas.class,codigo);
        return categoria;
    }
  
    
    
    public List<Estadisticas> consultarTodo() {
        List<Estadisticas> lista;
        Query consulta = em.createNamedQuery("Estadisticas.findAll");
        lista = consulta.getResultList();
        return lista;
    }

     public List<Object[]> consultarEstadistica() {  
         List<Object[]> lista =null;
         try {
             
        Query consulta = em.createNativeQuery("SELECT p.descripcion DESCRIPCION, sum(e.contidad) TOTAL FROM estadisticas e ,inventario p WHERE p.codigo = e.codigo_producto group by p.descripcion order by 2 desc");//("SELECT 'a', sum(e.cantidad) FROM TblEstadistica e");    
        lista = consulta.getResultList();

         } catch (Exception e) {
             System.out.println(e.getMessage());
         }
      
         return lista;
    }
}
