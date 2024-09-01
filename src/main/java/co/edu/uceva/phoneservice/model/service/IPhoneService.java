package co.edu.uceva.phoneservice.model.service;

import co.edu.uceva.phoneservice.model.entities.Phone;

import java.util.List;

/**
 * En esta interfaz vamos a declarar un metodo para listar todos los componentes del telefono
 */

public interface IPhoneService {
    List<Phone> listar();


}
