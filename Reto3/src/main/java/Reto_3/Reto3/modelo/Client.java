
package Reto_3.Reto3.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Clase client crea la tabla "client" con auto incremento
 * en la llave id
 * @since 08-11-2021
 * @version 1.0
 * @author Cristian Camilo Cárdenas López
 */
@Entity
@Table(name = "client")
public class Client implements Serializable {
    /**
     * Hace la creacion de la tabla con sus campos
     * atributo id de la tabla
     */ 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idClient;
    /**
     * Atributo email de la tabla
     */
    private String email;
    /**
     * Atributo password de la tabla
     */
    private String password;
    /**
     * Atributo marca de la tabla
     */
    private String name;
    /**
     * Atributo años de la tabla
     */
    private Integer age;
    
    /**
     * Relación de uno a muchos con la tabla messages
     */
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy="client")
    @JsonIgnoreProperties("client")
    public List<Mensaje>messages;
    /**
     * Relación de uno a muchos con la tabla reservations
     */
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy="client")
    @JsonIgnoreProperties("client")
    public List<Reservation>reservations;
    /**
     * Getter and setters de los atributos de la tabla
     * @return id cliente
     */

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }
    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    /**
     * @return messages
     */
    public List<Mensaje> getMessages() {
        return messages;
    }

    public void setMessages(List<Mensaje> messages) {
        this.messages = messages;
    }
    /**
     * @return reservations
     */
    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
    
    
}
