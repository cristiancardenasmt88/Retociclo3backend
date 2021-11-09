
package Reto_3.Reto3.modelo;

import Reto_3.Reto3.modelo.Category;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Clase Quadbike crea la tabla "quadbike" con auto incremento
 * en la llave id
 * @since 08-11-2021
 * @version 1.0
 * @author Cristian Camilo Cárdenas López
 */

@Entity
@Table(name = "quadbike")

public class Quadbike implements Serializable{

    /**
     * Hace la creacion de la tabla con sus campos
     * atributo id de la tabla
     */    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * Atributo nombre de la tabla
     */
    private String name;
    /**
     * Atributo marca de la tabla
     */
    private String brand;
    /**
     * Atributo número de quadbike de la tabla
     */
    private Integer year;
    /**
     * Atributo descripción de la tabla
     */
    private String description;
    
    /**
     * Relación de muchos a uno con la tabla categoria
     */
    @ManyToOne
    @JoinColumn(name = "categoryId")
    @JsonIgnoreProperties("quadbikes")
    private Category category;

    /**
     * Relación de uno a muchos con la tabla mensajes
     */
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "quadbike")
    @JsonIgnoreProperties({"quadbike", "client"})
    private List<Mensaje> messages;

    /**
     * Relación de uno a muchos con la tabla reservaciones
     */
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "quadbike")
    @JsonIgnoreProperties({"quadbike", "client"})
    private List<Reservation> reservations;
    
    /**
     * Getter and setters de los atributos de la tabla
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    /**
     * @return year
     */
    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * @return category
     */
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
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
