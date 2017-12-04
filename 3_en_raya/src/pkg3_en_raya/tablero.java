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
    
    public String [][] tablero = new tablero[3][3];
    
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
    
    public void crearTablero()
    {
        int p = 1;
        
        for (int i = 0; i < tablero.length; i++) 
        {
            for (int j = 0; j < tablero[i].length; j++) 
            {
                tablero[i][j] = "["+p+"]";
                p++;
            }
        }
    }
    
    public void imprimirtablero() 
    {
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
        System.out.println("Jugador1 [X]");
        
        System.out.println("Seleccione una posicion");
        
        switch(Integer.parseInt(br.readLine()))
        {
            case 1:
                tablero[0][0] = "[X]";
                imprimirtablero();
                break;
            case 2:
                tablero[0][1] = "[X]";
                imprimirtablero();
                break;
            case 3:
                tablero[0][2] = "[X]";
                imprimirtablero();
                break;
            case 4:
                tablero[1][0] = "[X]";
                imprimirtablero();
                break;
            case 5:
                tablero[1][1] = "[X]";
                imprimirtablero();
                break;
            case 6:
                tablero[1][2] = "[X]";
                imprimirtablero();
                break;
            case 7:
                tablero[2][0] = "[X]";
                imprimirtablero();
                break;
            case 8:
                tablero[2][2] = "[X]";
                imprimirtablero();
                break;
            case 9:
                tablero[2][3] = "[X]";
                imprimirtablero();
                break;
        }
    }
    
    public void moverjugador2() throws IOException 
    {
        System.out.println("Jugador1 [X]");
        
        System.out.println("Seleccione una posicion");
        
        switch(Integer.parseInt(br.readLine()))
        {
            case 1:
                tablero[0][0] = "[O]";
                imprimirtablero();
                break;
            case 2:
                tablero[0][1] = "[O]";
                imprimirtablero();
                break;
            case 3:
                tablero[0][2] = "[O]";
                imprimirtablero();
                break;
            case 4:
                tablero[1][0] = "[O]";
                imprimirtablero();
                break;
            case 5:
                tablero[1][1] = "[O]";
                imprimirtablero();
                break;
            case 6:
                tablero[1][2] = "[O]";
                imprimirtablero();
                break;
            case 7:
                tablero[2][0] = "[O]";
                imprimirtablero();
                break;
            case 8:
                tablero[2][2] = "[O]";
                imprimirtablero();
                break;
            case 9:
                tablero[2][3] = "[O]";
                imprimirtablero();
                break;
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
