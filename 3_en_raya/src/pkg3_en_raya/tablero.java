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
    private String Jugador1name;
    private String Jugador2name;
    
    public String [][] tablero = new tablero[3][3];
    
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public tablero()
    {
    }
        
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
        System.out.println("Jugador 1 [X]");
        
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
        System.out.println("Jugador 2 [X]");
        
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
        //Jugador 1
        if (tablero[0][0].contains("X") && tablero[0][1].contains("X") && tablero[0][2].contains("X")) 
        {
            return "GANO EL JUGADOR 1";
        }
        else if (tablero[1][0].contains("X") && tablero[1][1].contains("X") && tablero[1][2].contains("X"))
        {
            return "GANO EL JUGADOR 1";
        }
        else if (tablero[2][0].contains("X") && tablero[2][1].contains("X") && tablero[2][2].contains("X"))
        {
            return "GANO EL JUGADOR 1";
        }
        else if (tablero[0][0].contains("X") && tablero[1][0].contains("X") && tablero[2][0].contains("X"))
        {
            return "GANO EL JUGADOR 1";
        }
        else if (tablero[0][1].contains("X") && tablero[1][1].contains("X") && tablero[2][1].contains("X"))
        {
            return "GANO EL JUGADOR 1";
        }
        else if (tablero[0][2].contains("X") && tablero[1][2].contains("X") && tablero[2][2].contains("X"))
        {
            return "GANO EL JUGADOR 1";
        }
        else if (tablero[0][0].contains("X") && tablero[1][1].contains("X") && tablero[2][2].contains("X"))
        {
            return "GANO EL JUGADOR 1";
        }
        else if (tablero[0][2].contains("X") && tablero[1][1].contains("X") && tablero[2][0].contains("X"))
        {
            return "GANO EL JUGADOR 1";
        }
        
        //Jugador 2
        if (tablero[0][0].contains("O") && tablero[0][1].contains("O") && tablero[0][2].contains("O")) 
        {
            return "GANO EL JUGADOR 2";
        }
        else if (tablero[1][0].contains("O") && tablero[1][1].contains("O") && tablero[1][2].contains("O"))
        {
            return "GANO EL JUGADOR 2";
        }
        else if (tablero[2][0].contains("O") && tablero[2][1].contains("O") && tablero[2][2].contains("O"))
        {
            return "GANO EL JUGADOR 2";
        }
        else if (tablero[0][0].contains("O") && tablero[1][0].contains("O") && tablero[2][0].contains("O"))
        {
            return "GANO EL JUGADOR 2";
        }
        else if (tablero[0][1].contains("O") && tablero[1][1].contains("O") && tablero[2][1].contains("O"))
        {
            return "GANO EL JUGADOR 2";
        }
        else if (tablero[0][2].contains("O") && tablero[1][2].contains("O") && tablero[2][2].contains("O"))
        {
            return "GANO EL JUGADOR 2";
        }
        else if (tablero[0][0].contains("O") && tablero[1][1].contains("O") && tablero[2][2].contains("O"))
        {
            return "GANO EL JUGADOR 2";
        }
        else if (tablero[0][2].contains("O") && tablero[1][1].contains("O") && tablero[2][0].contains("O"))
        {
            return "GANO EL JUGADOR 2";
        }
        else
        {
            return "";
        }
    }
}
