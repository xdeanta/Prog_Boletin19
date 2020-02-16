/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

import java.util.Scanner;

/**
 *
 * @author xdeantabelisario
 */
public class Boletin19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] goles;
        int tamano1, tamano2;
        String[] equipos;
        String nomb;
        Matriz m;
        Scanner sc;
        sc=new Scanner(System.in);
        goles=new int[20][36];
        equipos=new String[20];
        m=new Matriz();
        m.insertarDatos(goles, equipos);
        m.mostrarDatos(goles, equipos);
        m.ListaEquipos(goles, equipos);
        System.out.println("Mayor numero de goles por jornada:");
        m.MaxGolesJor(equipos, goles);
        System.out.println("Mayor numero de goles de la liga");
        m.MaxGoles(equipos,goles);
        System.out.println("Inserte nombre del equipo:");
        nomb=sc.nextLine();
        System.out.println("Inserte la jornada a consultar");
        tamano1=sc.nextInt();
        m.buscarDato(goles, equipos, nomb, tamano1);
    }
    
}
