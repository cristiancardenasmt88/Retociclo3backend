
package Reto_3.Reto3.modelo;

import Reto_3.Reto3.modelo.Client;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Clase Mensaje crea la tabla "message" con auto incremento
 * en la llave id
 * @since 08-11-2021
 * @version 1.0
 * @author Cristian Camilo Cárdenas López
 */
@Entity
@Table(name = "message")
public class Mensaje implements Serializable {
    /**
     * Hace la creacion de la tabla con sus campos
     * atributo idMessage de la tabla
     */ 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMessage;
    /**
     * Atributo messageText de la tabla
     */
    private String messageText;
    
    /**
     * Relación de muchos a uno con la tabla quadbike
     */
    @ManyToOne
    @JoinColumn(name="id")
    @JsonIgnoreProperties({"messages", "client", "reservations"})
    private Quadbike quadbike;
    /**
     * Relación de muchos a uno con la tabla client
     */
    @ManyToOne
    @JoinColumn(name="clientId")
    @JsonIgnoreProperties({"messages", "reservations", "client"})
    private Client client;
    /**
     * Getter and setters de los atributos de la tabla
     * @return idMessage
     */
    public Integer getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(Integer idMessage) {
        this.idMessage = idMessage;
    }
    /**
     * @return messageText
     */
    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
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
    
    
}
