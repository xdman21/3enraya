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
    
    public String [][] tablero = new String[3][3];
    
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
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
                tablero[2][1] = "[X]";
                imprimirtablero();
                break;
            case 9:
                tablero[2][2] = "[X]";
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
                tablero[2][1] = "[O]";
                imprimirtablero();
                break;
            case 9:
                tablero[2][2] = "[O]";
                imprimirtablero();
                break;
        }
    }
    
    public String wincheck()
    {
        //Jugador 1
        int times = 0;
        int times2 = 0;
        for (int i = 0; i <= 2; i++) 
        {
                for (int j = 0; j <= 2; j++) 
                {
                    if(tablero[i][j].contains("X")) 
                    {
                        times++;
                        if(times == 3) 
                        {
                            return "GANO EL JUGADOR 1";
                        }
                    }
                }
                times = 0;
        }
        int j2 = 0;
        times = 0;
        for (int i = 0; i <= 2; i++) 
        {
            if(tablero[i][j2].contains("X")) 
            {
                times++;
                if(times == 3) 
                {
                    return "GANO EL JUGADOR 1";
                }
            }
            if(i == 2 && j2 != 2) 
            {
                i = -1;
                j2++;
                times = 0;
            }
        }
        if (tablero[0][0].contains("X") && tablero[1][1].contains("X") && tablero[2][2].contains("X"))
        {
            return "GANO EL JUGADOR 1";
        }
        else if (tablero[0][2].contains("X") && tablero[1][1].contains("X") && tablero[2][0].contains("X"))
        {
            return "GANO EL JUGADOR 1";
        }
        
        //Jugador 2
        for (int i = 0; i <= 2; i++) 
        {
                for (int j = 0; j <= 2; j++) 
                {
                    if(tablero[i][j].contains("O")) 
                    {
                        times2++;
                        if(times2 == 3) 
                        {
                            return "GANO EL JUGADOR 2";
                        }
                    }
                }
                times2 = 0;
        }
        j2 = 0;
        times2 = 0;
        for (int i = 0; i <= 2; i++) 
        {
            if(tablero[i][j2].contains("O")) 
            {
                times2++;
                if(times2 == 3) 
                {
                    return "GANO EL JUGADOR 2";
                }
            }
            if(i == 2 && j2 != 2) 
            {
                i = -1;
                j2++;
                times2 = 0;
            }
        }
        if (tablero[0][0].contains("O") && tablero[1][1].contains("O") && tablero[2][2].contains("O"))
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
