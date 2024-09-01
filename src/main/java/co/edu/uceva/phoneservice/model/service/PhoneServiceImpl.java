package co.edu.uceva.phoneservice.model.service;


import co.edu.uceva.phoneservice.model.dao.PhoneDao;
import co.edu.uceva.phoneservice.model.entities.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *En esta interfaz define los metodos que se van a implementar en la clase PhoneServiceImpl
 * @Service estamos especificando que son objetos de tipo servicio que se pueden inyectar
 * @Component le esta especificando que es un objeto que se puede inyectar
 * @Autowired inyecta el objeto
 * @Overide es un metodo que se encarga de listar los telefonos
 * @Return retorna una lista de telefonos
 *
 *"Inyeccion de dependencias se utiliza para solicitar un objeto sin necesidad de construrilo"
 */

@Component

public class PhoneServiceImpl implements IPhoneService {

    @Autowired
    PhoneDao phoneDao;

    @Override
    public List<Phone> listar() {
        return (List<Phone>) phoneDao.findAll();
    }

}
