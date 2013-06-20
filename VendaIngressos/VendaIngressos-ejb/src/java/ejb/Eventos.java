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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 6569900
 */
@Entity
@Table(name = "EVENTOS")
@XmlRootElement
@NamedQueries({
   @NamedQuery(name = "Eventos.findAll", query = "SELECT e FROM Eventos e"),
   @NamedQuery(name = "Eventos.findByNome", query = "SELECT e FROM Eventos e WHERE e.nome = :nome"),
   @NamedQuery(name = "Eventos.findByCodevento", query = "SELECT e FROM Eventos e WHERE e.codevento = :codevento"),
   @NamedQuery(name = "Eventos.findByValor", query = "SELECT e FROM Eventos e WHERE e.valor = :valor")})
public class Eventos implements Serializable {
   private static final long serialVersionUID = 1L;
   @Size(max = 50)
   @Column(name = "NOME")
   private String nome;
   @Id
   @Basic(optional = false)
   @NotNull
   @Column(name = "CODEVENTO")
   private Short codevento;
   @Column(name = "VALOR")
   private Integer valor;

   public Eventos() {
   }

   public Eventos(Short codevento) {
      this.codevento = codevento;
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public Short getCodevento() {
      return codevento;
   }

   public void setCodevento(Short codevento) {
      this.codevento = codevento;
   }

   public Integer getValor() {
      return valor;
   }

   public void setValor(Integer valor) {
      this.valor = valor;
   }

   @Override
   public int hashCode() {
      int hash = 0;
      hash += (codevento != null ? codevento.hashCode() : 0);
      return hash;
   }

   @Override
   public boolean equals(Object object) {
      // TODO: Warning - this method won't work in the case the id fields are not set
      if (!(object instanceof Eventos)) {
         return false;
      }
      Eventos other = (Eventos) object;
      if ((this.codevento == null && other.codevento != null) || (this.codevento != null && !this.codevento.equals(other.codevento))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "ejb.Eventos[ codevento=" + codevento + " ]";
   }
   
}
