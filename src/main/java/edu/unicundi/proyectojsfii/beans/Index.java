/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.proyectojsfii.beans;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.view.ViewScoped;

import javax.inject.Named;

/**
 *
 * @author Santiago Gómez
 */

/*
clase que recibe los datos principales del trabajador
*/
@Named(value = "index")
@RequestScoped
public class Index implements Serializable {
    /*
    almacena el nombre del trabajador
    */
    private String nombre;
    /*
    almacena el apellido del trabajador
    */
    private String apellido;
    /*
    almacena la cédula del trabajador
    */
    private String cedula;
    /*
    almacena la fecha de nacimiento del trabajador
    */
    private String fechaNacimiento;
    /*
    almacena el nivel de estudio del trabajador
    */
    private String nivelEstudio;
    /*
    almacena los idiomas del trabajador
    */
    private String[] idiomas;
    /*
    almacena la cantidad de días trabajados
    */
    private int diasTrabajados;
   
    /*
    obtiene el nombre de la persona
    */
    public String getNombre() {
        return nombre;
    }
    /*
    setea el nombre de la persona
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /*
    obtiene el apellido de la persona
    */
    public String getApellido() {
        return apellido;
    }
    /*
    setea el apellido de la persona
    */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    /*
    obtiene la cedula de la persona
    */
    public String getCedula() {
        return cedula;
    }
    /*
    setea la cedula de la persona
    */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    /*
    obtiene la fecha de nacimiento de la persona
    */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    /*
    setea la fecha de naciemiento de la persona
    */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    /*
    obtiene el nivel de estudio de la persona
    */
    public String getNivelEstudio() {
        return nivelEstudio;
    }
    /*
    setea el nivel de estudio de la persona
    */
    public void setNivelEstudio(String nivelEstudio) {
        this.nivelEstudio = nivelEstudio;
    }
    /*
    obtiene los idiomas de la persona   
    */
    public String[] getIdiomas() {
        return idiomas;
    }
    /*
    setea los idiomas que habla la persona
    */
    public void setIdiomas(String[] idiomas) {
        this.idiomas = idiomas;
    }
    /*
    obtiene los dias trabajados por la persona
    */
    public int getDiasTrabajados() {
        return diasTrabajados;
    }
    /*
    setea los días trabajados por la persona
    */
    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

}
