package br.com.application.model;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Entity;

/**
 *
 * @author Juliano
 */
@Entity
public class Applicacao implements Serializable {
    
    private Calendar dataProjeto;
    private String aplicativo;
    private String tecnologia;
    private String database;
    
}
