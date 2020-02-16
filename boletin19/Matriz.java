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
            System.out.println("Insertar nombre del equipo " + (k+1) + " :");
            equipo[k]=sc.nextLine();
            //equipo[k]="equipo" + Integer.toString(k+1);
        }
        for(int i=0;i<tabla.length; i++){
            for(int j=0;j<tabla[i].length;j++){
                System.out.println("Inserte el numero de goles del equipo " + (i+1) + " de la jornada " + (j+1) + " :");
                tabla[i][j]=sc.nextInt();
                //tabla[i][j]=(int)(Math.random()*9);
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
    public void buscarDato(int[][] tabla, String[] equipo, String nombre, int xor){
        int encontrado=0, goles=-1, equipo_aux=-1, jor=-1;
        for(int i=0;i<tabla.length; i++){
                if(nombre.equals(equipo[i])){
                    for(int j=0;j<tabla[i].length;j++){
                        if((j+1) == xor){
                            encontrado=1;
                            equipo_aux=i;
                            jor=j+1;
                            goles=tabla[i][j];
                            break;
                        }
                    }
                    break;
                }
        }
        if(encontrado != 0){
            System.out.println("nombre: " +equipo[equipo_aux] + "\nJornada: " + jor + "\nGoles marcados: " + goles);
        }else{
            System.out.println("Equipo no encontrado");
        }
    }
    public void ListaEquipos(int[][] tabla, String[] equipo){
        String[] aux=new String[equipo.length];
        String nomx, nomy;
        int[] max_goles=new int[equipo.length];
        int sum_goles=0;
        int max_sum=0;
        int auxx, auxy,min_goles=999;
        for(int i=0;i<tabla.length; i++){
            aux[i]=equipo[i];
            for(int j=0;j<tabla[i].length;j++){
                sum_goles=sum_goles+tabla[i][j];
            }
            max_goles[i]=sum_goles;
            sum_goles=0;
        }
        for(int i=0;i<equipo.length;i++){
            for(int j=0;j<equipo.length;j++){
                if(max_goles[i]<max_goles[j]){
                    auxx=max_goles[j];
                    auxy=max_goles[i];
                    max_goles[i]=auxx;
                    max_goles[j]=auxy;
                    nomx=aux[j];
                    nomy=aux[i];
                    aux[i]=nomx;
                    aux[j]=nomy;
                }
            }
        }
        System.out.println("Lista:");
        for(int i=0;i<aux.length;i++){
            System.out.println(aux[i] + "\nGoles: " + max_goles[i]);
        }
    }
    public void MaxGolesJor(String[] equipos, int[][] tabla){
        int max_goles=-1, jornada=-1, equipo=-1;
        for(int i=0;i<tabla[0].length;i++){
            for(int j=0;j<tabla.length;j++){
                if(max_goles<tabla[j][i]){
                    equipo=j;
                    jornada=i;
                    max_goles=tabla[j][i];
                }
            }
          System.out.println("Jornada: " + (jornada+1) +"\nnombre: " + equipos[equipo] +"\nmax_goles: " + max_goles);
          max_goles=-1;
        }
    }
    
    public void MaxGoles(String[] equipos, int[][] tabla){
        int max_goles=-1, jornada=-1, equipo=-1;
        for(int i=0;i<tabla[0].length;i++){
            for(int j=0;j<tabla.length;j++){
                if(max_goles<tabla[j][i]){
                    equipo=j;
                    jornada=i;
                    max_goles=tabla[j][i];
                }
            }
        }
        System.out.println("nombre: " + equipos[equipo] + "\nJornada: " + (jornada+1) +"\nmax_goles: " + max_goles);
    }
}

