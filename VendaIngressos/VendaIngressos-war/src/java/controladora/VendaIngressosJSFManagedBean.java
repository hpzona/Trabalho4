package controladora;

import ejb.Eventos;
import ejb.VendaIngressosFachadaLocal;
import ejb.Vendas;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped


public class VendaIngressosJSFManagedBean {
   @EJB
   private VendaIngressosFachadaLocal vendaIngressosFachada;

   public VendaIngressosJSFManagedBean() {
   }

   public List<Vendas> getListaVendas() {
     return vendaIngressosFachada.getListaVendas();
   }

   public List<Eventos> getListaEventos() {
      return vendaIngressosFachada.getListaEventos();
   }
}
