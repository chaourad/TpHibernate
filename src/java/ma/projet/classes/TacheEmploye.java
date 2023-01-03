/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.classes;

import java.util.Date;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author chaou
 */
@Entity
public class TacheEmploye {

    @EmbeddedId
    private TacheEmployPK pk;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateFin;
    @ManyToOne
    @JoinColumn(name = "employe", insertable = false, updatable = false)
    private Employe empl;
    @ManyToOne
    @JoinColumn(name = "tache", insertable = false, updatable = false)
    private Tache tach;

    public TacheEmploye() {
    }

    public TacheEmployPK getPk() {
        return pk;
    }

    public void setPk(TacheEmployPK pk) {
        this.pk = pk;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public Employe getEmpl() {
        return empl;
    }

    public void setEmpl(Employe empl) {
        this.empl = empl;
    }

    public Tache getTach() {
        return tach;
    }

    public void setTach(Tache tach) {
        this.tach = tach;
    }

}
