package ejb;

import java.util.List;
import javax.ejb.Local;

@Local
public interface VendaIngressosFachadaLocal {

   List<ejb.Eventos> getListaEventos();

   List<ejb.Vendas> getListaVendas();
}
