package co.edu.uceva.phoneservice.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

/*
En esta JavaClass estamos creando las propiedades de mi producto, en este caso estamos hablando de un negocio de telefonos por lo tanto tendremos caracteristicas fisicas principales de uno
 */

import lombok.Getter;
import lombok.Setter;

/**
 * ORM: Objet Relational Mapping - este permite mapear objetos de java con relacion a las bases de datos, trabaja sobre cualquier base de datos
 * JPA: Java Persistence API (Es una base de datos, es una especificacion de java con una implementacion de un ORM basico, las mas utilizadas son ->Hibernate, EclipseLink, Toplink, OpenJPA, Dataucleus son bibliotecas que implementan JPA)
 */

/**
 * La clase Phone es una entidad que se mapea con la tabla de Phone en la base de datos
 */

//@Data//Crea los getter an setter de las variables
//@Entity //Con este comando se genera la base de datos, el nombre sera escogido por la entidad segun su horientacion
//@Getter crea solo los getter de las varibales
//@Setter  crea solo los getter de las variables
//@AllArgsConstructor me crea los getter y los argumentos listos para trabajar

/**
 * public class Phone {
 *     @Id
 *     @GeneratedValue(strategy = GenerationType.IDENTITY) //Generador de LLaves primarias
 *     private String imei;
 *     private String marca;
 *     private String modelo;
 *     private String sistemaOperativo;
 *     private int capacidadBateria;
 *     private int numeroPiezas;
 *     private String calidadArmado;
 *     private String resolucionPantalla;
 *     private int almacenamientoInterno;
 *     private int camaraPrincipal;
 *     private String conectividad;
 *     private String color;
 *
 * }
 * Estas fueron mis variables iniciales pero el pgadmin no reconocia como variables desde sistema operativo hasta cooli, solicito asesoria en clase
 *
 */



@Data
@Entity
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String marca;
    private String modelo;
    private String año;
    private String color;
    private String precio;

}