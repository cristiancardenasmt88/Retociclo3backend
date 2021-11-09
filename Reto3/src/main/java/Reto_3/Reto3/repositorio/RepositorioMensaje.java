
package Reto_3.Reto3.repositorio;


import Reto_3.Reto3.Interface.InterfaceMensaje;
import Reto_3.Reto3.modelo.Mensaje;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Clase RepositorioMensaje
 * @since 08-11-2021
 * @version 1.0
 * @author Cristian Camilo Cárdenas López
 */
@Repository
public class RepositorioMensaje {
    @Autowired
    private InterfaceMensaje crud3;
    
    public List<Mensaje> getAll(){
        return (List<Mensaje>) crud3.findAll();
    }
    public Optional<Mensaje> getMessage(int id){
        return crud3.findById(id);
    }
    public Mensaje save(Mensaje message){
        return crud3.save(message);
    }
    public void delete(Mensaje message){
        crud3.delete(message);
    }
    
}
