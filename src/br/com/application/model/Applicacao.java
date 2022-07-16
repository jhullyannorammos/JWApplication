package br.com.application.model;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Juliano
 */
@Entity
public class Applicacao implements Serializable {

    @Id private Long ID;
    
    private Calendar dataProjeto;
    private String aplicativo;
    private String tecnologia;
    private String database;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }
    
}
