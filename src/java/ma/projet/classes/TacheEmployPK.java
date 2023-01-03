/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.classes;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author chaou
 */

@Embeddable
public class TacheEmployPK implements Serializable {

    private int tache;
    private int employe;
    @Temporal(TemporalType.DATE)
    private Date dateDebutRelle;


    public TacheEmployPK() {
    }

    public int getTache() {
        return tache;
    }

    public void setTache(int tache) {
        this.tache = tache;
    }

    public int getEmploye() {
        return employe;
    }

    public void setEmploye(int employe) {
        this.employe = employe;
    }

    public Date getDateDebutRelle() {
        return dateDebutRelle;
    }

    public void setDateDebutRelle(Date dateDebutRelle) {
        this.dateDebutRelle = dateDebutRelle;
    }

   

}
