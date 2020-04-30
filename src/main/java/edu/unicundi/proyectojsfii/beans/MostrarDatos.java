/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.proyectojsfii.beans;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Santiago Gomez
 */
/**
 * Clase que recibe los datos y calcula el sueldo del trabajador
 */
@Named(value = "mostrarDatos")
@RequestScoped
public class MostrarDatos implements Serializable {

    /*
     Sueldo base de cualquier empleado
     */
    private int sueldoBase = 30000;
    /*
     Donde se almacena el sueldo total
     */
    private int sueldo = 0;
    /*
     cantidad de idiomas que domina
     */
    private int cantidadIdiomas;
    /*
     Variable que contiene el resto de datos del trabajador
     */
    @Inject
    private Index datos;

    /*
     obtiene los otros datos del trabajador
     */
    public Index getDatos() {
        return datos;
    }
    /*
     setea los datos del trabajador
     */

    public void setDatos(Index datos) {
        this.datos = datos;
    }
    /*
     obtiene el sueldo base del trabajador
     */

    public int getSueldoBase() {
        return sueldoBase;
    }
    /*
     setea el sueldo base del trabajador
     */

    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    /*
     obtiene el sueldo del trabajador
     */

    public int getSueldo() {
        return sueldo;
    }
    /*
     setea el sueldo del trabajador
     */

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    /*
     obtiene la cantidad de idiomas del trabajador
     */

    public int getCantidadIdiomas() {
        return cantidadIdiomas;
    }
    /*
     setea la cantidad de idiomas del trabajador
     */

    public void setCantidadIdiomas(int cantidadIdiomas) {
        this.cantidadIdiomas = cantidadIdiomas;
    }
    
    /**
     * valida días, nombre y apellido
     * @return 
     */
    public boolean validar() {
        if (datos.getDiasTrabajados() <= 0 || datos.getNombre().length() <= 0 || datos.getApellido().length() <= 0) {
            return false;
        } else {
            return true;
        }
    }

    @PostConstruct
    /*
     Metodo para calcular el sueldo total del trabajador
     */
    public void calcularNomina() {
        if (validar()) {
            cantidadIdiomas = (datos.getIdiomas().length) * 10000;
            if (datos.getNivelEstudio().contains("tecnico")) {
                sueldo = ((sueldoBase + 5000) + cantidadIdiomas) * datos.getDiasTrabajados();
            } else if (datos.getNivelEstudio().contains("tecnologo")) {
                sueldo = ((sueldoBase + 15000) + cantidadIdiomas) * datos.getDiasTrabajados();
            } else if (datos.getNivelEstudio().contains("profesional")) {
                sueldo = ((sueldoBase + 30000) + cantidadIdiomas) * datos.getDiasTrabajados();
            } else if (datos.getNivelEstudio().contains("magister")) {
                sueldo = ((sueldoBase + 40000) + cantidadIdiomas) * datos.getDiasTrabajados();
            } else {
                sueldo = (sueldoBase + cantidadIdiomas) * datos.getDiasTrabajados();
            }

        } else {
            datos.setDiasTrabajados(0);
        }
    }
}
