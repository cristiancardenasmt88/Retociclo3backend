
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
 * Clase Category crea la tabla "category" con auto incremento
 * en la llave id
 * @since 08-11-2021
 * @version 1.0
 * @author Cristian Camilo Cárdenas López
 */

@Entity
@Table(name="category")
public class Category implements Serializable  {
    /**
     * creacion de la tabla con sus campos
     * atributo id de la tabla
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * atributo nombre de la tabla
     */
    private String name;
    /**
     * atributo descripción de la tabla
     */
    private String description;
    
    /**
     * relación de uno a muchos con la tabla mensajes
     */    
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy="category")
    @JsonIgnoreProperties("category")
    private List<Quadbike> quadbikes;
    
    /**
     * getter and setters de los atributos de la tabla
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
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
     /**
     * @return quadbike
     */

    public List<Quadbike> getQuadbikes() {
        return quadbikes;
    }

    public void setQuadbikes(List<Quadbike> quadbikes) {
        this.quadbikes = quadbikes;
    }
    
    
}
