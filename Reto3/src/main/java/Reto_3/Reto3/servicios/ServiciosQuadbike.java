
package Reto_3.Reto3.servicios;

import Reto_3.Reto3.repositorio.RepositorioQuadbike;
import Reto_3.Reto3.modelo.Quadbike;
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
public class ServiciosQuadbike {
    @Autowired
    private RepositorioQuadbike metodosCrud;

    public List<Quadbike> getAll(){
        return metodosCrud.getAll();
    }

    public Optional<Quadbike> getQuadbike(int quadbikeId) {
        return metodosCrud.getQuadbike(quadbikeId);
    }

    public Quadbike save(Quadbike quadbike){
        if(quadbike.getId()==null){
            return metodosCrud.save(quadbike);
        }else{
            Optional<Quadbike> e=metodosCrud.getQuadbike(quadbike.getId());
            if(e.isEmpty()){
                return metodosCrud.save(quadbike);
            }else{
                return quadbike;
            }
        }
    }

    public Quadbike update(Quadbike quadbike){
        if(quadbike.getId()!=null){
            Optional<Quadbike> e=metodosCrud.getQuadbike(quadbike.getId());
            if(!e.isEmpty()){
                if(quadbike.getName()!=null){
                    e.get().setName(quadbike.getName());
                }
                if(quadbike.getBrand()!=null){
                    e.get().setBrand(quadbike.getBrand());
                }
                if(quadbike.getYear()!=null){
                    e.get().setYear(quadbike.getYear());
                }
                if(quadbike.getDescription()!=null){
                    e.get().setDescription(quadbike.getDescription());
                }
                if(quadbike.getCategory()!=null){
                    e.get().setCategory(quadbike.getCategory());
                }
                metodosCrud.save(e.get());
                return e.get();
            }else{
                return quadbike;
            }
        }else{
            return quadbike;
        }
    }


    public boolean deleteQuadbike(int quadbikeId) {
        Boolean aBoolean = getQuadbike(quadbikeId).map(quadbike -> {
            metodosCrud.delete(quadbike);
            return true;
        }).orElse(false);
        return aBoolean;
    }
    
}
