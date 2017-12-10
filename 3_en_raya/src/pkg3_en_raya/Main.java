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

public class Main 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int i = 1;
        System.out.println("Escribe nombre Jugador1");
        String nombrejugador1 = br.readLine();
        
        System.out.println("Escribe Nombre Jugador 2");
        String nombrejugador2 = br.readLine();
        
        tablero t = new tablero();

        t.crearTablero();
        t.imprimirtablero();
        
        while(i != 10) 
        {
            t.moverjugador1();
            System.out.println(t.wincheck());
            if(t.wincheck().equals("GANO EL JUGADOR 1")) 
            {
                System.out.println("Tablero Reseteado");
                t.crearTablero();
            }
            t.moverjugador2();
            System.out.println(t.wincheck());
            if(t.wincheck().equals("GANO EL JUGADOR 2")) 
            {
                System.out.println("Tablero Reseteado");
                t.crearTablero();
            }
            
            i++;
        }
        
        t.moverjugador1();
    }
}
