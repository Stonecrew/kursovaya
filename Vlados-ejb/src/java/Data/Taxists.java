/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Data;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author USER
 */
@Entity
@Table(name = "taxists")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Taxists.findAll", query = "SELECT t FROM Taxists t")})
public class Taxists implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "taxist_id", nullable = false)
    private Integer taxistId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status_taxi", nullable = false)
    private int statusTaxi;
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false)
    @ManyToOne(optional = false)
    private Users userId;

    public Taxists() {
    }

    public Taxists(Integer taxistId) {
        this.taxistId = taxistId;
    }

    public Taxists(Integer taxistId, int statusTaxi) {
        this.taxistId = taxistId;
        this.statusTaxi = statusTaxi;
    }

    public Integer getTaxistId() {
        return taxistId;
    }

    public void setTaxistId(Integer taxistId) {
        this.taxistId = taxistId;
    }

    public int getStatusTaxi() {
        return statusTaxi;
    }

    public void setStatusTaxi(int statusTaxi) {
        this.statusTaxi = statusTaxi;
    }

    public Users getUserId() {
        return userId;
    }

    public void setUserId(Users userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (taxistId != null ? taxistId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Taxists)) {
            return false;
        }
        Taxists other = (Taxists) object;
        if ((this.taxistId == null && other.taxistId != null) || (this.taxistId != null && !this.taxistId.equals(other.taxistId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Data.Taxists[ taxistId=" + taxistId + " ]";
    }
    
}
