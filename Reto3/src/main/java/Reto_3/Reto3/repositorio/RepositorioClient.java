
package Reto_3.Reto3.repositorio;


import Reto_3.Reto3.Interface.InterfaceClient;
import Reto_3.Reto3.modelo.Client;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Clase RepositorioClient
 * @since 08-11-2021
 * @version 1.0
 * @author Cristian Camilo Cárdenas López
 */
@Repository
public class RepositorioClient {
    @Autowired
    private InterfaceClient crudClient;
    
    public List<Client> getAll(){
        return (List<Client>) crudClient.findAll();
    }
    public Optional<Client> getClient(int id){
        return crudClient.findById(id);
    }
    public Client save(Client client){
        return crudClient.save(client);
    }
    public void delete(Client client){
        crudClient.delete(client);
    }
}
