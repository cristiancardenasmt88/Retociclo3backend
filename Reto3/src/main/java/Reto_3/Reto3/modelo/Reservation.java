
package Reto_3.Reto3.modelo;

import Reto_3.Reto3.modelo.Quadbike;
import Reto_3.Reto3.modelo.Client;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Clase Reservation crea la tabla "reservation" con auto incremento
 * en la llave id
 * @since 08-11-2021
 * @version 1.0
 * @author Cristian Camilo Cárdenas López
 */
@Entity
@Table(name = "reservation")
public class Reservation implements Serializable{
    /**
     * Hace la creacion de la tabla con sus campos
     * atributo idReservation de la tabla
     */ 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReservation;
    /**
     * Atributo startDate de la tabla
     */
    private Date startDate;
    /**
     * Atributo devolutionDate de la tabla
     */
    private Date devolutionDate;
    /**
     * Atributo status de la tabla
     */
    private String status="created";
    /**
     * Relación de muchos a uno con la tabla quadbike
     */
    @ManyToOne
    @JoinColumn(name = "id")
    @JsonIgnoreProperties("reservations")
    private Quadbike quadbike;
    /**
     * Relación de muchos a uno con la tabla client
     */
    @ManyToOne
    @JoinColumn(name = "idClient")
    @JsonIgnoreProperties({"reservations","messages"})
    private Client client;

    private String score; //depende el grupo
    /**
     * Getter and setters de los atributos de la tabla
     * @return idReservation
     */

    public Integer getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(Integer idReservation) {
        this.idReservation = idReservation;
    }
    /**
     * @return startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    /**
     * @return devolutionDate
     */
    public Date getDevolutionDate() {
        return devolutionDate;
    }

    public void setDevolutionDate(Date devolutionDate) {
        this.devolutionDate = devolutionDate;
    }
    /**
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    /**
     * @return quadbike
     */
    public Quadbike getQuadbike() {
        return quadbike;
    }

    public void setQuadbike(Quadbike quadbike) {
        this.quadbike = quadbike;
    }
    /**
     * @return client
     */
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    /**
     * @return score
     */
    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
    
    
}
