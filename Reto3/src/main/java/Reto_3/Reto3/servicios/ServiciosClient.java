
package Reto_3.Reto3.servicios;


import Reto_3.Reto3.repositorio.RepositorioClient;
import Reto_3.Reto3.modelo.Client;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Clase ServiciosCategory
 * @since 08-11-2021
 * @version 1.0
 * @author Cristian Camilo Cárdenas López
 */
@Service
public class ServiciosClient {
    @Autowired
     private RepositorioClient metodosCrud;
     
     public List<Client> getAll(){
        return metodosCrud.getAll();
    }
     
      public Optional<Client> getClient(int clientId) {
        return metodosCrud.getClient(clientId);
    }

    public Client save(Client client){
        if(client.getIdClient()==null){
            return metodosCrud.save(client);
        }else{
            Optional<Client> e= metodosCrud.getClient(client.getIdClient());
            if(e.isEmpty()){
                return metodosCrud.save(client);
            }else{
                return client;
            }
        }
    }

    public Client update(Client client){
        if(client.getIdClient()!=null){
            Optional<Client> e= metodosCrud.getClient(client.getIdClient());
            if(!e.isEmpty()){
                if(client.getName()!=null){
                    e.get().setName(client.getName());
                }
                if(client.getAge()!=null){
                    e.get().setAge(client.getAge());
                }
                if(client.getPassword()!=null){
                    e.get().setPassword(client.getPassword());
                }
                metodosCrud.save(e.get());
                return e.get();
            }else{
                return client;
            }
        }else{
            return client;
        }
    }

    public boolean deleteClient(int clientId) {
        Boolean aBoolean = getClient(clientId).map(client -> {
            metodosCrud.delete(client);
            return true;
        }).orElse(false);
        return aBoolean;
    }
    
}
