/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.jm.poo.p1.poo_t1_jonathan_marley.objeto;

/**
 *
 * @author Usuario
 */
public class VotacionCandidato {
    private String nombre;
    private int opcion;
    
    public VotacionCandidato() {
    }

    public VotacionCandidato(String nombre, int opcion) {
        this.nombre = nombre;
        this.opcion = opcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }
}
