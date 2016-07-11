package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import modelo.ProfAval;

/**
 *
 * @author marcelosiedler
 */
public class ProfAvalDAO {

    EntityManager em;
    
    public ProfAvalDAO() throws Exception {
        EntityManagerFactory emf;
        emf = Conexao.getConexao();
        em = emf.createEntityManager();
    }
    
    public void incluir(ProfAval obj) throws Exception {
        try {
            em.getTransaction().begin();
            em.persist(obj);
            em.getTransaction().commit();
        } catch (RuntimeException e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            //em.close();
            
        }
        
    }

    public List<ProfAval> listar() throws Exception {
        return em.createNamedQuery("ProfAval.findAll").getResultList();
    }
    
    public List<ProfAval> listar(String nome) throws Exception {
         TypedQuery<ProfAval> query = 
                 em.createNamedQuery("ProfAval.findByName", ProfAval.class);
         
         query.setParameter("nome", '%' + nome + '%');
         return query.getResultList();
    }
    
    public double verMedia(Long idProfessor) throws Exception {
      //  TypedQuery<Double> query = em.createQuery("select ((pa_resposta1 + pa_resposta2 + pa_resposta3 + pa_resposta4 + pa_resposta5 + "
        //    + "pa_resposta6 + pa_resposta7 + pa_resposta8 + pa_resposta9 + pa_resposta10) / 10 from ProfAval p where p.id_professor = :idProfessor", Double.class);
//query.setParameter("idProfessor", '%' + idProfessor + '%');
//double avg = query.getSingleResult();
//return avg;
        Query q = em.createQuery("select avg(s.transfusionUnits) from Surgery s");
        Double actual = (Double) q.getSingleResult();
        return actual;
        
    }
    
    public void alterar(ProfAval obj) throws Exception {
        
        try {
            em.getTransaction().begin();
            em.merge(obj);
            em.getTransaction().commit();
        } catch (RuntimeException e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            // em.close();
        }
    }
    
    public void excluir(ProfAval obj) throws Exception {
        
        try {
            em.getTransaction().begin();
            em.remove(obj);
            em.getTransaction().commit();
        } catch (RuntimeException e) {
            em.getTransaction().rollback();
        } finally {
            //em.close();
        }
    }
    
     public ProfAval buscarPorChavePrimaria(Long chave)
    {
        return em.find(ProfAval.class, chave);
    }
    
    public void fechaEmf() {
        em.close();
        Conexao.closeConexao();
    }
    
}
