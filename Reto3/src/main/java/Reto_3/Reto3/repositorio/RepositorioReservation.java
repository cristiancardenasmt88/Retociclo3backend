
package Reto_3.Reto3.repositorio;


import Reto_3.Reto3.Interface.InterfaceReservation;
import Reto_3.Reto3.contador.ContadorClientes;
import Reto_3.Reto3.modelo.Client;
import Reto_3.Reto3.modelo.Reservation;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Clase RepositorioReservation
 * @since 08-11-2021
 * @version 1.0
 * @author Cristian Camilo Cárdenas López
 */
@Repository
public class RepositorioReservation {
    @Autowired
    private InterfaceReservation crud4;

    public List<Reservation> getAll(){
        return (List<Reservation>) crud4.findAll();
    }
    public Optional<Reservation> getReservation(int id){
        return crud4.findById(id);
    }
    public Reservation save(Reservation reservation){
        return crud4.save(reservation);
    }
    public void delete(Reservation reservation){
        crud4.delete(reservation);
    }
    
    public List<Reservation> ReservationStatus(String status){
        return crud4.findAllByStatus(status);
    }
    
     public List<Reservation> ReservacionTiempoRepositorio (Date a, Date b){
         return crud4.findAllByStartDateAfterAndStartDateBefore(a, b);
     }
     
     public List<ContadorClientes> getClientesRepositorio(){
         List<ContadorClientes> res = new ArrayList<>();
         List<Object[]> report = crud4.countTotalReservationsByClient();
         for(int i=0; i<report.size(); i++){
             res.add(new ContadorClientes((Long)report.get(i)[1],(Client) report.get(i)[0]));
         }
         return res;
     }
}
