package co.edu.uceva.phoneservice.model.dao;

import co.edu.uceva.phoneservice.model.entities.Phone;
import org.springframework.data.repository.CrudRepository;

/**
 * DAO: Data Access Object: Manejar las operaciones del CRUD de la entidad
 * Esta inetrfaz hereda de CrudRepository y se encarga de realizar las operaciones
 * Phone es la entidad y Long es el tipo de dato
 */

public interface PhoneDao extends CrudRepository <Phone, Long> {
}
