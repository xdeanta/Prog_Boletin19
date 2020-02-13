package boletin19;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xdeantabelisario
 */
public class Matriz {
    public void insertarDatos(int[][] tabla, String[] equipo){
        Scanner sc;
        sc=new Scanner(System.in);
        for(int k=0;k<equipo.length;k++){
            //equipo[k]=sc.nextLine();
            equipo[k]="equipo" + Integer.toString(k+1);
        }
        for(int i=0;i<tabla.length; i++){
            for(int j=0;j<tabla[i].length;j++){
                //tabla[i][j]=sc.nextInt();
                tabla[i][j]=(int)(Math.random()*5);
            }
        }
    }
    public void mostrarDatos(int[][] tabla, String[] equipo){
        for(int i=0;i<tabla.length; i++){
            System.out.print(equipo[i] + " ");
            for(int j=0;j<tabla[i].length;j++){
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public void buscarDato(int xor,int[][] tabla, String[] equipo){
        int encontrado=0;
        for(int i=0;i<tabla.length; i++){
            for(int j=0;j<tabla[i].length;j++){
                System.out.print(tabla[i][j] + " ");
            }
        }
    }
    public void ListaEquipos(int[][] tabla, String[] equipo){
        String[] aux=new String[equipo.length];
        int sum_goles=0;
        int max_sum=0;
        int posx, posy;
        for(int i=0;i<tabla.length; i++){
            for(int j=0;j<tabla[i].length;j++){
                sum_goles=sum_goles+tabla[i][j];
            }
            
        }
    }
}
