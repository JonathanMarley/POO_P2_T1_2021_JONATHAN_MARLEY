/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.jm.poo.p1.poo_t1_jonathan_marley.objeto;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class main {
    public static void main(String[] args) {
         Scanner capturador = new Scanner(System.in,"ISO-8859-1").useDelimiter("\\n");
          VotocionCandidato candidatos = new VotocionCandidato();
           System.out.println(" ==================================================================== ");
           System.out.println(" *       BIENVENIDO AL SISTEMA DE VOTACIONES ESTUDIANTIL          * ");
           System.out.println(" ==================================================================== ");
        
     
             System.out.println(" -1.Agregar Candidatos: ");
             System.out.println(" -2.Votar Para Seleccionar Candidatos: ");
             System.out.println(" --Seleccione una opcion: ");
             System.out.println(" ==================================================================== ");
             candidatos.setOpcion(capturador.nextInt());
        
        
    }
}
