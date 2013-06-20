package ejb;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class VendaIngressosFachada implements VendaIngressosFachadaLocal {
   @PersistenceContext(unitName = "VendaIngressos-ejbPU")
   private EntityManager em;

   public void persist(Object object) {
      em.persist(object);
   }
   
   @Override
   public List<ejb.Eventos> getListaEventos() {

        Query query = em.createNamedQuery("Eventos.findAll");

        return query.getResultList();

    }
   
   @Override
   public List<ejb.Vendas> getListaVendas() {

        Query query = em.createNamedQuery("Vendas.findAll");

        return query.getResultList();

    }

   // Add business logic below. (Right-click in editor and choose
   // "Insert Code > Add Business Method")

}
