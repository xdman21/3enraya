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
public class tablero extends Jugador {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    protected static String[][] array = new String[6][9];
    protected static boolean[][] arraybool = new boolean[6][9];
    public tablero(String Jugador1, String Jugador2, String Jugador1name, String Jugador2name) 
    {
        super(Jugador1, Jugador2, Jugador1name, Jugador2name);
    }
    public void imprimirtablero() 
    {
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
                arraybool[i][j] = true;
                array[i][j] = " ";
                System.out.print(array[i][j]);
                }
            }
            System.out.println("");
            }
        }
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

    @Override
    public String win(String player) 
    {
        if(player.equals(super.Jugador1)) 
        {
        return "El Ganador es el Jugador "+super.Jugador1name;
        }
        if(player.equals(super.Jugador2)) 
        {
        return "El Ganador es el Jugador "+super.Jugador2name;
        }
        else 
        {
            return "";
        }
    }
}
