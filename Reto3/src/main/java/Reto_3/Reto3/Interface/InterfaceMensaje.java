/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto_3.Reto3.Interface;

import Reto_3.Reto3.modelo.Mensaje;
import org.springframework.data.repository.CrudRepository;

/**
 * Crea el repositorio InterfaceMensaje
 * @since 08-11-2021
 * @version 1.0
 * @author Cristian Camilo Cárdenas López
 */
public interface InterfaceMensaje extends CrudRepository<Mensaje,Integer> {
    
}
