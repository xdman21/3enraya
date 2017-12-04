/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3_en_raya;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author xavi
 */
public class tablero 
{
    private String Jugador1;
    private String Jugador1name;
    private String Jugador2;
    private String Jugador2name;
    
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    protected static String[][] array = new String[6][9];
    protected static boolean[][] arraybool = new boolean[6][9];
    public tablero(String Jugador1, String Jugador2, String Jugador1name, String Jugador2name) 
        
    {
        this.Jugador1 = Jugador1; 
        this.Jugador2 = Jugador2;
        this.Jugador1name = Jugador1name;
        this.Jugador2name = Jugador2name;
    }
    
    public void imprimirtablero() 
    {
        String [][] tablero = new String [3][3];
        int p = 1;
        
        for (int i = 0; i < tablero.length; i++) 
        {
            for (int j = 0; j < tablero[i].length; j++) 
            {
                tablero[i][j] = "["+p+"]";
                p++;
            }
        }
        
        System.out.println("---------");
        for (int fila = 0; fila < tablero.length; fila++) 
        {
            String mostrar = "";
            
            for (int columna = 0; columna < tablero[fila].length; columna++) 
            {
                mostrar = mostrar + tablero[fila][columna];
            }
            
            System.out.println(mostrar);
        }
        System.out.println("---------");
    }
    
    public void moverjugador1() throws IOException 
    {
        System.out.println("Jugador1 (X)");
        System.out.println("Escribe las coordenadas");
        System.out.println("Izquierda a derecha");
        String cadena = br.readLine();
        int coordenadas1 = Integer.parseInt(cadena);
        System.out.println("Arriba abajo");
        cadena = br.readLine();
        int coordenadas2 = Integer.parseInt(cadena);
        for (int i = 0; i < 5; i++) 
        {
            if(i == 0 || i == 4) 
            {
                System.out.println("-----");
            }
            else 
            {
                for (int j = 0; j < 5; j++) 
                {
                    if(j == 4 || j == 0) 
                    {
                        System.out.print("|");
                    }
                    else 
                    {
                        if(i == coordenadas2 && j == coordenadas1 && i < 4 && i > 0 && j < 4 && j > 0 && arraybool[i][j] == true)  
                        {
                        arraybool[i][j] = false;
                        array[i][j] = this.Jugador1;
                        System.out.print(array[i][j]);
                        }
                        else 
                        {
                            System.out.print(array[i][j]);
                            if(i > 4 && i < 0 && j > 4 && j < 0)
                            {
                                System.out.println("Posición Incorrecta");
                            }
                        }
                    }
                }
                
            System.out.println("");
            }
        }
    }
    
    public void moverjugador2() throws IOException 
    {
        System.out.println("Jugador2(O)");
        System.out.println("Escribe las coordenadas");
        System.out.println("Izquierda a derecha");
        String cadena = br.readLine();
        int coordenadas1 = Integer.parseInt(cadena);
        System.out.println("Arriba abajo");
        cadena = br.readLine();
        int coordenadas2 = Integer.parseInt(cadena);
        for (int i = 0; i < 5; i++) 
        {
            if(i == 0 || i == 4) 
            {
                System.out.println("-----");
            }
            else 
            {
            for (int j = 0; j < 5; j++) 
            {
                if(j == 4 || j == 0) 
                {
                    System.out.print("|");
                }
                else 
                {
                if(i == coordenadas2 && j == coordenadas1 && i < 4 && i > 0 && j < 4 && j > 0 && arraybool[i][j] == true)  
                {
                arraybool[i][j] = false;
                array[i][j] = this.Jugador2;
                System.out.print(array[i][j]);
                }
                else 
                {
                System.out.print(array[i][j]);
                if(i > 4 && i < 0 && j > 4 && j < 0)
                {
                    System.out.println("Posición Incorrecta");
                }
                }
                }
            }
            System.out.println("");
            }
        }
    }
    
    public String wincheck()
    {
            if(array[1][1].equals(Jugador1) && array[2][1].equals(Jugador1) && array[3][1].equals(Jugador1)) 
            {
                this.imprimirtablero();
                return this.win(Jugador1);
            }
            if(array[1][2].equals(Jugador1) && array[2][2].equals(Jugador1) && array[3][2].equals(Jugador1)) 
            {
                this.imprimirtablero();
                return this.win(Jugador1);
            }
            if(array[1][3].equals(Jugador1) && array[2][3].equals(Jugador1) && array[3][3].equals(Jugador1)) 
            {
                this.imprimirtablero();
                return this.win(Jugador1);
            }
            if(array[1][1].equals(Jugador1) && array[2][2].equals(Jugador1) && array[3][3].equals(Jugador1)) 
            {
                this.imprimirtablero();
                return this.win(Jugador1);
            }
            if(array[1][3].equals(Jugador1) && array[2][2].equals(Jugador1) && array[1][1].equals(Jugador1)) 
            {
                this.imprimirtablero();
                return this.win(Jugador1);
            }
            //jugador2
            if(array[1][1].equals(Jugador2) && array[2][1].equals(Jugador2) && array[3][1].equals(Jugador2)) 
            {
                this.imprimirtablero();
                return this.win(Jugador2);
            }
            if(array[1][2].equals(Jugador2) && array[2][2].equals(Jugador2) && array[3][2].equals(Jugador2)) 
            {
                this.imprimirtablero();
                return this.win(Jugador2);
            }
            if(array[1][3].equals(Jugador2) && array[2][3].equals(Jugador2) && array[3][3].equals(Jugador2)) 
            {
                this.imprimirtablero();
                return this.win(Jugador2);
            }
            if(array[1][1].equals(Jugador2) && array[2][2].equals(Jugador2) && array[3][3].equals(Jugador2)) 
            {
                this.imprimirtablero();
                return this.win(Jugador2);
            }
            if(array[1][3].equals(Jugador2) && array[2][2].equals(Jugador2) && array[1][1].equals(Jugador2)) 
            {
                this.imprimirtablero();
                return this.win(Jugador2);
            }
            else 
            {
                return "";
            }
    }
    
    public String win(String player) 
    {
        if(player.equals(Jugador1)) 
        {
        return "El Ganador es el Jugador "+ Jugador1name;
        }
        if(player.equals(Jugador2)) 
        {
        return "El Ganador es el Jugador "+ Jugador2name;
        }
        else 
        {
            return "";
        }
    }
}
