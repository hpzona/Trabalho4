/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 6569900
 */
@Entity
@Table(name = "VENDAS")
@XmlRootElement
@NamedQueries({
   @NamedQuery(name = "Vendas.findAll", query = "SELECT v FROM Vendas v"),
   @NamedQuery(name = "Vendas.findByCodvenda", query = "SELECT v FROM Vendas v WHERE v.codvenda = :codvenda")})
public class Vendas implements Serializable {
   private static final long serialVersionUID = 1L;
   @Id
   @Basic(optional = false)
   @NotNull
   @Column(name = "CODVENDA")
   private Integer codvenda;

   public Vendas() {
   }

   public Vendas(Integer codvenda) {
      this.codvenda = codvenda;
   }

   public Integer getCodvenda() {
      return codvenda;
   }

   public void setCodvenda(Integer codvenda) {
      this.codvenda = codvenda;
   }

   @Override
   public int hashCode() {
      int hash = 0;
      hash += (codvenda != null ? codvenda.hashCode() : 0);
      return hash;
   }

   @Override
   public boolean equals(Object object) {
      // TODO: Warning - this method won't work in the case the id fields are not set
      if (!(object instanceof Vendas)) {
         return false;
      }
      Vendas other = (Vendas) object;
      if ((this.codvenda == null && other.codvenda != null) || (this.codvenda != null && !this.codvenda.equals(other.codvenda))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "ejb.Vendas[ codvenda=" + codvenda + " ]";
   }
   
}
