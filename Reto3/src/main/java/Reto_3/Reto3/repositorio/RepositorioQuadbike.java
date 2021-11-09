
package Reto_3.Reto3.repositorio;


import Reto_3.Reto3.Interface.InterfaceQuadbike;
import Reto_3.Reto3.modelo.Quadbike;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Clase RepositorioQuadbike 
 * @since 08-11-2021
 * @version 1.0
 * @author Cristian Camilo Cárdenas López
 */
@Repository
public class RepositorioQuadbike {
    
    @Autowired
    private InterfaceQuadbike crud;

    public List<Quadbike> getAll(){
        return (List<Quadbike>) crud.findAll();
    }

    public Optional<Quadbike> getQuadbike(int id){
        return crud.findById(id);
    }

    public Quadbike save(Quadbike quadbike){
        return crud.save(quadbike);
    }
    public void delete(Quadbike quadbike){
        crud.delete(quadbike);
    }
}
