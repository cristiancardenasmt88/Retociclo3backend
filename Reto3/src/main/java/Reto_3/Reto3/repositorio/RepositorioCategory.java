
package Reto_3.Reto3.repositorio;

import Reto_3.Reto3.Interface.InterfaceCategory;
import Reto_3.Reto3.modelo.Category;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Clase RepositorioCategory
 * @since 08-11-2021
 * @version 1.0
 * @author Cristian Camilo Cárdenas López
 */
@Repository
public class RepositorioCategory {
    @Autowired
    private InterfaceCategory crudCategory;
    
    public List<Category> getAll(){
        return (List<Category>) crudCategory.findAll();
    }
    public Optional<Category> getCategory(int id){
        return crudCategory.findById(id);
    }
    public Category save(Category categoria){
        return crudCategory.save(categoria);
    }
    public void delete(Category categoria){
        crudCategory.delete(categoria);
    }
}
